package com.xty.JDBCTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnnet {
    public static void main(String[] args) throws SQLException {
        // 获取数据库连接之后，怎么执行sql语句
        Connection conn = JdbcUtils.getConn();

        // 执行插入操作
//        String sql1 = "insert into `user`(`u_name`,`u_psd`) values(?,?)";
//        int i = JdbcUtils.update(conn, sql1, "小黑", "888");
//        System.out.println(i);

        // 执行删除的操作
//        String sql2 = "delete from `user` where u_name like ?";
//        int update = JdbcUtils.update(conn, sql2, "小%");
//        System.out.println(update);

        // 执行更新操作
//        String sql3  = "update `user` set `u_name`= ? where u_id = ?";
//        int a = JdbcUtils.update(conn, sql3, "哈哈哈", 3);
//        System.out.println("a = " + a);


        // 查询多条数据的sql语句
//        String sql = "select * from `user` where `u_name` like ?";
//        ResultSet resultSet = JdbcUtils.queryAll(conn, sql, "小%");
//        JdbcUtils.printReustSet(resultSet);

        // 查询单条数据的sql语句
//        String sql2 = "select * from `user` where `u_id` = ?";
//        ResultSet resultSet = JdbcUtils.queryAll(conn, sql2, 9);
//        JdbcUtils.printReustSet(resultSet);

    }
}
