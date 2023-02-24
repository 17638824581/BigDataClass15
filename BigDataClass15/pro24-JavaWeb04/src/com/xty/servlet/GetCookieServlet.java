package com.xty.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/getCookie")
public class GetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取浏览器携带的 Cookie 信息
        Cookie[] cookies = request.getCookies();

        for (Cookie cookie : cookies) {
            System.out.println("--------------------");
            System.out.println(cookie.getName());
            System.out.println(cookie.getValue());
        }
    }

}
