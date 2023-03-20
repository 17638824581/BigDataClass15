package com.xty.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.xty.pojo.Student;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SingleColumnRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class JdbcTemplateTest {


    @Test
    public void test1(){
        // 1. 创建 JdbcTemplate 对象
        JdbcTemplate template = new JdbcTemplate();

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/javawebdemo");
        dataSource.setUsername("root");
        dataSource.setPassword("123");

        // 2. 设置数据源
        template.setDataSource(dataSource);

        // 2. 执行 SQL 语句
//        List<Student> query = template.query("select * from student",new BeanPropertyRowMapper<Student>(Student.class));
//        List<Long> query1 = template.query("select count(*) from student", new SingleColumnRowMapper<>(Long.class));
//        System.out.println("query = " + query);
//        System.out.println("query1 = " + query1);

//        int rows = template.update("insert into student(name,age,birthday) values(?,?,?)", "大壮", 18, new Date().getTime());
//        System.out.println("rows = " + rows);

//        int update = template.update("delete from student where id = ?", 10);
//        System.out.println("update = " + update);
    }
}
