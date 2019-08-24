package com.codejoys.ssm.dto;

import com.codejoys.ssm.entity.Daily;

import java.util.List;

public class BaseReponse {
    private Long count;     // 数据库记录数
    private Long code;      // 业务上的响应码  00001   00004
    private String msg;     // 响应消息
    private List<Daily> data;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Daily> getData() {
        return data;
    }

    public void setData(List<Daily> data) {
        this.data = data;
    }
}
