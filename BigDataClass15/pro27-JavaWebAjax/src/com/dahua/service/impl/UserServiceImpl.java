package com.dahua.service.impl;

import com.dahua.bean.User;
import com.dahua.dao.UserDao;
import com.dahua.dao.impl.UserDaoImpl;
import com.dahua.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @Override
    public boolean add(User user) {
        UserDao userDao = new UserDaoImpl();
        int add = userDao.add(user);
        return add == 1;
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<User> selectAll() {
        UserDao userDao = new UserDaoImpl();
        List<User> users = userDao.selectAll();
        return users;
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public User selectById(int id) {
        UserDao userDao = new UserDaoImpl();
        User user = userDao.selectById(id);
        return user;
    }

    /**
     * 根据账号查询
     *
     * @param username
     * @return
     */
    @Override
    public User selectByUsername(String username) {
        UserDao userDao = new UserDaoImpl();
        User user = userDao.selectByUserName(username);
        return user;
    }

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteById(int id) {
        UserDao userDao = new UserDaoImpl();
        int i = userDao.deleteById(id);
        return i == 1;
    }

    /**
     * 更新用户
     *
     * @param id
     * @param newUser
     * @return
     */
    @Override
    public boolean update(int id, User newUser) {
        UserDao userDao = new UserDaoImpl();
        int i = userDao.update(id,newUser);
        return i == 1;
    }
}
