package com.dahua.web;

import com.dahua.service.UserService;
import com.dahua.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteUser")
public class DeleteUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        UserService userService = new UserServiceImpl();

        boolean b = userService.deleteById(id);
        if (b){
            response.sendRedirect("/pro25/showUser");
        }else{
            response.getWriter().write("<script>alert('删除失败')</script>");
            response.getWriter().write("<script>location.replace('/pro25/showUser')</script>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
