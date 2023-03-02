package com.dahua.web;

import com.dahua.bean.Book;
import com.dahua.service.BookService;
import com.dahua.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 查询所有书籍数据
        BookService bookService = new BookServiceImpl();
        List<Book> books = bookService.selectAll();

        // 将书籍数据存储到 request 域中
        request.setAttribute("books",books);
        // 请求转发到 home.jsp
        request.getRequestDispatcher("/home.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
