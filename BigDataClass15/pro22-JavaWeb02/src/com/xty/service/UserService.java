package com.xty.service;

import com.xty.bean.User;
import com.xty.dao.impl.UserDaoImpl;

import java.util.List;

/**
 * 针对于 user 表的服务类
 * @author Mr.yu
 * @date 2023/2/20 17:02
 */
public class UserService {

    /**
     * 注册用户服务
     * @param username: 
     * @param password: 
     * @param email:
     * @return boolean
     * @author Mr.yu
     * @date 2023/2/20 17:04
     */
    public boolean register(String username,String password,String email){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);

        UserDaoImpl userDao = new UserDaoImpl();
        int add = userDao.add(user);

        return add == 1;
    }

    /**
     *  获取所有用户信息
     */
    public List<User> getAllUser(){
        UserDaoImpl userDao = new UserDaoImpl();
        List<User> users = userDao.sllectAll();
        return users;
    }
}
