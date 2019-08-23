package io.gitee.raochenglengwen.mapper;

import io.gitee.raochenglengwen.entity.Student;
import io.gitee.raochenglengwen.entity.StudentExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    long countByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int deleteByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    List<Student> selectByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    Student selectByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int updateByPrimaryKey(Student record);
}