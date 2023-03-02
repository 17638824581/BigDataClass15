package com.dahua.JDBCTest;

import java.sql.Connection;
import java.sql.SQLException;

// 使用 Jdbc 的事务操作
public class JdbcTransaction {

    // 实现两个用户之间转账的方法
    // 这个方法可以实现 让 name1 给 name2 转账 money 的功能
    public static void transfer(Connection conn, String name1, String name2, double money) throws SQLException {

        // 应该让两条sql语句，要么就都执行成功。要么就都不执行
        // 通过事务来实现这个需求
        // 1. 调用 setAutoCommit() 方法，关闭 Connection 对象的自动提交
        conn.setAutoCommit(false);

        // 2. 手动调用 commit() 方法来提交事务（提交：意味着确定了事务完成。）
        // 3. 也可以调用 rollback() 方法来回滚事务（回滚：使数据库的状态回到执行这个事务之前）
        // 需要将转账的两条sql语句包装成一个事务
        int update1 = -1;
        int update2 = -1;

        try {
            // 1. 让 name1 的余额 -100
            String sql1 = "update `money` set `money` = `money` - ? where name = ?";
            update1 = JdbcUtils.update(conn, sql1, money, name1);

            // 2. 让 name2 的余额 +100
            String sql2 = "update `money` set `money` = `money` + ? where name = ?";
            update2 = JdbcUtils.update(conn, sql2, money, name2);

        } catch (SQLException e) {
            // 出现异常，说明sql语句执行出错
            // 回滚这个事务，撤销事务对数据库所做的修改
            conn.rollback();
            System.out.println("转账失败！");
        }

        // 判断sql语句指定的结果
        if (update1 == 1 && update2 == 1) {
            // 当两条sql语句运行结果都为 1 的时候
            // 说明转账没有问题，可以提交事务
            conn.commit();
            System.out.println("转账成功！");
        }
    }


    public static void main(String[] args) throws SQLException {

        // 假如，用户AA 要给 用户 BB 转 300 块钱
        Connection conn = JdbcUtils.getConn();

        // 我们可以通过 Connection 数据库连接对象，的
        //  setTransactionIsolation() 方法，来对本连接设置 事务隔离级别。

        // 将事务隔离级别更改为：
        // 读未提交：脏读、幻读、不可重复读问题都会出现
        // 串行化隔离级别：可以避免所有的并发问题，但是效率也是最低的
        conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

        // 使用多个线程模拟同时执行多个事务的情况

        // AA 给 BB 转 1 块钱
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 1000; i++) {
                try {
                    transfer(conn, "AA", "BB", 1);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            long ends = System.currentTimeMillis();
            System.out.println("子线程1结束，耗时:"+(ends-start));
        }).start();

        // BB 给 CC 转 1 块钱
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 1000; i++) {
                try {
                    transfer(conn, "BB", "CC", 1);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            long ends = System.currentTimeMillis();
            System.out.println("子线程2结束，耗时:"+(ends-start));
        }).start();

        // CC 给 AA 转 1 块钱
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 1000; i++) {
                try {
                    transfer(conn, "CC", "AA", 1);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            long ends = System.currentTimeMillis();
            System.out.println("子线程3结束，耗时:"+(ends-start));
        }).start();

        // 关闭连接
//        conn.close();


    }
}
