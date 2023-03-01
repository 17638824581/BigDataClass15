package com.dahua.dao;

import com.dahua.bean.User;
import com.dahua.dao.impl.UserDaoImpl;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    private static UserDao userDao = new UserDaoImpl();

    @Test
    public void add() {

        User user = new User();
        user.setName("小黑子");
        user.setUsername("xiaoheizi");
        user.setPassword("123");
        user.setEmail("jj@qq.com");

        int i = userDao.add(user);

        System.out.println("i = " + i);
    }

    @Test
    public void update() {
        int id = 1;
        User user = new User();
        user.setName("小邢");
        user.setUsername("xiaoxing");
        user.setPassword("456");
        user.setEmail("xx@qq.com");

        int update = userDao.update(1, user);

        System.out.println("update = " + update);
    }

    @Test
    public void deleteById() {
        int id = 1;
        int i = userDao.deleteById(id);
        System.out.println("i = " + i);
    }

    @Test
    public void selectAll() {
        List<User> users = userDao.selectAll();

        System.out.println("users = " + users);
    }

    @Test
    public void selectByName() {
        String name = "黑";
        List<User> users = userDao.selectByName(name);
        System.out.println("users = " + users);
    }

    @Test
    public void selectById() {
        int id = 1;
        User user = userDao.selectById(id);
        System.out.println("user = " + user);
    }

    @Test
    public void selectByUserName() {
        String username = "xiaoheizi";
        User user = userDao.selectByUserName(username);
        System.out.println("user = " + user);
    }
}