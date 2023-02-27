package com.dahua.util;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class JdbcUtil {
    private static DruidDataSource dataSource;

    static {
        // 读取配置文件
        ResourceBundle jdbc = PropertyResourceBundle.getBundle("jdbc");

        dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbc.getString("jdbc.driver"));
        dataSource.setUrl(jdbc.getString("jdbc.url"));
        dataSource.setUsername(jdbc.getString("jdbc.username"));
        dataSource.setPassword(jdbc.getString("jdbc.password"));
    }

    public static Connection getConn(){
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(Connection conn){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
