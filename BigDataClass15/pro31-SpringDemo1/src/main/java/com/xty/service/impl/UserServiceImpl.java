package com.xty.service.impl;

import com.xty.mapper.UserDao;
import com.xty.mapper.impl.UserDaoImpl;
import com.xty.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    // 留给Spring使用的 用来 给 userDao 注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        // Service 业务层的 业务方法 ，调用 Dao 层的方法来实现数据的操作
        userDao.addUser();
    }

    @Override
    public void deleteUser() {
        userDao.deleteUser();
    }

    @Override
    public void updateUser() {
        userDao.updateUser();
    }

    @Override
    public void selectUser() {
        userDao.selectUser();
    }
}
