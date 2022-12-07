package com.weibo.dao;

import com.weibo.bean.User;
import com.weibo.dao.impl.ConcernDaoImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ConcernDaoTest {

    private static ConcernDaoImpl cd;

    static{
        cd = new ConcernDaoImpl();
    }

    @Test
    public void addConcern() {
        boolean b = cd.addConcern(3, 5);
        System.out.println(b);
    }

    @Test
    public void unfollow() {
        boolean b = cd.unfollow(3, 5);
        System.out.println(b);
    }

    @Test
    public void getAllConcernUser() {
        List<User> allConcernUser = cd.getAllConcernUser(3);
        System.out.println(allConcernUser);
    }
}