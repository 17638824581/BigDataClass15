package com.xty.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HelloServlet3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet3 接收到了 get请求！");

        // 1. 获取 ServletContext 对象
        ServletContext servletContext = getServletContext();

        // 2. 删除存在 ServletContext 对象中的数据
        servletContext.removeAttribute("name");
        servletContext.removeAttribute("age");

        System.out.println("HelloServlet3 已删除数据！");
    }

}
