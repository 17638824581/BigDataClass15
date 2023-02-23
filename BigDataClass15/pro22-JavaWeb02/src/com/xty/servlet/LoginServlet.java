package com.xty.servlet;

import com.xty.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
*   用于处理登录请求
* */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 取出用户名和密码参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("接收到了 用户的登录请求 ！");
        System.out.println("username = " + username);
        System.out.println("password = " + password);

        // 对用户名和密码参数做初步验证
        if ("".equals(username) || username == null){
            // 5. 登录失败 --> 再次重定向到登陆页面，并回显错误信息！
            req.setAttribute("msg","用户名不能为空！");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
        if("".equals(password) || password == null){
            // 5. 登录失败 --> 再次重定向到登陆页面，并回显错误信息！
            req.setAttribute("msg","密码不能为空！");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }

        // 调用 Service 中提供的登录方法，来处理登录业务
        UserService userService = new UserService();
        // 根据返回值判断是否登录成功！
        if(userService.login(username, password)){
            // 4. 登录成功 --> 跳转到 主页
            resp.sendRedirect("/pro22/home.jsp");
        }else{
            // 5. 登录失败 --> 再次重定向到登陆页面，并回显错误信息！
            req.setAttribute("msg","账号或密码错误！");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
