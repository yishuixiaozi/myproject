package com.hhit.dao;

import com.hhit.model.User;

public interface UserDao {
    User selectByusername(String username);//被调用按用户名查询用户内容
}
