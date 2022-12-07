package com.xty.JDBCTest;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) throws SQLException {
        // 模拟一个注册账号的程序

        // 1. 通过java 程序让用户输入用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String uname = sc.next();
        System.out.println("请输入密码：");
        String psd = sc.next();

        // 2. 通过jdbc连接数据库，然后将用户输入的用户名和密码保存到 user 表中
        // 1. 注册驱动
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);

        // 2. 创建连接
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String db_user = "root";
        String db_password = "123";
        Connection conn = DriverManager.getConnection(url, db_user, db_password);

        // 3. 执行sql语句
        Statement statement = conn.createStatement();
        String sql = "insert into `user`(`u_name`,`u_psd`) values('"+uname+"','"+psd+"');";
        boolean execute = statement.execute(sql);
        System.out.println("execute = " + execute);

        System.out.println("注册成功！");

        // 4. 释放资源
        statement.close();
        conn.close();

    }
}
