package com.dahua.web;

import com.dahua.service.BookService;
import com.dahua.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteBook")
public class DeleteBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        // 接受id
        int id = Integer.parseInt(req.getParameter("id"));
        BookService bookService = new BookServiceImpl();
        boolean b = bookService.deleteById(id);
        if (b) {
            resp.getWriter().write("<script>alert('删除成功！')</script>");
            resp.getWriter().write("<script>location.replace('/pro25/home')</script>");
        }else{
            resp.getWriter().write("<script>alert('删除失败！')</script>");
            resp.getWriter().write("<script>location.replace('/pro25/home')</script>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
