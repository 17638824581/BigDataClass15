package com.xty.JDBCTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Jdbc的工具类，提供一些能够方便操作jdbc的方法
 */
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

    // 一个通用的遍历ResultSet结果的方法
    public static void printReustSet(ResultSet rs) throws SQLException {
        // 判断ResultSet中有没有内容
        if (rs.next()){
            // 遍历rs
            // 通过getMateDate()方法获取这个rs的元数据，元数据中就包含了rs中的列名
            ResultSetMetaData metaData = rs.getMetaData();
            // 通过MateDate对象的getColumnCount() 方法，来获取rs中列的数量
            int columnCount = metaData.getColumnCount();
            // 通过列索引遍历打印ResultSet的列名
            for (int i = 1; i <= columnCount ; i++) {
                // 使用 getColumnName() 方法可以通过列的索引获取这个列的名字
                System.out.print(metaData.getColumnName(i)+"\t\t");
            }
            System.out.println();

            do {
                // 通过列索引遍历每列打印数据
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getObject(i) + "\t\t");
                }
                System.out.println();
            }while (rs.next());

        }else{
            System.out.println("这个ResultSet是空的");
        }
    }


    // 我们能不能专门一个方法，这个方法是专门用来做 增、删、改的操作
    // 一个通用的增、删、改的方法
    // 方法接收 sql语句，和sql语句的填充参数
    // 方法返回sql语句的执行结果
    public static int update(Connection conn,String sql,Object... o) throws SQLException {
        // 1. 通过Connection对象创建PreparedStatement对象
        PreparedStatement ps = conn.prepareStatement(sql);
        // 2. 给PreparedStatement对象，填充参数
        for (int i = 1; i <= o.length ; i++) {
            ps.setObject(i,o[i-1]);
        }
        // 3. 调用executeUpdate() 方法执行sql语句
        int i = ps.executeUpdate();
        // 4. 返回结果
        return i;
    }

    // 既然有通用的执行增、删、改的方法
    // 有没有通用的执行查询的方法
    
    // 通用的查询多条数据的方法
    // 接收 要执行的sql语句，和sql语句要填充的参数值
    // 查询的结果是一个ResultSet
    public static ResultSet queryAll(Connection conn,String sql,Object... o) throws SQLException {
        // 1. 通过sql语句创建PreparedStatement对象
        PreparedStatement ps = conn.prepareStatement(sql);
        // 2. 给PreparedStatement对象填充参数
        for (int i = 1; i <= o.length ; i++) {
            ps.setObject(i,o[i-1]);
        }
        // 3. 执行
        ResultSet resultSet = ps.executeQuery();
        // 4. 返回结果
        return resultSet;
    }

}
