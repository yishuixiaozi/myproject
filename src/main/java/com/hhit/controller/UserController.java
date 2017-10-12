package com.hhit.controller;

import com.hhit.model.User;
import com.hhit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value="/user")
public class UserController {

    @Resource
    private UserService userservice;

    User user=new User();

    /**
     * 测试部分模块
     * @return
     */
    @RequestMapping(value="/login")
    public String test(){
        user=userservice.selectByusername("zxr");
        System.out.println("springmvc测试成功！");
        System.out.println("测试数据库连接"+user.getLoginname());
        return "login";
    }

}
