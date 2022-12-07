package com.weibo.dao;

import com.weibo.bean.Posts;
import com.weibo.bean.User;
import com.weibo.dao.impl.LikesDaoImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LikesDaoTest {

    private static LikesDaoImpl ld = new LikesDaoImpl();

    @Test
    public void addLike() {
        boolean b = ld.addLike(0, 7);
        System.out.println(b);
    }

    @Test
    public void cancelLike() {
        boolean b = ld.cancelLike(0, 7);
        System.out.println(b);
    }

    @Test
    public void getAllLikeUesr() {
        List<User> allLikeUesr = ld.getAllLikeUesr(7);
        System.out.println(allLikeUesr);
    }

    @Test
    public void getAllLikePosts() {
        List<Posts> allLikePosts = ld.getAllLikePosts(0);
        System.out.println(allLikePosts);
    }

    @Test
    public void getLikes() {
        long likes = ld.getLikes(7);
        System.out.println(likes);
    }
}