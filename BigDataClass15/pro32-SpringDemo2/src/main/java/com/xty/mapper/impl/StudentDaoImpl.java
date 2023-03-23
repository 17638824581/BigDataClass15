package com.xty.mapper.impl;

import com.xty.mapper.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class StudentDaoImpl implements StudentDao {

    // 获取数据源
    @Autowired
    private DataSource dataSource;

    /*
    *  查询所有学生
    * */
    @Override
    public void SeelectAl() {
        System.out.println("StudentDao 的 SelectAll() 方法执行。。。");
        // 获取数据库连接
        try {
            Connection connection = dataSource.getConnection();

            System.out.println("connection = " + connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
