package com.dahua.dao;

import com.dahua.bean.User;

import java.util.List;

public interface UserDao {

    /**
     * 添加新用户
     * @param user
     * @return
     */
    int add(User user);

    /**
     * 更新除了 id 外的用户信息
     * @param id
     * @param newuser
     * @return
     */
    int update(int id, User newuser);

    /**
     * 通过 id 删除用户
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAll();

    /**
     * 通过昵称查找用户
     * @return
     */
    List<User> selectByName(String name);

    /**
     * 通过id查询用户
     * @param id
     * @return
     */
    User selectById(int id);

    /**
     * 通过用户名查询用户
     * @param username
     * @return
     */
    User selectByUserName(String username);
}
