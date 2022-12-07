package com.weibo.dao.impl;

import com.weibo.dao.BaseDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.*;
import java.util.List;

public class BaseDaoImpl implements BaseDao {

    private QueryRunner qr;

    public BaseDaoImpl() {
        qr = new QueryRunner();
    }

    @Override
    public int update(Connection conn, String sql, Object... args) {
        int update = 0;
        try {
            update = qr.update(conn, sql, args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return update;
    }

    @Override
    public <T> T queryOne(Class<T> clazz, Connection conn, String sql, Object... args) {
        T query = null;
        try {
            query = qr.query(conn, sql, new BeanHandler<>(clazz), args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return query;
    }

    @Override
    public <T> List<T> queryAll(Class<T> clazz, Connection conn, String sql, Object... args) {
        List<T> query = null;
        try {
            query = qr.query(conn, sql, new BeanListHandler<>(clazz), args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return query;
    }

    @Override
    public Object queryValue(Connection conn, String sql, Object... args) {
        Object query = null;
        try {
            query = qr.query(conn, sql, new ScalarHandler<>(), args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return query;
    }
}
