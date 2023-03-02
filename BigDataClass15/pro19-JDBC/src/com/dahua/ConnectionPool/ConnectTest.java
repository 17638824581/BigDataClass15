package com.dahua.ConnectionPool;

import com.dahua.StudentDAO.BaseDao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectTest {
    public static void main(String[] args) throws SQLException {
        // 使用数据库连接池  和 不使用数据库连接池做一个对比
        // 向 money 表中 插入 10000 条数据


        // 1. 不使用数据库连接池
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            Connection conn = JdbcUtils.getConn();
//            BaseDao baseDao = new BaseDao();
//            String sql = "insert into `money`(`name`,`money`) values(?,?)";
//            baseDao.update(conn,sql,"用户"+i,i);
//            JdbcUtils.close(conn);
//            System.out.println("第"+i+"此执行完毕");
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("不使用数据库连接池消耗时间为："+(end-start));


        // 2. 使用数据库连接池
        DataSource dataSource = DruidUtils.getDataSource();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            Connection conn = dataSource.getConnection();
            BaseDao baseDao = new BaseDao();
            String sql = "insert into `money`(`name`,`money`) values(?,?)";
            baseDao.update(conn,sql,"用户"+i,i);
            conn.close();
            System.out.println("第"+i+"此执行完毕");
        }
        long end = System.currentTimeMillis();
        System.out.println("使用数据库连接池消耗时间为："+(end-start));

    }
}
