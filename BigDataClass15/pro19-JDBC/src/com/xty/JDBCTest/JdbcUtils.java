package com.xty.JDBCTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Jdbc的工具类，提供一些能够方便操作jdbc的方法
 */
public class JdbcUtils {
    // 获取数据库连接的方法
    public static Connection getConn(){
        Properties p = new Properties();
        Connection connection = null;
        try {
            p.load(ClassLoader.getSystemResourceAsStream("jdbc.properties"));
            // 1. 注册驱动(只需要加载Driver类)
            Class.forName(p.getProperty("dirver"));
            // 2. 准备url、用户名、密码
            String url = p.getProperty("url");
            // 3. 使用DriverManager类获取数据库连接
            connection = DriverManager.getConnection(url, p);
        }catch (Exception e){
            e.printStackTrace();
        }

        return connection;
    }

    // 一个通用的遍历ResultSet结果的方法
    public static void printReustSet(ResultSet rs) throws SQLException {
        // 判断ResultSet中有没有内容
        if (rs.next()){
            // 遍历rs
            // 通过getMateDate()方法获取这个rs的元数据，元数据中就包含了rs中的列名
            ResultSetMetaData metaData = rs.getMetaData();
            // 通过MateDate对象的getColumnCount() 方法，来获取rs中列的数量
            int columnCount = metaData.getColumnCount();
            // 通过列索引遍历打印ResultSet的列名
            for (int i = 1; i <= columnCount ; i++) {
                // 使用 getColumnName() 方法可以通过列的索引获取这个列的名字
                System.out.print(metaData.getColumnName(i)+"\t\t");
            }
            System.out.println();

            do {
                // 通过列索引遍历每列打印数据
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getObject(i) + "\t\t");
                }
                System.out.println();
            }while (rs.next());

        }else{
            System.out.println("这个ResultSet是空的");
        }
    }


    // 我们能不能专门一个方法，这个方法是专门用来做 增、删、改的操作
    // 一个通用的增、删、改的方法
    // 方法接收 sql语句，和sql语句的填充参数
    // 方法返回sql语句的执行结果
    public static int update(Connection conn,String sql,Object... o){
        int count = -1;
        PreparedStatement ps = null;
        try {
            // 1. 通过Connection对象创建PreparedStatement对象
            ps = conn.prepareStatement(sql);
            // 2. 给PreparedStatement对象，填充参数
            for (int i = 1; i <= o.length ; i++) {
                ps.setObject(i,o[i-1]);
            }
            // 3. 调用executeUpdate() 方法执行sql语句
            count = ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        // 4. 返回结果
        return count;
    }

    // 既然有通用的执行增、删、改的方法
    // 有没有通用的执行查询的方法
    
    // 通用的查询多条数据的方法
    // 接收 要执行的sql语句，和sql语句要填充的参数值
    // 查询的结果是一个ResultSet
    public static ResultSet queryAll(Connection conn,String sql,Object... o){
        ResultSet resultSet = null;
        try {
            // 1. 通过sql语句创建PreparedStatement对象
            PreparedStatement ps = conn.prepareStatement(sql);
            // 2. 给PreparedStatement对象填充参数
            for (int i = 1; i <= o.length ; i++) {
                ps.setObject(i,o[i-1]);
            }
            // 3. 执行
            resultSet = ps.executeQuery();
        }catch (Exception e){
            e.printStackTrace();
        }

        // 4. 返回结果
        return resultSet;
    }

    // 通用的处理 ResultSet 结果集数据的方法
    // 传入一个 ResultSet，再告诉方法，要转换成哪个类的对象。
    // 可以通过泛型来实现这样的功能
    // 这个方法可以将 ResultSet 结果集中的数据，解析为指定Bean类的对象，并返回这个Bean类对象所组成的List集合。
    public static <T> List<T> parseRS(ResultSet rs, Class<T> clazz){
        // 创建一个存储Bean类对象的集合
        ArrayList<T> al = new ArrayList<>();

        try{
            // 通过 MetaDate 获取 ResultSet 中的所有列名相关的数据
            ResultSetMetaData metaData = rs.getMetaData();
            // 获取所有的列的数量
            int columnCount = metaData.getColumnCount();

            // 遍历ResultSet中所有的行
            while (rs.next()){
                // 通过反射机制，创建一个泛型类 T 的对象
                T t = clazz.newInstance();

                // 属性值注入，将查询到的 ResultSet结果集中的值，注入到对象 t 的对应属性中。

                // 通过遍历的方式获取到的列名，是一定在 ResultSet 中所存在的列
                for (int i = 1; i <= columnCount ; i++) {
                    // 通过遍历获取 ResutSet 中所有的 列名
                    String columnLabel = metaData.getColumnLabel(i);
                    // 通过列名获取当前行这个列的值。
                    Object object = rs.getObject(columnLabel);

                    // 我们可以通过反射直接操作属性，避免了调用set方法的诸多不便
                    // 通过反射机制，获取到 Student 类中和 字段同名的属性对象。
                    // 再通过强制赋值的方式，给student 对象赋值。

                    // 通过列名拿到对应Bean类对应的属性
                    Field declaredField = clazz.getDeclaredField(columnLabel.toLowerCase());
                    // 给这个属性设置强制访问
                    declaredField.setAccessible(true);
                    // 通过反射机制，给泛型对象 t 的 columnLabel 属性设置值。
                    declaredField.set(t,object);
                }

                // 将创建好并赋好值的 t 对象，存储到List集合中
                al.add(t);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        // 返回整个 List 集合
        return al;
    }


}
