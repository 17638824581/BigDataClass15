package com.weibo.dao;

import com.weibo.bean.Posts;
import com.weibo.bean.User;

import java.util.List;

public interface PostsDao {

    /**
     * 通过id获取帖子
     * @param id: 
     * @return Posts
     * @author Mr.yu
     * @date 2022/11/24 8:24
     */
    Posts getPosts(int id);

    /**
     * 通过用户及标题获取帖子
     * @param user: 
	 * @param title: 
     * @return Posts
     * @author Mr.yu
     * @date 2022/11/24 22:01
     */
    Posts getPosts(User user, String title);

    /**
     * 获取全部帖子
     * @param :
     * @return List<Posts>
     * @author Mr.yu
     * @date 2022/11/24 8:25
     */
    List<Posts> getAllPosts();

    /**
     * 以点赞数倒序分页获取帖子
     * @param :
     * @return List<Posts>
     * @author Mr.yu
     * @date 2022/11/28 23:50
     */
    List<Posts> getPosts(int offset, int len);

    /**
     * 获取指定用户的所有帖子
     * @param user: 
     * @return List<Posts>
     * @author Mr.yu
     * @date 2022/11/24 8:58
     */
    List<Posts> getUserAllPosts(User user);

    /**
     * 添加帖子
     * @param : 
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/24 8:25
     */
    boolean addPosts(Posts p);

    
    /**
     * 以指定用户添加帖子
     * @param user: 
     * @param title: 
     * @param body: 
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/24 8:27
     */
    boolean addPosts(User user, String title, String body);

    /**
     * 通过id删除帖子
     * @param id: 
     * @return boolean
     * @author Mr.yu
     * @date 2022/11/24 8:35
     */
    boolean deletePosts(int id);
    

}
