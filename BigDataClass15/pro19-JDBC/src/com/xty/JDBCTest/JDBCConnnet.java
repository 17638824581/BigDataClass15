package com.xty.JDBCTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
//        String sql2 = "select * from `user`";
//        ResultSet resultSet = JdbcUtils.queryAll(conn, sql2);
//        JdbcUtils.printReustSet(resultSet);



        // 先往student表中插入几个学生数据
//        String sql = "insert into `student`(`s_name`,`s_sex`,`s_score`) values (?,?,?);";
//        JdbcUtils.update(conn,sql,"小黑","男",66.6);
//        JdbcUtils.update(conn,sql,"小白","男",45.6);
//        JdbcUtils.update(conn,sql,"小往","女",72);
//        JdbcUtils.update(conn,sql,"小张","女",96);

        // 使用通用查询方法，来查询student 表中的数据
        String sql = "select * from student";
        ResultSet resultSet = JdbcUtils.queryAll(conn, sql);

        // 通过 parseRS() 方法，指定将 ResultSet 对象解析为指定类的结果
        List<Student> students = JdbcUtils.parseRS(resultSet, Student.class);

        System.out.println("解析结果："+students);


        // 一般对于查询的结果，如果仅仅是使用ResultSet来保存的话，不便于我们对数据的操作
        // ResultSet 保存数据不好用用
        // 当我们查询到结果集之后，若是关闭了数据库连接，那么 ResultSet 中的数据也都会失效

        // 有没有更好的方法，去在java保存我们在数据库中查询的结果
        // 如何将 ResultSet 中所存储的表的数据，转换为对应的 Bean类对象？

        // 可以遍历 ResultSet 的数据，每遍历一行数据，就生成一个 Student 对象。

        // 使用List集合来存储学生对象




    }
}
