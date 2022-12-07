package com.weibo.dao;

import com.weibo.bean.User;
import com.weibo.dao.impl.UserDaoImpl;
import org.junit.Test;

import java.util.List;

public class UserDAOTest {

    private static UserDaoImpl udi;

    static {
        udi = new UserDaoImpl();
    }

    @Test
    public void getUser() {
        String uname = "xty456";
        User user = udi.getUser(uname);
        System.out.println(user);
    }

    @Test
    public void getAllUser() {
        List<User> allUser = udi.getAllUser();
        System.out.println(allUser);
    }

    @Test
    public void addUser() {
        User user = new User("xty666","123","邢庭玉");
        boolean b = udi.addUser(user);
        System.out.println(b);
    }

    @Test
    public void isExists() {
        String uname = "xty123";
        System.out.println("udi.isExists(uname) = " + udi.isExists(uname));
    }

    @Test
    public void updateUser() {
        User oldUser = udi.getUser("xty123");
        System.out.println(oldUser);
        User user = new User("xty888","123","小邢同学");
        boolean update = udi.updateUser(oldUser,user);
        System.out.println(update);

    }

    @Test
    public void deleteUser() {
        boolean abc123 = udi.deleteUser("abc123");
        System.out.println(abc123);
    }
}