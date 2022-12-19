package com.xty.HomeWork;

import com.xty.JDBCTest.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

public class Test4 {

    // 根据ResultSet中的数据，打印查询结果
    public static void showResult(ResultSet rs){
        // 将查询到的考生数据解析为考生类
        List<ExamStudent> examStudents = JdbcUtils.parseRS(rs, ExamStudent.class);
        // 判断查询结果
        if (examStudents.size() == 0){
            System.out.println("没有查到学生信息！");
        }else{
            // 打印查询到的学生信息
            ExamStudent examStudent = examStudents.get(0);
            System.out.println("========查询结果========");
            System.out.println("流水号：\t\t"+examStudent.getFlowid());
            System.out.println("四级/六级：\t"+examStudent.getType());
            System.out.println("身份证号：\t"+examStudent.getIdcard());
            System.out.println("准考证号：\t"+examStudent.getExamcard());
            System.out.println("学生姓名：\t"+examStudent.getStudentname());
            System.out.println("区域：\t\t"+examStudent.getLocation());
            System.out.println("成绩：\t\t"+examStudent.getGrade());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 根据准考证号或身份证号查询学生信息
        System.out.println("请选择您要输入的类型：");
        System.out.println("a:准考证号");
        System.out.println("b:身份证号");

        String next = sc.next();
        Connection conn = JdbcUtils.getConn();

        if (next.equals("a")){
            System.out.println("请输入准考证号：");
            String examcard = sc.next();

            // 根据准考证号查询学生信息
            String sql = "select * from `examstudent` where `examcard` = ?";
            ResultSet resultSet = JdbcUtils.queryAll(conn, sql, examcard);
            showResult(resultSet);

        }else if(next.equals("b")){
            System.out.println("请输入身份证号：");
            String idcard = sc.next();

            // 根据身份证号查询学生信息
            String sql = "select * from `examstudent` where `idcard` = ?";
            ResultSet resultSet = JdbcUtils.queryAll(conn, sql, idcard);
            showResult(resultSet);

        }else{
            System.out.println("您输入的有误！请重新进入程序！");
        }


    }
}
