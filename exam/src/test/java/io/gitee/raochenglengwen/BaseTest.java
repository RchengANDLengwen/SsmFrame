package io.gitee.raochenglengwen;/**
 * 需求：
 * <p>
 * 分析：
 *
 * @param args
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;

/**
 * @ClassName BaseTest
 * @Description: TODO
 * @Author lengwen
 * @Date 2019/8/22 
 * @Version V1.0
 **/
public abstract class BaseTest {
    protected SqlSession session;

    @Before
    public void setup() {
        try {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                    .build(Resources.getResourceAsReader("config.xml"));

            session = factory.openSession();

            // mapper = session.getMapper(DepartmentsDao.class);
            // 模板方法（设计模式）
            initMapper();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract void initMapper();

    @After
    public void shutDown() {
        if (session != null) {
            session.commit();

        }
    }
}
