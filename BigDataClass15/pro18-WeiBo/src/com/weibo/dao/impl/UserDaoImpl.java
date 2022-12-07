package com.weibo.dao.impl;

import com.weibo.bean.User;
import com.weibo.dao.UserDao;
import com.weibo.utils.JdbcUtils;

import java.sql.Connection;
import java.util.List;

public class UserDaoImpl extends BaseDaoImpl implements UserDao {
    @Override
    public User getUser(String username) {
        Connection conn = JdbcUtils.getConn();
        String sql = "select * from `user` where username = ?";
        User user = queryOne(User.class, conn, sql, username);
        JdbcUtils.close(conn);
        return user;
    }

    @Override
    public User getUser(int id) {
        Connection conn = JdbcUtils.getConn();
        String sql = "select * from `user` where id = ?";
        User user = queryOne(User.class, conn, sql, id);
        JdbcUtils.close(conn);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        Connection conn = JdbcUtils.getConn();
        String sql = "select * from `user`;";
        List<User> users = queryAll(User.class, conn, sql);
        JdbcUtils.close(conn);
        return users;
    }

    @Override
    public boolean addUser(User user) {
        Connection conn = JdbcUtils.getConn();
        String sql = "insert into `user`(`username`,`password`,`name`) values(?,?,?);";
        int update = update(conn, sql, user.getUsername(), user.getPassword(), user.getName());
        JdbcUtils.close(conn);
        return update>0;
    }

    @Override
    public boolean isExists(String username) {
        Connection conn = JdbcUtils.getConn();
        String sql = "select * from `user` where `username` = ?";
        User user = queryOne(User.class, conn, sql, username);
        JdbcUtils.close(conn);
        return user != null;
    }

    @Override
    public boolean updateUser(User oldUser, User newUser) {
        Connection conn = JdbcUtils.getConn();
        String sql = "update `user` set `username`=?,`password`=?,`name`=? where `username` = ?";
        int update = update(conn, sql, newUser.getUsername(), newUser.getPassword(), newUser.getName(), oldUser.getUsername());
        JdbcUtils.close(conn);
        return update>0;
    }

    @Override
    public boolean deleteUser(String username) {
        Connection conn = JdbcUtils.getConn();
        String sql = "delete from `user` where username = ?";
        int update = update(conn, sql, username);
        return update>0;
    }
}
