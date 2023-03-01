package com.xty.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("*.jsp")
public class VerifyLoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 1.如果是和 登录、注册相关的内容，则放行
        // 获取用户要访问的资源路径
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String uri = request.getRequestURI();
        System.out.println("uri = " + uri);
        // 通过 uri 获取访问的资源名称
        String[] split = uri.split("/");
        String s = split[split.length-1];
        System.out.println("s = " + s);
        if(s.equals("regist.jsp") || s.equals("login.jsp")){
            // 如果请求的是 注册、登录页面，则放行
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            // 如果访问的是其他页面，验证是否登录，
            Object user = ((HttpServletRequest) servletRequest).getSession().getAttribute("user");
            if (user != null){
                // 用户有登录，放行
                filterChain.doFilter(servletRequest,servletResponse);
            }else{
                // 没登陆，请求转发到登录页面
                request.setAttribute("msg","您还未登录，请先登录！");
                request.getRequestDispatcher("/login.jsp").forward(request,servletResponse);
            }
        }
    }

    @Override
    public void destroy() {

    }
}
