package com.xty.JDBCTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class BatchInsert {
    public static void main(String[] args) throws SQLException {
        // 数据批量插入
//        Connection conn = JdbcUtils.getConn();
//
//        long start = System.currentTimeMillis();
//
//        // 假设我们需要给 test 表中插入 20000 条数据
//        String sql = "insert into `test`(`name`,`age`) values(?,?)";
//        PreparedStatement ps = conn.prepareStatement(sql);
//
//        for (int i = 0; i < 20000; i++) {
//            ps.setString(1,"测试"+i);
//            ps.setInt(2,10);
//
//            ps.executeUpdate();
//            System.out.println("第"+i+"条数据插入完成！");
//        }
//
//        long ends = System.currentTimeMillis();
//
//        System.out.println("20000条数据插入耗时："+(ends-start));
//
//        // 释放资源
//        ps.close();
//        conn.close();

        // 耗时的原因：是因为我们每一次都只执行一条sql语句，
        // 执行一条sql语句都需要经过  发送-执行-等待执行结果 的过程
        // 就比较耗时


        // 优化效率，将sql语句先缓存起来，等到sql语句的数量达到了一定的数量，再统一发给mysql数据库
        // 让它执行。

        // 可以通过批处理来实现这个功能

        // 实现批处理
        // 1. 修改url，在url的后面添加 ?rewriteBatchedStatements=true ，打开mysql的批处理
        // 2. 通过 PreparedStatement 的 addBatch()、executeBatch()、clearBatch() 方法实现批处理
        Connection conn = JdbcUtils.getConn();

        // 取消数据库连接的自动提交
        conn.setAutoCommit(false);

        long start = System.currentTimeMillis();

        // 假设我们需要给 test 表中插入 20000 条数据
        String sql = "insert into `test`(`name`,`age`) values(?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        for (int i = 1; i <= 20000; i++) {
            ps.setString(1,"测试"+i);
            ps.setInt(2,10);

            // 使用 addBatch() 方法，将要执行的sql语句存储到批次中
            ps.addBatch();
            // 每 5000 条语句作为一个批次执行。
            if (i % 5000 == 0){
                // 执行批次
                int[] ints = ps.executeBatch();
                // 打印执行结果
                System.out.println("ints = " + Arrays.toString(ints));
                // 执行完批次后，需要清空批次
                ps.clearBatch();
            }

//            if (i == 10000){
//                System.out.println(i/0);
//            }

            System.out.println("第"+i+"条数据插入完成！");
        }

        // 手动提交
        conn.commit();

        long ends = System.currentTimeMillis();

        System.out.println("20000条数据插入耗时："+(ends-start));

        // 释放资源
        ps.close();
        conn.close();











    }
}
