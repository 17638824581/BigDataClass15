package com.dahua.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//@WebFilter("/*")
public class ALoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 判断用户请求的是不是登录、注册页面
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String uri = request.getRequestURI();
        String jsp = uri.substring(uri.lastIndexOf("/")+1);

        // 判断请求的是否是登录、注册页面
        if (jsp.equals("index.jsp") || jsp.equals("regist.jsp") || jsp.equals("login") || jsp.equals("regist") || jsp.equals("/")){
            // 放行
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            // 判断是否登录
            Object user = ((HttpServletRequest) servletRequest).getSession().getAttribute("user");
            if (user != null){
                // 用户已登录，放行
                filterChain.doFilter(servletRequest,servletResponse);
            }else{
                // 用户未登录，请求转发到登录页面
                request.setAttribute("msg","您还未登录，请先登录！");
                request.getRequestDispatcher("/index.jsp").forward(request,servletResponse);
            }
        }
    }

    @Override
    public void destroy() {

    }
}
