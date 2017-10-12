package com.hhit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UserController {

    @RequestMapping(value="/login")
    public String test(){
        System.out.println("springmvc测试成功！");
        return "login";
    }

}
