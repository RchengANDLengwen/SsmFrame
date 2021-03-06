package com.codejoys.company.mapper;

import com.codejoys.company.entity.ViewEmp;
import com.codejoys.company.entity.ViewEmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewEmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_emp
     *
     * @mbg.generated
     */
    long countByExample(ViewEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_emp
     *
     * @mbg.generated
     */
    int deleteByExample(ViewEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_emp
     *
     * @mbg.generated
     */
    int insert(ViewEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_emp
     *
     * @mbg.generated
     */
    int insertSelective(ViewEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_emp
     *
     * @mbg.generated
     */
    List<ViewEmp> selectByExample(ViewEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_emp
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ViewEmp record, @Param("example") ViewEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_emp
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ViewEmp record, @Param("example") ViewEmpExample example);
}