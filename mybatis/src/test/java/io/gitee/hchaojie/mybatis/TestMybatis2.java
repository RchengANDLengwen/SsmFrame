package io.gitee.hchaojie.mybatis;

import io.gitee.hchaojie.entity.Address;
import io.gitee.hchaojie.mapper.AddressMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class TestMybatis2 {
    private SqlSession session;
    private AddressMapper addressMapper;


    @Before         // @Before注解的方法，会在其它的单元测试方法之前执行
    public void setup() throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("config.xml"));

        // 创建连接（会话）
        session = factory.openSession();

        // 获取数据库访问接口  （Mapper接口）
        addressMapper = session.getMapper(AddressMapper.class);
    }

    @Test
    public void testInsert() {
        Address address = new Address();

        // address.setUuid("");

        // select key 配置为order="BEFORE"
        // 先执行 select uuid()
        // 把uuid设置到address对象里面去
        // 再执行insert语句
        address.setContent("金融港四路");

        addressMapper.insert(address);
    }

    @After
    public void shutDown() {
        session.commit();
        session.close();
    }
}
