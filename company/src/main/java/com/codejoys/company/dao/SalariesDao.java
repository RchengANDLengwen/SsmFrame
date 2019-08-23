package com.codejoys.company.dao;

import com.codejoys.company.entity.Salaries;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalariesDao {
    List<Salaries> getByName(@Param("firstName") String firstName,
                             @Param("lastName") String lastName);
}
