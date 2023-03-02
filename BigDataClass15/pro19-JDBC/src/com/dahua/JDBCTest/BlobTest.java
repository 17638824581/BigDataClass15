package com.dahua.JDBCTest;

import java.io.*;
import java.sql.*;

public class BlobTest {
    public static void main(String[] args) throws SQLException, IOException {

        //  演示操作 Blob 类型的字段

        // 存储 Blob 类型
        // 1. 获取数据库连接
        Connection conn = JdbcUtils.getConn();
//
//        // 2. 插入一条数据到 user 表中
//        String sql = "insert into `user`(`u_name`,`u_psd`,`u_photo`) values(?,?,?)";
//        PreparedStatement ps = conn.prepareStatement(sql);
//
//        ps.setString(1,"孙悟空");
//        ps.setString(2,"666");
//        // u_photo 字段类型是 Blob 类型，所以我们需要使用 setBlob() 方法，来给 Blob字段设置值
//        ps.setBlob(3, new FileInputStream("C:\\Users\\XTY\\Pictures\\壁纸 (25).jpg"));
//
//        // 执行sql语句
//        int i = ps.executeUpdate();
//
//        System.out.println(i);


        // 读取 Blob 类型
        String sql = "select * from `user` where `u_name` = ?";

        ResultSet resultSet = JdbcUtils.queryAll(conn, sql, "孙悟空");

        if (resultSet.next()){
            int u_id = resultSet.getInt("u_id");
            System.out.println("u_id = " + u_id);
            String u_name = resultSet.getString("u_name");
            System.out.println("u_name = " + u_name);
            String u_psd = resultSet.getString("u_psd");
            System.out.println("u_psd = " + u_psd);

            Blob u_photo = resultSet.getBlob("u_photo");
            System.out.println("u_photo = " + "已存储为图片到本地！");
            JdbcUtils.saveBlob(u_photo,"./666.jpg");

            resultSet.close();
            conn.close();

        }


    }
}
