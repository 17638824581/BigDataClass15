package com.xty.JDBCTest;

import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class GetConnecionTest {
    public static void main(String[] args) throws SQLException, IOException {


        //1. 使用 DriverManger 类获取数据库连接（需要注册驱动）
        // 先注册驱动
//        DriverManager.registerDriver(new Driver());
//        // 再获取连接
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "123");


        //2. 使用 Driver 类，来获取数据库链接（可以不注册驱动）
//        Driver driver = new Driver();
//
//        Properties ps = new Properties();
//        // Properties 类实际上是一个 Map 集合，存储键值对，Properties 要求它的键值对都是字符串类型。
//        // Properties 对象可以存储一组 “属性”，我们可以将 jdbc 连接数据库所需要的参数，都存到properties中
//        // 将用户、密码存储到 properties 对象中
//        ps.setProperty("user","root");
//        ps.setProperty("password","123");
//
//        Connection connect = driver.connect("jdbc:mysql://localhost:3306/jdbc", ps);
//
//        System.out.println("connect = " + connect);

        // Properties 可以读取文件中的配置项(属性)
        // 我们可以将程序中需要的关键参数，存储到 文件中，然后通过 Properties 来读取其中的参数
//        Properties properties = new Properties();
//
//        // 使用 properties 对象读取文件中的配置
//        FileInputStream fis = new FileInputStream("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro19-JDBC\\src\\jdbc.properties");
//        properties.load(fis);
//
//        // 使用 properites 的 getProperty() 方法，来通过键获取属性值
//        String url = properties.getProperty("url");
//
//        // 使用Properties 中的配置项来创建数据库连接
////        Driver driver = new Driver();
////        Connection connect = driver.connect(url, properties);
////        System.out.println(connect);
//
//        // DriverManger 类也支持使用 Properties 来创建连接
//        Connection connection = DriverManager.getConnection(url, properties);
//        System.out.println(connection);

        // 能不能将创建数据库连接的过程写成一个方法来用？


        Connection connection = JdbcUtils.getConnection();
        System.out.println(connection);

    }
}
