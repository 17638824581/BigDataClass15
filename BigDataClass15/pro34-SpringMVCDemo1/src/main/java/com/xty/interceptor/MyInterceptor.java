package com.xty.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
*  拦截器
* */
public class MyInterceptor implements HandlerInterceptor {
    @Override
    // 这个方法在请求处理之前被调用
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器1 的preHandle");
        // 相当于放行
        return true;
    }

    @Override
    // 这个方法在请求处理完成后、视图渲染之前被调用
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    // 这个方法在视图渲染完成之后被调用
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截器1 的afterCompletion");
    }
}
