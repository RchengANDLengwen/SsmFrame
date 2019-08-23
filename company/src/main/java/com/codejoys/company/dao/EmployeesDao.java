package com.codejoys.company.dao;

import com.codejoys.company.entity.Employees;
import com.codejoys.company.entity.Salaries;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeesDao {
    List<Employees> findWithoutTitle();
}
