package com.weibo.dao;

import com.weibo.bean.Posts;
import com.weibo.bean.User;

import java.util.List;

public interface LikesDao {

    /**
     * 添加喜欢的帖子
     * @param u_id: 用户id
	 * @param p_id: 帖子id
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/28 22:13
     */
    boolean addLike(int u_id, int p_id);

    /**
     * 取消喜欢
     * @param u_id: 
	 * @param p_id: 
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/28 22:14
     */
    boolean cancelLike(int u_id, int p_id);
    
    /**
     * 获取喜欢指定帖子所有用户
     * @param p_id: 
     * @return List<User>
     * @author Mr.yu
     * @date 2022/11/28 22:16
     */
    List<User> getAllLikeUesr(int p_id);

    /**
     * 获取指定用户所有喜欢的帖子
     * @param u_id
     * @return
     */
    List<Posts> getAllLikePosts(int u_id);

    /**
     * 获取指定帖子的喜欢数
     *
     * @param p_id:
     * @return int
     * @author Mr.yu
     * @date 2022/11/28 22:17
     */
    long getLikes(int p_id);
}
