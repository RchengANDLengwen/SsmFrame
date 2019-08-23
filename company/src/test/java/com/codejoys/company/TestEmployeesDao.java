package com.codejoys.company;

import com.codejoys.company.dao.DepartmentsDao;
import com.codejoys.company.dao.EmployeesDao;
import com.codejoys.company.entity.Departments;
import com.codejoys.company.entity.Employees;
import org.junit.Test;

import java.util.List;

public class TestEmployeesDao extends BaseTest {
    EmployeesDao mapper;
    
    @Override
    protected void initMapper() {
        mapper = session.getMapper(EmployeesDao.class);
    }

    @Test
    public void testNoTitle() {
        List<Employees> list = mapper.findWithoutTitle();

        list.forEach(e -> {
            System.out.println(e);
        });
    }
}
