package com.xty.aopTest;

import com.xty.service.StudentService;
import com.xty.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopTest {

//    @Autowired
//    private StudentService studentService;

    @Autowired
    private UserService userService;


    @Test
    public void test1(){
        userService.getAll();
    }

}
