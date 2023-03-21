package com.xty.web;

import com.xty.advice.MyAdvice;
import com.xty.service.UserService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyTest {
    public static void main(String[] args) {
        // 使用 Cglib 提供的技术 实现 动态代理

        // 增强 userService 目标对象
        UserService userService = new UserService();

        // 增强 getAll() 方法 目标方法
//        userService.getAll();

        // 1. 创建增强器
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类
        enhancer.setSuperclass(userService.getClass());
        // 3. 设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                MyAdvice myAdvice = new MyAdvice();

                // 前置增强
                myAdvice.before();
                // 调用目标方法
                Object invoke = method.invoke(userService, objects);
                // 后置增强
                myAdvice.after();

                return invoke;
            }
        });

        // 4. 生成代理对象
        UserService proxyUserService = (UserService) enhancer.create();


//        userService.getAll();

        // 5. 通过代理对象调用方法
        proxyUserService.getAll();



    }
}
