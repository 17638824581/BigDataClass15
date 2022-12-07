package com.weibo.dao;

import com.weibo.bean.User;

import java.util.List;

public interface UserDao {
    /**
     * 通过用户名获取User对象
     * @param username: 
     * @return User
     * @author Mr.yu
     * @date 2022/11/23 22:20
     */
    User getUser(String username);

    /**
     * 通过id获取User对象
     * @param id:
     * @return User
     * @author Mr.yu
     * @date 2022/11/23 22:20
     */
    User getUser(int id);
    
    /**
     * 获取所有的用户信息
     * @param : 
     * @return List<User>
     * @author Mr.yu
     * @date 2022/11/23 22:34
     */
    List<User> getAllUser();
    
    /**
     * 添加用户
     * @param user: 
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/23 22:21
     */
    boolean addUser(User user);

    /**
     * 返回指定用户名是否存在
     * @param username: 
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/23 22:23
     */
    boolean isExists(String username);
    
    /**
     * 更新用户信息
     * @param oldUser: 
	 * @param newUser: 
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/23 22:37
     */
    boolean updateUser(User oldUser, User newUser);

    /**
     * 根据用户名删除用户
     * @param username:
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/23 22:37
     */
    boolean deleteUser(String username);
}
