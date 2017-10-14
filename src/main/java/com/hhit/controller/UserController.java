package com.hhit.controller;
import com.hhit.model.User;
import com.hhit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        //System.out.println("springmvc测试成功！");
        //System.out.println("测试数据库连接"+user.getLoginname());
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
    /**
     * 处理用户密码修改
     * @param request 获取界面参数
     * @param response
     * @return
     * @throws Exception 抛出异常
     */
    @RequestMapping(value="/updatepassword")
    @ResponseBody
    public Map<String, Object> updatepassword(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session=request.getSession();
        String username=(String)session.getAttribute("username");
        user.setUsername(username);
        user.setPassword(request.getParameter("password"));
        Map<String,Object> map=new HashMap<String, Object>();
        if(request.getParameter("password")==null){
            map.put("msg","修改信息失败，请重新修改");
        }
        else{
            userservice.updatepass(user);
            map.put("msg","信息修改成功，请重新登录");
        }
        return map;
    }
    /**
     * 用户所有表的信息集合查询
     * @param modelMap 存储集合信息
     * @return
     */
    @RequestMapping(value="/userquery")
    public String userquery(ModelMap modelMap){
        List<User> userlist;
        userlist=userservice.userSearchall();
        modelMap.addAttribute("userlist",userlist);
        return "userquery";
    }


}
