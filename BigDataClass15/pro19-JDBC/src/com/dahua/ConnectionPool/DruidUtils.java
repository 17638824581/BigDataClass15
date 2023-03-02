package com.dahua.ConnectionPool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

// 提供德鲁伊数据库连接池相关的工具方法
public class DruidUtils {

    // 创建数据库连接池
    public static DataSource getDataSource() {
        DataSource dataSource = null;
        try {
            // 1. 读取配置文件
            Properties properties = new Properties();
            properties.load(ClassLoader.getSystemResourceAsStream("druid.properties"));
            // 2. 创建连接池
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // 3. 返回这个连接池
        return dataSource;
    }
}
