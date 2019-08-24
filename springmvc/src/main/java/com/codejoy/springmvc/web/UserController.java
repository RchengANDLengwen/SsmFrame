package com.codejoy.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author lengwen
 * @Date 2019/8/23
 * @Version V1.0
 **/
@Controller
public class UserController {
    @GetMapping("/home")
    public String home(){
        return "home.html";
    }
    @PostMapping("/login")
    public String login(String username,String  password){
        System.out.println(username+password);

        return "redirect:success.html";
    }
    @GetMapping("/loginForm")
    public String loginForm(){
        return "login.html";
    }
    //pojo封装参数
    @PostMapping("/register")
    public String register(){
        return "redirect:register.html";
    }

    @GetMapping("/registerForm")
    public String registerForm(){
        return "register.html";
    }
}
