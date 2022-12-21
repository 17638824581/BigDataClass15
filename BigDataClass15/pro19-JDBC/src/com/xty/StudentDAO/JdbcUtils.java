package com.xty.StudentDAO;

import java.sql.*;
import java.util.Properties;

// JdbcUtils工具类
public class JdbcUtils {

    // 获取数据库连接的方法
    public static Connection getConn(){
        Properties p = new Properties();
        Connection connection = null;
        try {
            p.load(ClassLoader.getSystemResourceAsStream("jdbc.properties"));
            // 1. 注册驱动(只需要加载Driver类)
            Class.forName(p.getProperty("dirver"));
            // 2. 准备url、用户名、密码
            String url = p.getProperty("url");
            // 3. 使用DriverManager类获取数据库连接
            connection = DriverManager.getConnection(url, p);
        }catch (Exception e){
            e.printStackTrace();
        }

        return connection;
    }

    // 关闭jdbc资源的方法
    public static void close(Connection conn){
        try {
            if (conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    // 关闭jdbc资源的方法
    public static void close(Connection conn, PreparedStatement ps){
        try {
            if (conn != null){
                conn.close();
            }
            if (ps != null){
                ps.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 关闭jdbc资源的方法
    public static void close(Connection conn, PreparedStatement ps, ResultSet rs){
        try {
            if (conn != null){
                conn.close();
            }
            if (ps != null){
                ps.close();
            }
            if (rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
