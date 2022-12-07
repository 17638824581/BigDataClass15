package com.weibo.dao;

import com.weibo.bean.User;

import java.util.List;

public interface ConcernDao {

    /**
     * 关注用户
     * @param a_id: 要关注的作者id
     * @param u_id: 本人id
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/28 21:44
     */
    boolean addConcern(int a_id,int u_id);

    /**
     * 取消关注
     * @param a_id: 关注的作者id
     * @param u_id: 本人id
     * @author Mr.yu
     * @date 2022/11/28 21:46
     */
    boolean unfollow(int a_id,int u_id);

    /**
     * 查询某个用户关注的所有用户
     * @param u_id: 用户id
     * @return
     * @author Mr.yu
     * @date 2022/11/28 21:46
     */
    List<User> getAllConcernUser(int u_id);
    
    /**
     * 查询所有关注某个用户的用户
     * @param u_id: 
     * @return List<User>
     * @author Mr.yu
     * @date 2022/11/29 11:12
     */
    List<User> getAllFans(int u_id);
    
    /**
     * 查询指定用户的粉丝数
     * @param u_id: 
     * @return long
     * @author Mr.yu
     * @date 2022/11/29 11:14
     */
    long getAllFansNum(int u_id);
}
