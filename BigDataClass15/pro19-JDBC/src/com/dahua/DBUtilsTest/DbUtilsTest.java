package com.dahua.DBUtilsTest;

import com.dahua.ConnectionPool.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import javax.sql.DataSource;
import java.sql.SQLException;

public class DbUtilsTest {
    public static void main(String[] args) throws SQLException {
        // 演示 DBUtils 工具类库的使用
        // 1. QueryRunner SQL 执行器
        // 2. ResultSetHandler 结果集处理器
        // 3. DbUtils 工具类，主要提供了一些关闭资源的方法


        // 1. 先导入类库的 jar 包


        // 创建一个连接池
        DataSource dataSource = DruidUtils.getDataSource();

        // 1. SQL 执行器 QueryRunner
        // 我们在创建 QyeryRunner 对象的时候，其实可以直接分配一个 数据库连接池给 它
        QueryRunner qr = new QueryRunner(dataSource);

        // 执行查询的 sql 语句：
        String sql1 = "select count(*) from student";
        // 2. 结果集处理器 ResultSetHandler
        // BeanHandler 只能够处理一条数据结果
        // ArrayHandler 能够处理单条数据结果，但是它能够将单条数据的结果，存储为一个数组
        // BeanListHandler 能够处理多条数据结果，并返回一个包含 bean对象的 List 集合
        // ScalarHandler 能处理单个值的查询结果，并返回这个值
        Object query = qr.query(sql1, new ScalarHandler<>());
        System.out.println(query);

        // 执行增、删、改 之类的 sql 语句
//        String sql2 = "delete from student where s_id = ?";
//        int update = qr.update(sql2, 7);
//
//        System.out.println(update);

        // DbUtils 工具类中，所提供的方法，大部分都是用于关闭 jdbc 资源的方法
//        String sql = "select * from student";
//        Connection connection = null;
//        PreparedStatement ps = null;
//        ResultSet resultSet = null;
//        try {
//            connection = dataSource.getConnection();
//            ps = connection.prepareStatement(sql);
//            resultSet = ps.executeQuery();
//            System.out.println(resultSet);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }finally {
//            // 可以使用 DbUtils 类中所提供的方法，来关闭资源
//            DbUtils.closeQuietly(resultSet);
//            DbUtils.closeQuietly(ps);
//            DbUtils.closeQuietly(connection);
//        }
    }
}
