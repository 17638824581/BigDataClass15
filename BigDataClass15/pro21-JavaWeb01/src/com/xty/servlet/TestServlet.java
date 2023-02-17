package com.xty.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 获取 ServletContext 上下文对象
//        ServletContext servletContext = getServletContext();
//
//        // 2. 通过 上下文对象 获取环境参数
//        String url = servletContext.getInitParameter("url");
//        String driver = servletContext.getInitParameter("driver");
//
//        System.out.println("获取到的环境参数：");
//        System.out.println("url = " + url);
//        System.out.println("driver = " + driver);
//
//        System.out.println("获取到的当前的工程路径：");
//        String contextPath = servletContext.getContextPath();
//        System.out.println("contextPath = " + contextPath);
//
//        System.out.println("获取到当前工程在服务器硬盘的那个位置运行:");
//        String realPath = servletContext.getRealPath("/index.html");
//        System.out.println("realPath = " + realPath);

        System.out.println(10/0);

    }
}