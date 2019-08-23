package com.codejoys.company;

import com.codejoys.company.entity.Employees;
import com.codejoys.company.entity.EmployeesExample;
import com.codejoys.company.mapper.EmployeesMapper;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEmployeesMapper extends BaseTest {
    EmployeesMapper mapper;

    
    @Test
    public void testFindAll() {
        Employees employees = mapper.selectByPrimaryKey(10001);
        
        System.out.println(employees);
    }

    @Test
    public void testCount() throws ParseException {
        // 计算employees表的总记录数
        // Example
        long count = mapper.countByExample(null);

        System.out.println(count);

        // 计算女员工有多少个
        EmployeesExample example = new EmployeesExample();
        example.createCriteria().andGenderEqualTo("F");

        // select * from employees where gender = 'F'
        long count1 = mapper.countByExample(example);
        System.out.println("女员工一共：" + count1);

        // 计算1962年03月03日后出生的女员工有多少个
        // yyyy MM 月  mm：分钟   HH：代表24小时制  hh：12小时制
        // DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse("1962-03-03");


        EmployeesExample example1 = new EmployeesExample();
        example1.createCriteria()
                .andGenderEqualTo("F")
                .andBirthDateGreaterThanOrEqualTo(date);

        // select * from employees where gender = 'F'
        long count2 = mapper.countByExample(example1);
        System.out.println(count2);
    }

    @Test
    public void testInsert() {
        Employees employees = new Employees();
        employees.setEmpNo(1116);
        employees.setBirthDate(new Date());
        employees.setFirstName("san");
        employees.setLastName("zhang");
//        employees.setGender("M");
        employees.setHireDate(new Date());

        // mapper.insert(employees);
        mapper.insertSelective(employees);
    }

    @Test
    public void update() {
        Employees employees = mapper.selectByPrimaryKey(1116);

        employees.setGender(null);

        // mapper.updateByPrimaryKeySelective(employees);
        mapper.updateByPrimaryKey(employees);


        Employees employees1 = new Employees();
        employees1.setEmpNo(1116);
        employees1.setLastName("sanfeng");
        mapper.updateByPrimaryKeySelective(employees1);
    }

    @Override
    protected void initMapper() {
        mapper = session.getMapper(EmployeesMapper.class);
    }
}
