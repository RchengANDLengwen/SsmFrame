package com.codejoys.ssm.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDailyMapper {
    @Autowired
    DailyMapper mapper;

    @Test
    public void testFindAll() {
        mapper.selectByExample(null).forEach(daily -> {
            System.out.println(daily);
        });
    }
}
