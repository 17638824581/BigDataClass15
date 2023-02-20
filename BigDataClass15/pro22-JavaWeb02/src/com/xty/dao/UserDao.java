package com.xty.dao;

import com.xty.bean.User;

/**
 * 针对于 user 表的 Dao操作类
 * @author Mr.yu
 * @date 2023/2/20 16:48
 */
public interface UserDao {
    
    /**
     * 接收一个 user 对象存储到数据库中
     * @param user: 
     * @return int
     * @author Mr.yu
     * @date 2023/2/20 16:49
     */
    int add(User user);
    
    /**
     * 通过id删除用户
     * @param id: 
     * @return int
     * @author Mr.yu
     * @date 2023/2/20 16:49
     */
    int delete(int id);
    
    /**
     * 使用新的 user 对象更新指定 id 的 user 信息
     * @param old_id: 
	 * @param new_user: 
     * @return int
     * @author Mr.yu
     * @date 2023/2/20 16:50
     */
    int update(int old_id,User new_user);

    /**
     * 根据 id 查询用户数据
     * @param id:
     * @return User
     * @author Mr.yu
     * @date 2023/2/20 16:51
     */
    User selectById(int id);
    
    /**
     * 根据 username 查询用户数据
     * @param username: 
     * @return User
     * @author Mr.yu
     * @date 2023/2/20 16:52
     */
    User selectByUsername(String username);
    
    /**
     * 根据 email 查询用户数据
     * @param email: 
     * @return User
     * @author Mr.yu
     * @date 2023/2/20 16:53
     */
    User selectByEamil(String email);
}
