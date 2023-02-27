package com.dahua.service;

import com.dahua.bean.User;

import java.util.List;

public interface UserService {

    /**
     * 添加用户
     * @return
     */
    boolean add(User user);

    /**
     * 查询所有
     * @return
     */
    List<User> selectAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User selectById(int id);

    /**
     * 根据账号查询
     * @param username
     * @return
     */
    User selectByUsername(String username);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    boolean deleteById(int id);

    /**
     * 更新用户
     * @param id
     * @param newUser
     * @return
     */
    boolean update(int id, User newUser);
}
