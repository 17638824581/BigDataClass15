package com.dahua.web;

import com.alibaba.fastjson.JSON;
import com.dahua.service.BookService;
import com.dahua.service.impl.BookServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/batchDelete")
public class BatchDeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 接收要删除的 ids 数组
        String json = request.getReader().readLine();
        // 2. 将 json 格式的数组，转为 int 型数组
        int[] ids = JSON.parseObject(json, int[].class);
        // 3. 调用 BookService 的 batchDelete 方法来实现批量删除
        BookService bookService = new BookServiceImpl();
        int i = bookService.batchDelete(ids);
        // 4. 返回真正被删除的数据条目数
        response.getWriter().write(String.valueOf(i));
    }
}
