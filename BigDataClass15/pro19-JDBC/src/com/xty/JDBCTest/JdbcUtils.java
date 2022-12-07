package com.xty.JDBCTest;

import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *  这是 JDBC 工具类，
 *  这个类中提供一些能对我们使用 JDBC 有所帮助的相关方法。
 */
public class JdbcUtils {

    // 获取数据库连接的方法
    public static Connection getConnection(){
        // 1. 先读取配置文件
        Properties p = new Properties();
        Connection conn = null;
        try {
            // 使用类加载器来加载外部资源文件
            p.load(ClassLoader.getSystemResourceAsStream("jdbc.properties"));
            // 2. 通过配置文件中的配置项来创建链接
            conn = DriverManager.getConnection(p.getProperty("url"), p);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // 3. 返回连接对象
        return conn;
    }

}
