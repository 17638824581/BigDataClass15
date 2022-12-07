package com.weibo.dao.impl;

import com.weibo.bean.Posts;
import com.weibo.bean.User;
import com.weibo.dao.PostsDao;
import com.weibo.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

public class PostsDaoImpl extends BaseDaoImpl implements PostsDao {
    @Override
    public Posts getPosts(int id) {
        Connection conn = JdbcUtils.getConn();
        String sql = "select * from `posts` where `id` = ?";
        Posts posts = queryOne(Posts.class, conn, sql, id);
        JdbcUtils.close(conn);
        return posts;
    }

    @Override
    public Posts getPosts(User user, String title) {
        Connection conn = JdbcUtils.getConn();
        String sql = "select * from `posts` where `u_id` = ? and `title` = ?;";
        Posts posts = queryOne(Posts.class, conn, sql, user.getId(), title);
        JdbcUtils.close(conn);
        return posts;
    }

    @Override
    public List<Posts> getAllPosts() {
        Connection conn = JdbcUtils.getConn();
        String sql = "select * from `posts`";
        List<Posts> posts = queryAll(Posts.class, conn, sql);
        JdbcUtils.close(conn);
        return posts;
    }

    @Override
    public List<Posts> getPosts(int offset, int len) {
        Connection conn = JdbcUtils.getConn();
        String sql = "select * from `posts` order by `like` desc limit ?,?";
        List<Posts> posts = queryAll(Posts.class, conn, sql, offset*len, len);
        JdbcUtils.close(conn);
        return posts;
    }

    @Override
    public List<Posts> getUserAllPosts(User user) {
        Connection conn = JdbcUtils.getConn();
        String sql = "select * from `posts` where `u_id` = ?";
        List<Posts> posts = queryAll(Posts.class, conn, sql, user.getId());
        JdbcUtils.close(conn);
        return posts;
    }

    @Override
    public boolean addPosts(Posts p) {
        Connection conn = JdbcUtils.getConn();
        String sql = "insert into `posts`(`u_id`,`title`,`body`,`date`) values(?,?,?,?);";
        int update = update(conn, sql, p.getU_id(), p.getTitle(), p.getBody(), p.getDate().toString());
        JdbcUtils.close(conn);
        return update>0;
    }

    @Override
    public boolean addPosts(User user, String title, String body) {
        Connection conn = JdbcUtils.getConn();
        String sql = "insert into `posts`(`u_id`,`title`,`body`,`date`) values(?,?,?,?);";
        int update = update(conn, sql, user.getId(), title, body, new Date(System.currentTimeMillis()));
        JdbcUtils.close(conn);
        return update>0;
    }

    @Override
    public boolean deletePosts(int id) {
        Connection conn = JdbcUtils.getConn();
        String sql = "delete from `posts` where `id` = ?";
        int update = update(conn, sql, id);
        JdbcUtils.close(conn);
        return update>0;
    }
}
