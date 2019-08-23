package com.codejoys.framework;

import com.codejoys.entity.Daily;
import com.codejoys.mapper.DailyMapper;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Framework {
    private Map<String, String> config = new HashMap<>();
    private Map<String, Statment> sqls = new HashMap<>();

    public Framework(String configName) {
        // 读取配置文件，加载数据库连接信息
        URI uri = null;
        try {
            uri = getClass().getClassLoader().getResource(configName).toURI();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        // 加载config.txt配置文件
        try {
            List<String> strings = Files.readAllLines(Paths.get(uri));
            System.out.println(strings);

            for (String line : strings) {
                String[] split = line.split("=");

                config.put(split[0], split[1]);

                // 加载sql映射文件
                if ("mappers".equals(split[0])) {
                    parseMapper(split[1]);
                }
            }
            
            System.out.println(sqls);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 加载映射文件，读取所有的sql语句

    /**
     *
     * @param s - DailyMapper.txt;KeywordMapper.txt
     */
    private void parseMapper(String s) {
        String[] split = s.split(";");
        for (String fileName : split) {
            // 读取配置文件，加载数据库连接信息
            URI uri = null;
            try {
                uri = getClass().getClassLoader().getResource(fileName).toURI();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }

            // 加载DailyMapper.txt映射文件
            List<String> strings = null;
            try {
                strings = Files.readAllLines(Paths.get(uri));
                // line: findAll:select * from daily:com.xxx.Daily
                for (String line : strings) {
                    String[] data = line.split(":");

                    String resultType = data.length == 2 ? null : data[2];
                    Statment statment = new Statment(data[0], data[1], resultType);

                    sqls.put(data[0], statment);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Connection openConnection() {
        // 加载驱动
        try {
            Class.forName(config.get("jdbc.driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 获取连接
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    config.get("jdbc.url"),
                    config.get("jdbc.username"),
                    config.get("jdbc.password")
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    /**
     * 执行映射文件里面的某条sql语句
     * @param sqlId - findAll, deleteId
     */
    public void execute(String sqlId, Object[] args) {
        Connection connection = openConnection();

        // String sql = sqls.get(sqlId);
        // sqlId, sql, resultType
        Statment statment = sqls.get(sqlId);

        // 把sql语句里面的参数设置好
        String sql = statment.sql;
        sql = sql.replaceFirst("#\\{.+\\}", String.valueOf(args[0]));

        try {
            if (statment.resultType == null || statment.resultType.length() == 0) {
                // 执行增、删、改
                connection.prepareStatement(sql).execute();
            } else {
                // 查询
                ResultSet resultSet = connection.prepareStatement(sql).executeQuery();

                while (resultSet.next()) {
                    System.out.println(resultSet.getLong("id"));
                    System.out.println(resultSet.getString("summary"));
                }

                // 反射

                Daily daily = new Daily();
                daily.setId(resultSet.getLong("id"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 使用动态代理，从Mapper接口创建一个代理对象
    public DailyMapper getMapper(Class<DailyMapper> clazz) {
        return (DailyMapper) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[]{clazz},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // System.out.println("调用的方法的名字：" + method.getName());

                        // 根据方法的名字，取到对应的sql语句
                        // String sql = sqls.get(method.getName());

                        System.out.println("方法参数：" + Arrays.toString(args));

                        // 执行sql语句
                        execute(method.getName(), args);
                        
                        return null;
                    }
                }
        );
    }
}
