package com.weibo.dao.impl;

import com.weibo.bean.User;
import com.weibo.dao.ConcernDao;
import com.weibo.utils.JdbcUtils;

import java.sql.Connection;
import java.util.List;

public class ConcernDaoImpl extends BaseDaoImpl implements ConcernDao {
    @Override
    public boolean addConcern(int a_id, int u_id) {
        Connection conn = JdbcUtils.getConn();
        String sql = "insert into `concern`(`author_id`,`u_id`) values(?,?)";
        int update = update(conn, sql, a_id, u_id);
        JdbcUtils.close(conn);
        return update>0;
    }

    @Override
    public boolean unfollow(int a_id, int u_id) {
        Connection conn = JdbcUtils.getConn();
        String sql = "delete from `concern` where `author_id` = ? and u_id = ?;";
        int update = update(conn, sql, a_id, u_id);
        JdbcUtils.close(conn);
        return update>0;
    }

    @Override
    public List<User> getAllConcernUser(int u_id) {
        Connection conn = JdbcUtils.getConn();
        String sql = "select * from `user` where id in (select `author_id` from `concern` where `u_id` = ?);";
        List<User> users = queryAll(User.class, conn, sql, u_id);
        return users;
    }

    @Override
    public List<User> getAllFans(int u_id) {
        Connection conn = JdbcUtils.getConn();
        String sql = "select * from `user` where id in (select `u_id` from `concern` where `author_id` = ?);";
        List<User> users = queryAll(User.class, conn, sql, u_id);
        return users;
    }

    @Override
    public long getAllFansNum(int u_id) {
        Connection conn = JdbcUtils.getConn();
        String sql = "select count(*) from `concern` where `author_id` = ?;";
        Object o = queryValue(conn, sql, u_id);
        return (long) o;
    }
}
