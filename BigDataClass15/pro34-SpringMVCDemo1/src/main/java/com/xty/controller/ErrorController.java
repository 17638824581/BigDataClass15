package com.xty.controller;

import com.xty.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/error")
public class ErrorController {

    // 抛出除0异常
    @RequestMapping("/error1")
    @ResponseBody
    public void error1(){
        System.out.println(1/0);
    }

    // 抛出空指针异常
    @RequestMapping("/error2")
    @ResponseBody
    public void error2(){
        Student stu = null;
        stu.getAge();
    }


    // 抛类找不到异常
    @RequestMapping("/error3")
    @ResponseBody
    public void error3() throws ClassNotFoundException {
        Class.forName("com.xty.abc");
    }


    // 类型转换异常
    @RequestMapping("/error4")
    @ResponseBody
    public void error4(){
        String str = "哈哈哈哈";
        int i = Integer.parseInt(str);
    }

}
