package com.weibo.dao;

import com.weibo.bean.User;
import com.weibo.dao.impl.BaseDaoImpl;
import com.weibo.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

public class BaseDaoTest {

    private static BaseDao bd;

    static {
        bd = new BaseDaoImpl();
    }

    @Test
    public void update() {
        String sql = "insert into `user`(`username`,`password`,`name`) values(?,?,?);";
        Connection conn = JdbcUtils.getConn();
        int update = bd.update(conn, sql, "abc123", "123456", "张三");
        System.out.println(update);
    }

    @Test
    public void queryOne() {
        String sql = "select * from `user` where `id` = ?;";
        Connection conn = JdbcUtils.getConn();
        User user = bd.queryOne(User.class, conn, sql, 1);
        System.out.println(user);
    }

    @Test
    public void queryAll() {
        String sql = "select * from `user`;";
        Connection conn = JdbcUtils.getConn();
        List<User> users = bd.queryAll(User.class, conn, sql);
        System.out.println(users);
    }

    @Test
    public void queryValue() {
        String sql = "select count(`id`) from `user`;";
        Connection conn = JdbcUtils.getConn();
        Object o = bd.queryValue(conn, sql);
        System.out.println(o);
    }
}