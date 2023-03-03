package com.dahua.web;

import com.alibaba.fastjson.JSON;
import com.dahua.bean.Book;
import com.dahua.bean.LimitBook;
import com.dahua.service.BookService;
import com.dahua.service.impl.BookServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectByLimit")
public class SelectBookByLimitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/json; charset=utf-8");

        // 获取当前页数
        String currentPage = request.getParameter("currentPage");
        int _currentPage = Integer.parseInt(currentPage);
        // 获取每页条目数
        String pageSize = request.getParameter("pageSize");
        int _pageSize = Integer.parseInt(pageSize);

        System.out.println("收到分页查询：");
        System.out.println("currentPage = " + currentPage);
        System.out.println("pageSize = " + pageSize);


        // 调用 service 执行分页查询
        BookService bookService = new BookServiceImpl();
        // 执行查询获取分页数据
        List<Book> books = bookService.selectByLimit(_currentPage, _pageSize);
        // 查询数据总条数
        int total = bookService.selectTotal();

        LimitBook limitBook = new LimitBook();
        limitBook.setBooks(books);
        limitBook.setTotal(total);


        String jsonString = JSON.toJSONString(limitBook);
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
