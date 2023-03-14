package com.xty.service.impl;

import com.xty.dao.UserDao;
import com.xty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("UserService save() 执行.....");
        // 要调用 UserDao 的 save() 方法
        userDao.save();
    }
}
