package com.codejoys.company.mapper;

import com.codejoys.company.entity.Salaries;
import com.codejoys.company.entity.SalariesExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalariesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated
     */
    long countByExample(SalariesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated
     */
    int deleteByExample(SalariesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("empNo") Integer empNo, @Param("fromDate") Date fromDate);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated
     */
    int insert(Salaries record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated
     */
    int insertSelective(Salaries record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated
     */
    List<Salaries> selectByExample(SalariesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated
     */
    Salaries selectByPrimaryKey(@Param("empNo") Integer empNo, @Param("fromDate") Date fromDate);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Salaries record, @Param("example") SalariesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Salaries record, @Param("example") SalariesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Salaries record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaries
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Salaries record);
}