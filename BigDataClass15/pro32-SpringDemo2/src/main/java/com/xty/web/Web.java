package com.xty.web;

import com.xty.annotation.Dog;
import com.xty.configration.DataSourceConfigration;
import com.xty.configration.SpringContextConfigration;
import com.xty.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class Web {
    public static void main(String[] args) throws SQLException {
        // 通过注解配置类来创建Spring容器
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringContextConfigration.class);

        StudentService studentService = app.getBean(StudentService.class);

        studentService.SelectAll();
    }
}
