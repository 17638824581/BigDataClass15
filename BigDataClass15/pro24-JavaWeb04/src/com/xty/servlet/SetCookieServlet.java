package com.xty.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/setCookie")
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 创建Cookie对象
        Cookie c1 = new Cookie("username", "xty");
        Cookie c2 = new Cookie("password", "123456");

        // 设置 Cookie 的存活时间
        c1.setMaxAge(60);
        c2.setMaxAge(60 * 60 * 24 * 30 * 12);

        // 向客户端浏览器添加 Cookie 数据
        response.addCookie(c1);
        response.addCookie(c2);


    }
}
