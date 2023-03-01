package com.dahua.web;

import com.dahua.bean.Book;
import com.dahua.service.BookService;
import com.dahua.service.impl.BookServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updateBook")
public class UpdataBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取id
        int id = Integer.parseInt(request.getParameter("id"));
        // 查询书籍
        BookService bookService = new BookServiceImpl();
        Book book = bookService.selectById(id);
        // 将 book 信息存入 request 域中
        request.setAttribute("book",book);
        // 将请求转发给 修改页面
        request.getRequestDispatcher("/updateBook.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
