package com.codejoys.mapper;

public interface DailyMapper {
    /**
     * fetch data by rule id
     *
     * @param ruleId rule id
     * @param page page number
     * @param jsonContext json format context
     * @return Result<XxxxDO>
     */
    void findAll();
    /**
     * fetch data by rule id
     *
     * @param ruleId rule id
     * @param page page number
     * @param jsonContext json format context
     * @return Result<XxxxDO>
     */
    void findById();
    /**
     * fetch data by rule id
     *
     * @param ruleId rule id
     * @param page page number
     * @param jsonContext json format context
     * @return Result<XxxxDO>
     */
    void deleteById(Long id);
}
