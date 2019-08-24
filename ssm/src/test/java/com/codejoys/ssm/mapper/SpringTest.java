package com.codejoys.ssm.mapper;

import com.codejoys.ssm.mapper.DailyMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTest {
    @Autowired
    DailyMapper mapper;

    @Test
    public void test() {
        System.out.println(mapper.countByExample(null));
    }
}
