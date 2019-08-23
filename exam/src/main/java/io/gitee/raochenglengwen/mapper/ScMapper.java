package io.gitee.raochenglengwen.mapper;

import io.gitee.raochenglengwen.entity.Sc;
import io.gitee.raochenglengwen.entity.ScExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sc
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    long countByExample(ScExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sc
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int deleteByExample(ScExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sc
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int deleteByPrimaryKey(@Param("sid") Integer sid, @Param("cid") Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sc
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int insert(Sc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sc
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int insertSelective(Sc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sc
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    List<Sc> selectByExample(ScExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sc
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    Sc selectByPrimaryKey(@Param("sid") Integer sid, @Param("cid") Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sc
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int updateByExampleSelective(@Param("record") Sc record, @Param("example") ScExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sc
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int updateByExample(@Param("record") Sc record, @Param("example") ScExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sc
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int updateByPrimaryKeySelective(Sc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sc
     *
     * @mbg.generated Wed Aug 21 20:25:49 CST 2019
     */
    int updateByPrimaryKey(Sc record);
}