package com.xty.web;

import com.xty.service.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/addUser")
public class RegisterUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        // 处理用户注册请求
        UserService userService = new UserService();
        // 调用 service 层登录业务方法，处理登录请求
        userService.register(request,response);
    }
}
