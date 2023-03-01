package com.xty.web;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 实现一个 Servlet 程序， 来 处理请求，并响应数据
 * @author Mr.yu
 * @date 2023/2/16 14:32
 */
public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet 收到get请求！");
        // 1. 获取 ServletContext 环境对象
        ServletContext servletContext = getServletContext();
        // 2. 向这个 ServletContext 对象中存储一些数据
        servletContext.setAttribute("name","小明");
        servletContext.setAttribute("age","18");

        System.out.println("HelloServlet 程序已经向 ServletContext 环境对象中存储了数据！");
    }
}
