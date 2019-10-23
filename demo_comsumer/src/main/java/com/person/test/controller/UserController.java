package com.person.test.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.person.test.bean.User;
import com.person.test.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "Im test Url";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public User queryUser(){
        User user = userService.queryUser();
        return user;
    }



}
