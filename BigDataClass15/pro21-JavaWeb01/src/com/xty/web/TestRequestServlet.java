package com.xty.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Arrays;

public class TestRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("TestRequestServlet 程序接受到了get请求！");

        // 如何获取用户请求所携带的参数
        // 通过 request 对象的 getParameter() 方法，给出参数的键
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        String psd = request.getParameter("psd");
        String[] likes = request.getParameterValues("like");

        System.out.println("请求所携带的参数有：");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("sex = " + sex);
        System.out.println("psd = " + psd);
        System.out.println("likes = " + Arrays.toString(likes));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("TestRequestServlet 程序接受到了 post 请求！");

        // 在 Servlet 中 是有 四大域对象
        // 域对象 : 指的就是可以以 map 方式存储数据的对象

        // 访问范围不一样
        // ServletContext     ：  ServletContext 所存储的数据，是给所有的 Servlet程序共享的
        // HttpServletRequest ： HttpServletRequest 所存储的数据，只在当前的请求内生效


        // 设置请求体的字符编码
//        request.setCharacterEncoding("utf-8");
//        // 可以给 request 域对象中存储数据
//        request.setAttribute("name","王大锤");
//
//
//        // 也可以从 request 域对象中取出数据
//        Object name = request.getAttribute("name");
//        System.out.println("name="+name);



        // 如何获取用户请求所携带的参数
        // 通过 request 对象的 getParameter() 方法，给出参数的键
//        String name = request.getParameter("name");
//        String age = request.getParameter("age");
//        String sex = request.getParameter("sex");
//        String psd = request.getParameter("psd");
//        String[] likes = request.getParameterValues("like");
//
//        System.out.println("请求所携带的参数有：");
//        System.out.println("name = " + name);
//        System.out.println("age = " + age);
//        System.out.println("sex = " + sex);
//        System.out.println("psd = " + psd);
//        System.out.println("likes = " + Arrays.toString(likes));
    }
}
