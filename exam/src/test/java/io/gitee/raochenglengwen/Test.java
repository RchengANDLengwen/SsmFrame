package io.gitee.raochenglengwen;/**
 * 需求：
 * <p>
 * 分析：
 *
 * @param args
 */

import io.gitee.raochenglengwen.dao.CourseDao;
import io.gitee.raochenglengwen.entity.Course;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.Before;

import java.io.IOException;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author lengwen
 * @Date 2019/8/21 
 * @Version V1.0
 **/
public class Test extends BaseTest{
    CourseDao mapper;

    @Override
    protected void initMapper() {
        mapper = session.getMapper(CourseDao.class);
    }

    @org.junit.Test
    public void test1() {
        Course course = mapper.selectint_course(1);
        System.out.println(course);
    }
}
