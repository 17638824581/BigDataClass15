package com.dahua.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/getSession")
public class GetSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 从Session 域中取数据
        HttpSession session = request.getSession();

        Object username = session.getAttribute("username");

        System.out.println("username = " + username);
    }
}
