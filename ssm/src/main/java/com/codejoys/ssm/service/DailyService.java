package com.codejoys.ssm.service;

import com.codejoys.ssm.entity.Daily;

import java.util.List;

public interface DailyService {
    List<Daily> findAll();

    Daily findById(Integer sid);

    Long count();
}
