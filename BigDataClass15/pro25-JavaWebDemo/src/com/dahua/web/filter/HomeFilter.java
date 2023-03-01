package com.dahua.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/home.jsp")
public class HomeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 当用户访问 home.jsp 的时候，不会有书籍的信息
        // 我们就强制让请求转发到 /home 这个 Servlet 程序下
        servletRequest.getRequestDispatcher("/home").forward(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
