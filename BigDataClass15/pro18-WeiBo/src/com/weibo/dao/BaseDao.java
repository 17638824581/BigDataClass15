package com.weibo.dao;

import java.sql.Connection;
import java.util.List;

public interface BaseDao {
    
    /**
     * 基本增、删、改操作
     * @author Mr.yu
     * @date 2022/11/22 22:25
     */
    int update(Connection conn,String sql,Object... args);
    
    /**
     * 基本查询单条数据操作
	 * @param conn: 数据库连接对象
	 * @param sql: 要执行的sql语句
	 * @param args: 参数
     * @return T: 返回的查询结果的Bean类对象
     * @author Mr.yu
     * @date 2022/11/22 22:27
     */
    <T> T queryOne(Class<T> clazz, Connection conn, String sql, Object... args);
    
    /**
     * 基本查询多条数据的操作
	 * @param conn: 数据库连接对象
	 * @param sql: 要执行的sql语句
	 * @param args: 参数
     * @return List<T>：返回的查询结果的Bean类对象所组成的List集合
     * @author Mr.yu
     * @date 2022/11/22 22:30
     */
    <T> List<T> queryAll(Class<T> clazz, Connection conn, String sql, Object... args);

    /**
     * 基本的查询单个值的操作
     * @param conn: 数据库连接对象
     * @param sql: 要执行的sql语句
     * @param args: 参数
     * @return List<T>：返回的查询结果的Bean类对象所组成的List集合
     * @author Mr.yu
     * @date 2022/11/22 22:30
     */
     Object queryValue(Connection conn, String sql, Object... args);
}
