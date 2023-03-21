package com.xty.aopTest;

import com.xty.service.StudentService;
import com.xty.service.UserService;
import com.xty.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    @Test
    public void test1(){
        // 手动创建 StudentService 对象
        StudentService studentService = new StudentServiceImpl();

        studentService.save();
    }

    @Test
    public void test2(){
        // 使用 Spring 容器来创建 StudentService 对象
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService bean = app.getBean(StudentService.class);

//        bean.save();

        for (int i = 0; i < 1000; i++) {
            bean.delete();
        }

    }

    @Test
    public void test3(){
        // 使用 Spring 容器来创建 StudentService 对象
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService bean = app.getBean(UserService.class);

//        bean.getAll();
        bean.deleteById(5);
    }
}
