package com.codejoys.company.mapper;

import com.codejoys.company.entity.DeptEmpLatestDate;
import com.codejoys.company.entity.DeptEmpLatestDateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptEmpLatestDateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp_latest_date
     *
     * @mbg.generated
     */
    long countByExample(DeptEmpLatestDateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp_latest_date
     *
     * @mbg.generated
     */
    int deleteByExample(DeptEmpLatestDateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp_latest_date
     *
     * @mbg.generated
     */
    int insert(DeptEmpLatestDate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp_latest_date
     *
     * @mbg.generated
     */
    int insertSelective(DeptEmpLatestDate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp_latest_date
     *
     * @mbg.generated
     */
    List<DeptEmpLatestDate> selectByExample(DeptEmpLatestDateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp_latest_date
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DeptEmpLatestDate record, @Param("example") DeptEmpLatestDateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp_latest_date
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DeptEmpLatestDate record, @Param("example") DeptEmpLatestDateExample example);
}