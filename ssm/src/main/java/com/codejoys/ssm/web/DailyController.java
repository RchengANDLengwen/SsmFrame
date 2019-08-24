package com.codejoys.ssm.web;

import com.codejoys.ssm.dto.BaseReponse;
import com.codejoys.ssm.entity.Daily;
import com.codejoys.ssm.service.DailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DailyController {
    @Autowired
    DailyService service;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello...");
        return "index.html";
    }


    @GetMapping("/daily/list")
    @ResponseBody               // 直接把java对象序列化成json字符串
    public List<Daily> findAll() {
        List<Daily> data = service.findAll();
        return data;
    }


    @GetMapping("/daily/all")
    @ResponseBody
    public BaseReponse findList() {
        List<Daily> list = service.findAll();

        Long count = service.count();

        BaseReponse response = new BaseReponse();
        response.setCode(0L);
        response.setMsg("");
        response.setCount(count);
        response.setData(list);

        return response;
    }

    //   路径：    /daily
    //   参数：    id=1
    //   返回结果：
    //      {"id": 2, "title": "xxx", "created": "2018-10-10"},

    @GetMapping("/daily")
    @ResponseBody
    public Daily findById(@RequestParam("id") Integer sid) {
        return service.findById(sid);
    }
}
