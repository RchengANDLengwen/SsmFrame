package com.codejoys.company.mapper;

import com.codejoys.company.entity.Titles;
import com.codejoys.company.entity.TitlesExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TitlesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated
     */
    long countByExample(TitlesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated
     */
    int deleteByExample(TitlesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("empNo") Integer empNo, @Param("title") String title, @Param("fromDate") Date fromDate);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated
     */
    int insert(Titles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated
     */
    int insertSelective(Titles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated
     */
    List<Titles> selectByExample(TitlesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated
     */
    Titles selectByPrimaryKey(@Param("empNo") Integer empNo, @Param("title") String title, @Param("fromDate") Date fromDate);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Titles record, @Param("example") TitlesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Titles record, @Param("example") TitlesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Titles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Titles record);
}