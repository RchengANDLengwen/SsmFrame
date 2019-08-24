package com.codejoys.ssm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {
        "com.codejoys.ssm.mapper",
        "com.codejoys.ssm.dao"
})
public class MybatisConfig {
}
