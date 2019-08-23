package com.codejoys.company;

import com.codejoys.company.dao.DepartmentsDao;
import com.codejoys.company.dto.DepartmentAvgSalaryDto;
import com.codejoys.company.entity.Departments;
import com.codejoys.company.mapper.DepartmentsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TestDepartmentsDao extends BaseTest {
    DepartmentsDao mapper;
    @Override
    protected void initMapper() {
        mapper = session.getMapper(DepartmentsDao.class);
    }
    @Test
    public void testFindAll() {
        List<Departments> list = mapper.findAll();

        list.forEach(department -> {
            System.out.println(department);

            if (department.getManagers() != null) {
                department.getManagers().forEach(manager -> {
                    System.out.println("#### " + manager);
                });
            }
        });
    }



    @Test
    public void testAvgSalary() {
        List<DepartmentAvgSalaryDto> list = mapper.findDepartmentAvgSalary();
        list.forEach(i -> {
            System.out.println(i);
        });
    }
}
