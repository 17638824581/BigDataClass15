package com.xty.servlet;

import com.alibaba.fastjson.JSON;
import com.xty.pojo.Book;
import com.xty.service.BookService;
import com.xty.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/getAllBook")
public class GetAllBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 1. 查询所有的书籍信息
        BookService bookService = new BookServiceImpl();
        List<Book> books = bookService.selectAll();
        // 2. 将书籍信息转为 JSON 格式
        String s = JSON.toJSONString(books);
        response.setContentType("text/json; charset=utf-8");
        // 3. 将 JSON 格式的数据响应给客户端
        response.getWriter().write(s);
    }
}
