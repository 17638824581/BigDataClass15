package com.xty.HomeWork;

import com.xty.JDBCTest.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws SQLException {
        // 从控制台输入，插入一个新的 examstudent信息


        // 1.从控制台输入学生相关信息
        Scanner sc = new Scanner(System.in);


        System.out.println("请输入四/六级：");
        int type = sc.nextInt();
        System.out.println("请输入身份证号：");
        String idcard = sc.next();
        System.out.println("请输入准考证号：");
        String examcard = sc.next();
        System.out.println("请输入学生性名：");
        String name = sc.next();
        System.out.println("请输入区域：");
        String location = sc.next();
        System.out.println("请输入成绩：");
        int score = sc.nextInt();

        // 2. 创建数据库连接，获取连接
        Connection conn = JdbcUtils.getConn();

        // 3. 使用 JdbcUtils.update() 方法，执行插入操作
        String sql = "insert into examstudent(Type,IDCard,ExamCard,StudentName,Location,Grade) values (?,?,?,?,?,?)";
        int update = JdbcUtils.update(conn, sql, type,idcard,examcard,name,location,score);

        if (update>0){
            System.out.println("添加数据成功！");
        }else{
            System.out.println("添加数据失败！");
        }

        // 释放资源
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
