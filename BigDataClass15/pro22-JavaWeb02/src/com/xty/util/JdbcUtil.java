package com.xty.util;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 使用 Druid 数据库连接池
 * 提供获取数据库连接以及关闭数据库连接等方法
 * @author Mr.yu
 * @date 2023/2/20 15:50
 */
public class JdbcUtil {

    private static DataSource dataSource;

    static {
        // staic 静态代码块在 JdbcUtil 类被加载时 执行
        try {
            InputStream resourceAsStream = JdbcUtil.class.getResourceAsStream("druid.properties");
            Properties config = new Properties();
            config.load(resourceAsStream);
            dataSource = DruidDataSourceFactory.createDataSource(config);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("创建数据库连接池失败！");
        }
    }
    
    /**
     * 获取一个Druid数据库连接池的数据库连接对象
     * @return Connection
     * @author Mr.yu
     * @date 2023/2/20 16:04
     */
    public static Connection getConn(){

        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("获取数据库连接失败！");
        }
        return connection;
    }
    
    /**
     * 关闭数据库连接对象
     * @param conn: 
     * @return void
     * @author Mr.yu
     * @date 2023/2/20 16:05
     */
    public static void close(Connection conn){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("数据库连接释放失败！");
            }
        }
    }
}
