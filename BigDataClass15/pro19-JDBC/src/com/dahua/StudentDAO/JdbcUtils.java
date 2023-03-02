package com.dahua.StudentDAO;

import com.dahua.ConnectionPool.DruidUtils;

import javax.sql.DataSource;
import java.sql.*;

// JdbcUtils工具类
public class JdbcUtils {

    private static DataSource ds = null;

    static{
        System.out.println("123123");
        // 初始化数据库连接池
        ds = DruidUtils.getDataSource();
    }

    // 获取数据库连接池中连接的方法
    public static Connection getConn(){
        Connection connection = null;
        try {
            connection = ds.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
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
