package com.xty.servlet;

import com.alibaba.fastjson.JSON;
import com.xty.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloSevlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json; charset=utf-8");

        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(18);
        student1.setSex("男");

        Student student2 = new Student();
        student2.setName("李四");
        student2.setAge(20);
        student2.setSex("男");

        Student student3 = new Student();
        student3.setName("王五");
        student3.setAge(16);
        student3.setSex("男");

        Student student4 = new Student();
        student4.setName("马六");
        student4.setAge(18);
        student4.setSex("男");

        Student[] stu = {student1,student2,student3,student4};

        // 使用 FastJson 将对象转为 JSON 格式的字符串
        String json  = JSON.toJSONString(stu);

        resp.getWriter().write(json);
    }
}
