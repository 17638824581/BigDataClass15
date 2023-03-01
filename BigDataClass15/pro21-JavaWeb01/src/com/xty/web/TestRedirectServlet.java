package com.xty.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

/*
*   请求重定向
* */
public class TestRedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 让浏览器重定向需要满足的条件：
        // 1. 设置响应状态码为 3XX
//        response.setStatus(302);
//        // 2. 在响应头中添加 Location 响应头，Location 响应头 携带新的地址信息
//        response.setHeader("Location","http://www.baidu.com");

        // 可以直接调用 response 的 sendRedirect() 方法来实现重定向
        response.sendRedirect("/pro21/index.html");

    }
}
