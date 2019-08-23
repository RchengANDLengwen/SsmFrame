package io.gitee.hchaojie.mybatis;

import io.gitee.hchaojie.entity.Daily;
import io.gitee.hchaojie.entity.User;
import io.gitee.hchaojie.mapper.DailyMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TestMybatis {
    private SqlSession session;
    private DailyMapper dailyMapper;

    @Test
    public void testFindById() {
//        // 读取mybatis的配置文件
//        try {
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder()
//                    .build(Resources.getResourceAsStream("config.xml"));
//
//            // 创建连接（会话）
//            SqlSession session = factory.openSession();
//
//            // 获取数据库访问接口  （Mapper接口）
//            DailyMapper mapper = session.getMapper(DailyMapper.class);

        // 使用Mapper接口操作数据库
        Daily daily = dailyMapper.findById(12L);

        System.out.println(daily);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Test
    public void testFindList() {
        // 使用Mapper接口操作数据库
        List<Daily> list = dailyMapper.findList("今天%", "created desc");

        for (Daily d : list) {
            System.out.println(d);
        }
    }

    @Before         // @Before注解的方法，会在其它的单元测试方法之前执行
    public void setup() throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("config.xml"));

        // 创建连接（会话）
        session = factory.openSession();

        // 获取数据库访问接口  （Mapper接口）
        dailyMapper = session.getMapper(DailyMapper.class);
    }

    @Test
    public void testInsert() {
        Daily daily = new Daily();
        daily.setDigest("这是摘要");
        daily.setContent("内容。。。");
        // daily.setUid(1L);
        daily.setUpdatedBy(1L);
        daily.setViews(1);
        daily.setStars(1);
        daily.setFavorites(1);
        daily.setStatus('0');

        // insert() 过程：
        // 先执行insert语句
        // 再执行select last_insert_id()       => selectKey里面配置了order="AFTER"
        // 再把id设置到daily参数里面
        dailyMapper.insert(daily);


        System.out.println(daily);      // id已经被设置好了
    }

    @Test
    public void testDeleteById() {
        dailyMapper.deleteById(111L);
    }

    @Test
    public void testUpdate() {
        // 先查后改
        // Daily daily = dailyMapper.findById(12L);

        Daily daily = new Daily();
        daily.setId(12L);

        daily.setDigest("摘要");
        // daily.setContent("");
        daily.setCodeUrl("http://sina.com");

        dailyMapper.update(daily);
    }

    // 多个条件，在不同的对象里面
    @Test
    public void testFindByCreatedAndUserId() throws ParseException {
        Daily daily = new Daily();

        // 字符串转日期
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format.parse("2019-04-15 09:13:52");

        daily.setCreated(date);

        User user = new User();
        user.setId(1L);

        daily.setUser(user);

        dailyMapper.findByCreatedAndUserId(daily);
    }

    @Test
    public void testCount() {
        int count = dailyMapper.count();

        System.out.println("一共：" + count + " 条记录");
    }

    @After
    public void shutDown() {
        session.commit();
    }

    @Test
    public void testFindByDaily() throws ParseException {
        Daily daily = new Daily();

        // 字符串转日期
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format.parse("2019-04-15 09:13:52");
        daily.setCreated(date);
//
//        daily.setDigest("摘%");
//        daily.setContent("修%");

        dailyMapper.findByDaily(daily);
    }

    @Test
    public void testFindByIds() {
//        List<Long> ids = new ArrayList<Long>();
//        ids.add(12L);
//        ids.add(13L);
//        ids.add(14L);
//
//        dailyMapper.findByIds(ids);

        Long[] ids = {12L, 13L, 14L};

        dailyMapper.findByIds(ids);
    }
}
