package com.hhit.service;

import com.hhit.model.User;

public interface UserService {
    //按用户名查询用户测试
    User selectByusername(String username);
}
