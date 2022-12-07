package com.weibo.dao.impl;

import com.weibo.bean.Posts;
import com.weibo.bean.User;
import com.weibo.dao.LikesDao;
import com.weibo.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class LikesDaoImpl extends BaseDaoImpl implements LikesDao {
    @Override
    public boolean addLike(int u_id, int p_id) {
        Connection conn = JdbcUtils.getConn();
        try {
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String sql1 = "insert into `likes`(`u_id`,`p_id`) values(?,?)";
        String sql2 = "update `posts` set `like` = `like` + 1 where `id` = ?";
        try {
            update(conn, sql1, u_id, p_id);
            update(conn, sql2, p_id);
            conn.commit();
        } catch (Exception e) {
            return false;
        }
        JdbcUtils.close(conn);
        return true;
    }

    @Override
    public boolean cancelLike(int u_id, int p_id) {
        Connection conn = JdbcUtils.getConn();
        try {
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String sql1 = "delete from `likes` where `u_id` = ? and `p_id` = ?;";
        String sql2 = "update `posts` set `like` = `like`- 1 where `id` = ?";
        int update1 = update(conn, sql1, u_id, p_id);
        int update2 = update(conn, sql2, p_id);
        try {
            conn.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        JdbcUtils.close(conn);
        return update1-update2==0;
    }

    @Override
    public List<User> getAllLikeUesr(int p_id) {
        Connection conn = JdbcUtils.getConn();
        String sql = "select * from `user` where `id` in (select `u_id` from `likes` where `p_id` = ?)";
        List<User> users = queryAll(User.class, conn, sql, p_id);
        JdbcUtils.close(conn);
        return users;
    }

    @Override
    public List<Posts> getAllLikePosts(int u_id) {
        Connection conn = JdbcUtils.getConn();
        String sql = "select * from `posts` where `id` in (select `p_id` from `likes` where `u_id` = ?)";
        List<Posts> posts = queryAll(Posts.class, conn, sql, u_id);
        JdbcUtils.close(conn);
        return posts;
    }


    @Override
    public long getLikes(int p_id) {
        Connection conn = JdbcUtils.getConn();
        String sql = "select count(*) from `likes` where `p_id` = ?";
        Object o = queryValue(conn, sql, p_id);
        JdbcUtils.close(conn);
        return (long) o;
    }
}
