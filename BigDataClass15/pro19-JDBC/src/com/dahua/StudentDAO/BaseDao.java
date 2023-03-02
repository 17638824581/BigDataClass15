package com.dahua.StudentDAO;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.*;
import java.util.List;

// BaseDao 类中，包含一些通用的对数据表做增、删、改、查操作的方法
// Dao 类中查询操作，一般会结合 Bean 类来实现。
// BaseDAO 类中提供了各种通用的对数据表做操作的方法。
public class BaseDao {

    // 全局的 QueryRunner 对象
    private QueryRunner qr = new QueryRunner();

    // 通用的修改（增、删、改）表的方法
    public int update(Connection conn, String sql, Object... o){
        int update;
        try {
            update = qr.update(conn, sql, o);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return update;
    }

    // 通用的查询单条数据的方法
    public <T> T queryOne(Class<T> clazz, Connection conn, String sql, Object... o){
        T query;
        try {
            query = qr.query(conn, sql, new BeanHandler<>(clazz), o);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return query;
    }

    // 通用的查询多条数据的方法
    public <T> List<T> queryAll(Class<T> clazz, Connection conn, String sql, Object... o){
        List<T> query;
        try {
            query = qr.query(conn, sql, new BeanListHandler<>(clazz), o);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return query;
    }

    // 通用的查询单个值的方法
    public Object queryValue(Connection conn, String sql, Object... o){
        Object query;
        try {
            query = qr.query(conn, sql, new ScalarHandler<>(), o);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return query;
    }
}
