package com.xty.dao.impl;

import com.xty.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private DataSource dataSource;

    @Override
    public void save() {
        // 模拟 save() 方法的执行
        System.out.println("UserDao  save()方法执行。。。。");
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("connection = " + connection);
    }
}
