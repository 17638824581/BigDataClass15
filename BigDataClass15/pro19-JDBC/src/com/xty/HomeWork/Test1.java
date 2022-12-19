package com.xty.HomeWork;

import com.xty.JDBCTest.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        // 从 控制台 向数据库的表 student 中插入一条数据，表结构如下

        // 1.从控制台输入学生相关信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入性别：");
        String sex = sc.next();
        System.out.println("请输入分数：");
        double score = sc.nextDouble();

        // 2. 创建数据库连接，获取连接
        Connection conn = JdbcUtils.getConn();

        // 3. 使用 JdbcUtils.update() 方法，执行插入操作
        String sql = "insert into student(s_name,s_sex,s_score,s_age) values(?,?,?,?)";
        int update = JdbcUtils.update(conn, sql, name, sex, score, age);

        System.out.println("执行结果："+update);

        // 释放资源
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
