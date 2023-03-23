package com.xty.mapper.impl;

import com.xty.mapper.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("添加用户成功！");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除成功！");
    }

    @Override
    public void selectUser() {
        System.out.println("查询成功！");
    }

    @Override
    public void updateUser() {
        System.out.println("更新成功！");
    }
}
