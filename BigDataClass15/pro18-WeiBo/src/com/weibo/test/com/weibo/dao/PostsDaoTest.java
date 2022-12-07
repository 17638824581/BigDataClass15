package com.weibo.dao;

import com.weibo.bean.Posts;
import com.weibo.bean.User;
import com.weibo.dao.impl.PostsDaoImpl;
import com.weibo.dao.impl.UserDaoImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PostsDaoTest {

    private static PostsDao pd;

    static {
        pd = new PostsDaoImpl();
    }

    @Test
    public void getPosts() {
        Posts posts = pd.getPosts(5);
        System.out.println(posts);
    }

    @Test
    public void testGetPosts() {
        User user = new UserDaoImpl().getUser(0);
        String title = "测试";
        Posts posts = pd.getPosts(user,title);
        System.out.println(posts);
    }

    @Test
    public void getAllPosts() {
        List<Posts> allPosts = pd.getAllPosts();
        System.out.println(allPosts);
    }

    @Test
    public void getUserAllPosts() {
        User user = new UserDaoImpl().getUser(0);
        List<Posts> userAllPosts = pd.getUserAllPosts(user);
        System.out.println(userAllPosts);
    }

    @Test
    public void addPosts() {
        Posts posts = new Posts(0,"测试2","哈哈哈哈！");
        boolean b = pd.addPosts(posts);
        System.out.println(b);
    }

    @Test
    public void testAddPosts() {
        User user = new UserDaoImpl().getUser(0);
        boolean b = pd.addPosts(user, "测试3", "呵呵呵呵");
        System.out.println(b);
    }

    @Test
    public void deletePosts() {
        Posts posts = pd.getAllPosts().get(0);
        boolean b = pd.deletePosts(posts.getId());
        System.out.println(b);
    }
}