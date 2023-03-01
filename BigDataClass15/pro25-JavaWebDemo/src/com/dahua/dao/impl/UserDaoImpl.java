package com.dahua.dao.impl;

import com.dahua.bean.User;
import com.dahua.dao.BaseDao;
import com.dahua.dao.UserDao;
import com.dahua.util.JdbcUtil;

import java.sql.Connection;
import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {
    /**
     * 添加新用户
     *
     * @param user
     * @return
     */
    @Override
    public int add(User user) {
        Connection conn = JdbcUtil.getConn();
        String sql = "insert into user(name,username,email,password) values(?,?,?,?)";
        int i = super.update(conn, sql, user.getName(), user.getUsername(), user.getEmail(), user.getPassword());
        JdbcUtil.close(conn);
        return i;
    }

    /**
     * 更新除了 id 外的用户信息
     *
     * @param id
     * @param newuser
     * @return
     */
    @Override
    public int update(int id, User newuser) {
        String sql = "update user set name=?,email=?,password=? where id = ?";
        Connection conn = JdbcUtil.getConn();
        int i = super.update(conn, sql, newuser.getName(), newuser.getEmail(), newuser.getPassword(), id);
        JdbcUtil.close(conn);
        return i;
    }

    /**
     * 通过 id 删除用户
     *
     * @param id
     * @return
     */
    @Override
    public int deleteById(int id) {
        String sql = "delete from user where id = ?";
        Connection conn = JdbcUtil.getConn();
        int i = super.update(conn, sql, id);
        JdbcUtil.close(conn);
        return i;
    }

    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    public List<User> selectAll() {
        String sql = "select * from user";
        Connection conn = JdbcUtil.getConn();
        List<User> users = super.queryAll(User.class, conn, sql);
        JdbcUtil.close(conn);
        return users;
    }

    /**
     * 通过昵称查找用户
     *
     * @return
     */
    @Override
    public List<User> selectByName(String name) {
        // 对name做模糊查询
        name = "%"+name+"%";
        String sql = "select * from user where name like ?";
        Connection conn = JdbcUtil.getConn();
        List<User> users = super.queryAll(User.class, conn, sql, name);
        JdbcUtil.close(conn);
        return users;
    }

    /**
     * 通过id查询用户
     *
     * @param id
     * @return
     */
    @Override
    public User selectById(int id) {
        String sql = "select * from user where id = ?";
        Connection conn = JdbcUtil.getConn();
        User user = super.queryOne(User.class, conn, sql, id);
        JdbcUtil.close(conn);
        return user;
    }

    /**
     * 通过用户名查询用户
     *
     * @param username
     * @return
     */
    @Override
    public User selectByUserName(String username) {
        String sql = "select * from user where username = ?";
        Connection conn = JdbcUtil.getConn();
        User user = super.queryOne(User.class, conn, sql, username);
        JdbcUtil.close(conn);
        return user;
    }
}
