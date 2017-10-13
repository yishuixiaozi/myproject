package com.hhit.service.impl;

import com.hhit.dao.UserDao;
import com.hhit.model.User;
import com.hhit.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="userservice")
public class UserServiceImpl implements UserService{
    @Resource
    UserDao userDao;
    @Override
    public User selectByusername(String username) {
        return userDao.selectByusername(username);
    }

    /**
     * 用户登陆
     * @param username
     * @param password
     * @return
     */
    @Override
    public User selectLogin(String username, String password) {
        return userDao.selectLogin(username, password);
    }

    @Override
    public User selectlogin(User user) {
        return null;
    }

    /**
     * 主页面密码修改
     * @param user
     */
    @Override
    public void updatepass(User user) {
        userDao.updatepass(user);
    }

    @Override
    public List<User> userSearchall() {
        return userDao.userSearchall();
    }
}
