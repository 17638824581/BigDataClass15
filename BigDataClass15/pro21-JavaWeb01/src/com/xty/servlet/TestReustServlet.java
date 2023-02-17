package com.xty.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TestReustServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("TestRequestServlet 程序接受到了get请求！");
        // 如何获取用户请求所携带的参数
        // 通过 request 对象的 getParameter() 方法，给出参数的键
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        String psd = request.getParameter("psd");

        System.out.println("请求所携带的参数有：");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("sex = " + sex);
        System.out.println("psd = " + psd);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
