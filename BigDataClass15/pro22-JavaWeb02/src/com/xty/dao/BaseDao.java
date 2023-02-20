package com.xty.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * 完成对基本的、通用的
 * 对数据表的增删改查等功能
 * @author Mr.yu
 * @date 2023/2/20 16:11
 */
public class BaseDao {

    /**
     * 通用的执行增删改的功能方法
     * @param conn: 数据库连接对象
	 * @param sql: 要执行sql语句
	 * @param args: 要填充的参数
     * @return int
     * @author Mr.yu
     * @date 2023/2/20 16:12
     */
    public int update(Connection conn,String sql,Object... args){
        QueryRunner queryRunner = new QueryRunner();
        int update = 0;
        try {
            update = queryRunner.update(conn, sql, args);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("update()方法执行失败！");
        }
        return update;
    }

    
    /**
     * 通用的查询多条数据的方法
     * @param clazz: 
     * @return List<T>
     * @author Mr.yu
     * @date 2023/2/20 16:16
     */
    public <T> List<T> queryAll(Class<T> clazz,Connection conn,String sql,Object... args){
        QueryRunner queryRunner = new QueryRunner();
        List<T> query = null;
        try {
            query = queryRunner.query(conn, sql, new BeanListHandler<>(clazz), args);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("queryAll()方法执行失败！");
        }
        return query;
    }

    /**
     * 通用的查询单条数据的方法
     * @param clazz: 
	 * @param conn: 
	 * @param sql: 
	 * @param args: 
     * @return T
     * @author Mr.yu
     * @date 2023/2/20 16:20
     */
    public <T> T queryOne(Class<T> clazz,Connection conn,String sql,Object... args){
        QueryRunner queryRunner = new QueryRunner();
        T query = null;
        try {
            query = queryRunner.query(conn, sql, new BeanHandler<>(clazz), args);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("queryOne()方法执行失败！");
        }
        return query;
    }

    /**
     * 通用的查询单个值的方法
     * @param conn: 
	 * @param sql: 
	 * @param args: 
     * @return Object
     * @author Mr.yu
     * @date 2023/2/20 16:23
     */
    public Object queryValue(Connection conn, String sql, Object... args){
        QueryRunner queryRunner = new QueryRunner();
        Object query = null;
        try {
            query = queryRunner.query(conn, sql, new ScalarHandler<>(), args);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("queryValue()方法执行失败！");
        }
        return query;
    }
}
