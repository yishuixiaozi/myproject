package com.hhit.dao;

import com.hhit.model.User;

public interface UserDao {
    User selectByusername(String username);//被调用按用户名查询用户内容
    User selectLogin(String username,String password);//用户登陆
    User selectlogin(User user);//用户登陆传递对象
    void updatepass(User user);//用户密码修改
}
