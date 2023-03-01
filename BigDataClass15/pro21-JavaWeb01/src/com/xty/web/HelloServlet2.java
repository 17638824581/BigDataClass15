package com.xty.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 第二种实现Servlet程序的方法：
 *     1. 继承 HttpServlet 的类
 *     2. 重写 HttpServlet 的 doGet() 以及 doPost() 方法来实现处理对应类型的请求
 * @author Mr.yu
 * @date 2023/2/17 9:01
 */
public class HelloServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet2 收到get请求！");

        // 1. 获取 ServletContext 域对象
        ServletContext servletContext = getServletContext();

        // 2. 取出 HelloServlet 刚刚往里面存储的数据
        Object name = servletContext.getAttribute("name");
        Object age = servletContext.getAttribute("age");

        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("服务器接收到了POST请求！");
    }
}
