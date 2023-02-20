package com.xty.dao.impl;

import com.xty.bean.User;
import com.xty.dao.BaseDao;
import com.xty.dao.UserDao;
import com.xty.util.JdbcUtil;

import java.sql.Connection;

public class UserDaoImpl extends BaseDao implements UserDao {
    /**
     * 接收一个 user 对象存储到数据库中
     *
     * @param user :
     * @return int
     * @author Mr.yu
     * @date 2023/2/20 16:49
     */
    @Override
    public int add(User user) {
        Connection conn = JdbcUtil.getConn();
        String sql = "insert into user(username,password,email) values(?,?,?);";
        int update = super.update(conn, sql, user.getUsername(), user.getPassword(), user.getEmail());
        JdbcUtil.close(conn);
        return update;
    }

    /**
     * 通过id删除用户
     *
     * @param id :
     * @return int
     * @author Mr.yu
     * @date 2023/2/20 16:49
     */
    @Override
    public int delete(int id) {
        Connection conn = JdbcUtil.getConn();
        String sql = "delete from user where id = ?";
        int update = super.update(conn, sql, id);
        JdbcUtil.close(conn);
        return update;
    }

    /**
     * 使用新的 user 对象更新指定 id 的 user 信息
     *
     * @param old_id   :
     * @param new_user :
     * @return int
     * @author Mr.yu
     * @date 2023/2/20 16:50
     */
    @Override
    public int update(int old_id, User new_user) {
        Connection conn = JdbcUtil.getConn();
        String sql = "update user set username=?,password=?,email=? where id = ?";
        int update = super.update(conn, sql, new_user.getUsername(), new_user.getPassword(), new_user.getEmail(), old_id);
        JdbcUtil.close(conn);
        return update;
    }

    /**
     * 根据 id 查询用户数据
     *
     * @param id :
     * @return User
     * @author Mr.yu
     * @date 2023/2/20 16:51
     */
    @Override
    public User selectById(int id) {
        Connection conn = JdbcUtil.getConn();
        String sql = "select * from user where id = ?";
        User user = super.queryOne(User.class, conn, sql, id);
        JdbcUtil.close(conn);
        return user;
    }

    /**
     * 根据 username 查询用户数据
     *
     * @param username :
     * @return User
     * @author Mr.yu
     * @date 2023/2/20 16:52
     */
    @Override
    public User selectByUsername(String username) {
        Connection conn = JdbcUtil.getConn();
        String sql = "select * from user where username = ?";
        User user = super.queryOne(User.class, conn, sql, username);
        JdbcUtil.close(conn);
        return user;
    }

    /**
     * 根据 email 查询用户数据
     *
     * @param email :
     * @return User
     * @author Mr.yu
     * @date 2023/2/20 16:53
     */
    @Override
    public User selectByEamil(String email) {
        Connection conn = JdbcUtil.getConn();
        String sql = "select * from user where email = ?";
        User user = super.queryOne(User.class, conn, sql, email);
        JdbcUtil.close(conn);
        return user;
    }
}
