package com.xty.StudentDAO;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// BaseDao 类中，包含一些通用的对数据表做增、删、改、查操作的方法
// Dao 类中查询操作，一般会结合 Bean 类来实现。
// BaseDAO 类中提供了各种通用的对数据表做操作的方法。
public class BaseDao {

    // 通用的修改（增、删、改）表的方法
    public int update(Connection conn, String sql, Object... o){
        int num = -1;
        PreparedStatement ps = null;
        try {
            // 1. 生成 PreparedStatement 对象
            ps = conn.prepareStatement(sql);
            // 2. 填充参数
            for (int i = 1; i <= o.length; i++) {
                ps.setObject(i,o[i-1]);
            }
            // 3. 执行sql语句
            num = ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 5. 释放资源
            try {
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        // 4. 返回结果
        return num;
    }

    // 通用的查询单条数据的方法
    public <T> T queryOne(Class<T> clazz, Connection conn, String sql, Object... o){
        T t = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            // 1. 创建 PreparedStatment 对象
            ps = conn.prepareStatement(sql);
            // 2. 填充参数
            for (int i = 1; i <= o.length ; i++) {
                ps.setObject(i,o[i-1]);
            }
            // 3. 执行sql语句
            resultSet = ps.executeQuery();
            // 4. 解析ResultSet，将ResultSet中的数据转换为对应的 Bean类对象

            // 4.2 遍历ResultSet，给这个对象 t 注入属性值
            if (resultSet.next()){
                // 4.1 通过反射创建泛型类 T 的对象
                t = clazz.newInstance();

                ResultSetMetaData metaData = resultSet.getMetaData();
                // 遍历 ResultSet 的列名
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    // 获取当前遍历到的列名
                    String columnLabel = metaData.getColumnLabel(i);
                    // 获取当前遍历到的列的值
                    Object value = resultSet.getObject(i);
                    // 通过列名获取到泛型类 T 同名的属性
                    Field field = clazz.getDeclaredField(columnLabel);
                    // 设置这个属性的强制访问
                    field.setAccessible(true);
                    // 给对象 t 的 field 属性赋值
                    field.set(t,value);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 6. 释放资源
            try {
                resultSet.close();
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        // 5. 返回 Bean类对象
        return t;
    }

    // 通用的查询多条数据的方法
    public <T> List<T> queryAll(Class<T> clazz, Connection conn, String sql, Object... o){
        List<T> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            // 1. 创建 PreparedStatment 对象
            ps = conn.prepareStatement(sql);
            // 2. 填充参数
            for (int i = 1; i <= o.length ; i++) {
                ps.setObject(i,o[i-1]);
            }
            // 3. 执行sql语句
            resultSet = ps.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();

            // 4.2 遍历ResultSet
            while (resultSet.next()){
                // 4. 解析ResultSet，将ResultSet中的数据转换为对应的 Bean类对象
                // 4.1 通过反射创建泛型类 T 的对象
                T t = clazz.newInstance();
                // 遍历 ResultSet 的列名，给这个对象 t 注入属性值
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    // 获取当前遍历到的列名
                    String columnLabel = metaData.getColumnLabel(i);
                    // 获取当前遍历到的列的值
                    Object value = resultSet.getObject(i);
                    // 通过列名获取到泛型类 T 同名的属性
                    Field field = clazz.getDeclaredField(columnLabel);
                    // 设置这个属性的强制访问
                    field.setAccessible(true);
                    // 给对象 t 的 field 属性赋值
                    field.set(t,value);
                }

                // 将对象t存储到 list 中
                list.add(t);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 6. 释放资源
            try {
                resultSet.close();
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        // 5. 返回 Bean类对象
        return list;
    }

    // 通用的查询单个值的方法
    public Object queryValue(Connection conn, String sql, Object... o){
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        Object object = null;
        try {
            //1. 创建PreparedStatement 对象
            ps = conn.prepareStatement(sql);
            //2. 填充sql参数
            for (int i = 1; i <= o.length ; i++) {
                ps.setObject(i,o[i-1]);
            }
            //3. 执行sql语句
            resultSet = ps.executeQuery();
            //4. 解析结果，将结果解析为一个值
            if (resultSet.next()){
                object = resultSet.getObject(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        //5. 返回这个值
        return object;
    }
}
