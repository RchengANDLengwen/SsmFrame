package com.codejoys;

import com.codejoys.framework.Framework;
import com.codejoys.mapper.DailyMapper;
import org.junit.Test;

import java.util.Arrays;

public class TestMapper {
    @Test
    public void test() {
        Framework framework = new Framework("config.txt");

        DailyMapper mapper = framework.getMapper(DailyMapper.class);

        mapper.findAll();
    }

    @Test
    public void test2() {
        Framework framework = new Framework("config.txt");
        DailyMapper mapper = framework.getMapper(DailyMapper.class);

        mapper.findById();
    }

    @Test
    public void test3() {
        Framework framework = new Framework("config.txt");
        DailyMapper mapper = framework.getMapper(DailyMapper.class);

        mapper.deleteById(12L);
    }
    
    @Test
    public void testSplit() {
        String[] split = "deleteById:delete from daily where id = #{id}:".split(":");
        System.out.println(split.length);
        System.out.println(Arrays.toString(split));
    }

    @Test
    public void testArgs() {
        String sql = "delete from daily where id = #{id}";
        Object[] args = {12};

        // ==> delete from daily where id = 12

        // 字符串替换，正则表达式替换, .代表任意字符，*表示出现0次以上，+表示出现一次以上
        String result = sql.replaceFirst("#\\{.+\\}", String.valueOf(args[0]));

        System.out.println(result);
    }
}
