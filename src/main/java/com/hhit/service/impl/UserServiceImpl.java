package com.hhit.service.impl;

import com.hhit.dao.UserDao;
import com.hhit.model.User;
import com.hhit.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value="userservice")
public class UserServiceImpl implements UserService{
    @Resource
    UserDao userDao;
    @Override
    public User selectByusername(String username) {
        return userDao.selectByusername(username);
    }
}
