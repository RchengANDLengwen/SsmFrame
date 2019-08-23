package com.codejoys.company;

import com.codejoys.company.entity.Departments;
import com.codejoys.company.entity.Employees;
import com.codejoys.company.entity.EmployeesExample;
import com.codejoys.company.mapper.DepartmentsMapper;
import com.codejoys.company.mapper.EmployeesMapper;
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

public class TestDepartmentsMapper extends BaseTest {
    DepartmentsMapper mapper;

    @Override
    protected void initMapper() {
        mapper = session.getMapper(DepartmentsMapper.class);
    }
}
