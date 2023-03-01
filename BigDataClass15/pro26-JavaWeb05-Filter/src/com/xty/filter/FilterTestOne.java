package com.xty.filter;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

// 给过滤器配置拦截路径
@WebFilter("/*")
public class FilterTestOne implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 处理拦截的逻辑
        System.out.println("Filter1 拦截 request");
        // 放行请求
        filterChain.doFilter(servletRequest,servletResponse);
        // 放行之后，访问了web资源，返回响应
        // 也要经过 Filter 过滤器
        servletResponse.getWriter().write("Filter1 处理 response");
    }

    @Override
    public void destroy() {

    }
}
