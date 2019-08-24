package com.codejoys.ssm.service.impl;

import com.codejoys.ssm.entity.Daily;
import com.codejoys.ssm.mapper.DailyMapper;
import com.codejoys.ssm.service.DailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyServiceImpl implements DailyService {
    @Autowired
    DailyMapper mapper;

    @Override
    public List<Daily> findAll() {
        return mapper.selectByExample(null);
    }

    @Override
    public Daily findById(Integer sid) {
        return mapper.selectByPrimaryKey(Long.valueOf(sid));
    }

    @Override
    public Long count() {
        return mapper.countByExample(null);
    }
}
