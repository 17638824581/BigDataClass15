package com.xty.StudentDAO;

import com.xty.JDBCTest.JdbcUtils;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 查询学生表的数据

        // 查询一个名字叫做 小张 的 学生

        String sql = "select count(*) from `student`;";

        // 执行插入操作
        String sql2 = "insert into `student`(`s_name`,`s_sex`,`s_score`,`s_age`) values(?,?,?,?)";


        BaseDao baseDao = new BaseDao();
        Connection conn = JdbcUtils.getConn();

        Object o = baseDao.update(conn,sql2,"老大","男",88.5,16);

        System.out.println("查询结果："+o);



    }
}
