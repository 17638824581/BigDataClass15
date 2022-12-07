package com.xty.JDBCTest;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {
    public static void main(String[] args) throws SQLException {
        // 获取到数据库连接之后，我们需要对数据库进行操作

        // 要操作数据库就要 使用 sql 语句，
        String sql = "insert into user(`u_name`,`u_psd`) values('bbb','333')";

        // 怎么把 sql 语句给数据库执行？
        // 要执行sql语句就要用到  Statement

        // Statement 能够将我们要执行的 sql 语句带给数据库，然后还能将数据库执行sql语句后得到的结果返回给我们java程序。
        // 如何获取 Statement ？
        // 靠 数据库连接对象 来获取
        Connection conn = JdbcUtils.getConnection();
        // 通过 Connection 对象的 createStatement() 方法即可创建 Statement 对象
        Statement statement = conn.createStatement();
        // 调用 Statement 对象的 execute() 方法即可执行sql语句
        boolean execute = statement.execute(sql);

        // execute() 返回会返回一个布尔值作为执行结果
        System.out.println("execute = " + execute);

        // 释放资源
        // 1.关闭 Statement 对象
        statement.close();
        // 2. 关闭数据库连接对象
        conn.close();
    }
}
