package com.xty.web;

import com.xty.aspect.MyAspect;
import com.xty.service.StudentService;
import com.xty.service.impl.StudentServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyTest {
    public static void main(String[] args) {
        // 想要对 studentService 对象的 save() 方法做增强

        // 目标对象 studentService
        StudentService studentService = new StudentServiceImpl();

        // 使用 基于 JDK 提供的 动态代理技术来实现
        // o 就是生成的代理对象
        StudentService o = (StudentService) Proxy.newProxyInstance(
                // 第一个参数是 目标对象的 类加载器
                studentService.getClass().getClassLoader(),
                // 第二个参数是 目标对象所实现的接口组成的数组
                studentService.getClass().getInterfaces(),
                // 第三个参数是 方法调用处理器
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 当代理对象的方法被调用时，要做什么处理
                        Object result = null;

                        // 只对 save() 方法做增强
                        if (method.getName().equals("save")){
                            MyAspect myAspect = new MyAspect();
                            // 前置增强
                            myAspect.beforeAdvice();
                            // save() 方法本身也要执行
                            result = method.invoke(studentService, args);
                            // 后置增强
                            myAspect.afterAdvice();
                        }else{
                            result = method.invoke(studentService, args);
                        }
                        return result;
                    }
                });

        o.delete();
        o.save();


    }
}
