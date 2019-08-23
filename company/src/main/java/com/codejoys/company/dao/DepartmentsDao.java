package com.codejoys.company.dao;

import com.codejoys.company.dto.DepartmentAvgSalaryDto;
import com.codejoys.company.entity.Departments;

import java.util.List;

// DAO: database access object
public interface DepartmentsDao {
    // 查询所有部门的名字和对应的部门经理的名字

    // 查询所在的部门的名字，关联查询对应的部门经理
    List<Departments> findAll();

    // - 查询每个部门的平均工资和部门号
    List<DepartmentAvgSalaryDto> findDepartmentAvgSalary();
}
