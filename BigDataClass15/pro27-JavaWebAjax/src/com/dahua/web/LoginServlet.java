package com.dahua.web;

import com.dahua.bean.User;
import com.dahua.service.UserService;
import com.dahua.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 取出参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 记住密码
        String remember = request.getParameter("remember");

        UserService userService = new UserServiceImpl();
        // 通过用户名查找用户
        User user = userService.selectByUsername(username);
        if (user != null){
            // 验证密码
            if (user.getPassword().equals(password)){
                // 登录成功
                if (remember != null){
                    // 记住账号和密码 ————> 通过 Cookie
                    Cookie c1 = new Cookie("username", username);
                    Cookie c2 = new Cookie("password", password);
                    c1.setMaxAge(60 * 60 * 24 * 7);
                    c2.setMaxAge(60 * 60 * 24 * 7);
                    response.addCookie(c1);
                    response.addCookie(c2);
                }
                // 保存登录状态 ————> 通过 Session
                request.getSession().setAttribute("user",user);
                // 跳转页面 ————> home.jsp
                response.sendRedirect("/pro25/home.jsp");
            }else{
                //验证密码不通过
                request.setAttribute("msg","账号或密码错误！");
                request.getRequestDispatcher("/index.jsp").forward(request,response);
            }
        }else{
            // 用户不存在
            request.setAttribute("msg","账号或密码错误！");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
    }
}
