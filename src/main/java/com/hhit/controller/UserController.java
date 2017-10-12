package com.hhit.controller;

import com.hhit.model.User;
import com.hhit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    @RequestMapping(value="/login1")
    public String test(){
        user=userservice.selectByusername("zxr");
        System.out.println("springmvc测试成功！");
        System.out.println("测试数据库连接"+user.getLoginname());
        return "login";
    }
    /**
     * 处理用户登陆请求
     * @param user1 前台传递过来的对象
     * @param request session赋值
     * @param session
     * @return
     */
    @RequestMapping(value="/login")
    @ResponseBody
    public String login( User user1, HttpServletRequest request,HttpSession session){
        String msg="";
        User user2=userservice.selectByusername(user1.getUsername());
        if(user2==null){
            msg="wrong";
        }
        else{
            session=request.getSession();
            session.setAttribute("username",user2.getUsername());
            session.setAttribute("loginname",user2.getLoginname());
            if(user1.getPassword().equals(user2.getPassword())){
                msg="right";
            }
            else{
                msg="wrong";
            }
        }
        return msg;
    }
}
