package com.codejoys.company;

import com.codejoys.company.dao.DepartmentsDao;
import com.codejoys.company.dao.SalariesDao;
import com.codejoys.company.entity.Departments;
import com.codejoys.company.entity.Salaries;
import org.junit.Test;

import java.util.List;

public class TestSalariesDao extends BaseTest {
    SalariesDao mapper;
    
    @Test
    public void testFindAll() {
        List<Salaries> list = mapper.getByName("Tonny", "Butterworth");
        list.forEach(s -> {
            System.out.println(s);
        });
    }

    @Override
    protected void initMapper() {
        mapper = session.getMapper(SalariesDao.class);
    }
}
