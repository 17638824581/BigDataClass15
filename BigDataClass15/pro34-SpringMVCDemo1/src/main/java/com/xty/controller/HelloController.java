package com.xty.controller;

import com.alibaba.fastjson.JSON;
import com.xty.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/abc")
public class HelloController {

    // 此方法用来处理请求：接收请求、取出请求参数、调用业务方法、获取数据、请求转发到视图
    @RequestMapping(value = "/hello", method = {RequestMethod.GET}, params = {"name=abc","age!=20"})
    public ModelAndView hello(String name){  // 在控制器方法的形参列表上写上参数，SpringMVC 前端控制器即可自动传入参数
        System.out.println("name = " + name);

        // 数据模型 和 视图  类
        ModelAndView modelAndView = new ModelAndView();
        // 将要携带的数据存到 modelAndView 中
        modelAndView.addObject("name",name);
        // 要进行视图转发
        modelAndView.setViewName("/WEB-INF/page/hello.jsp");

        return modelAndView;
    }

    @RequestMapping("/h2")
    public String hello2() {

        System.out.println("h2 被请求");

        // 控制器方法中直接返回 字符串，默认代表的就是 请求转发
        // 请求转发的效果：
        //      单次请求
        //      浏览器的路径不会变
//        return "/WEB-INF/page/hello2.jsp";


        // 我不想请求转发了，想要客户端请求重定向
        // 重定向的效果：
        //      两次请求
        //      第一次请求，相应的状态码302，响应头中告诉新地址
        //      浏览器自动进行第二次请求，去请求新地址

        return "hello2";
    }


    @RequestMapping("/h3")
    public String hello3() {

        // 返回 url 的时候
        // 默认进行的是 请求转发 (forward: )
        // 想要实现请求重定向的话 需要在 前面加上 redirect:
        // 如果配置了视图解析器以及前后缀，则视图解析器会自动拼上前后缀
        // 如果不想让解析器会自动拼上前后缀，则需要加上 redirect: 或 forward:

        // 这个返回的url不想让 视图解析器拼上前后缀
        return "forward:/WEB-INF/page2/abc.jsp";
    }

    // 以返回字符串的方式，实现页面跳转
    @RequestMapping("/h4")
    public String hello4(){

        // 实现的效果是：请求转发
        return "/WEB-INF/page2/abc.jsp";

        // 实现重定向的效果：
//        return "redirect:/bbb.jsp";
    }


    // 以返回 ModelAndView 的方式，实现页面跳转
    @RequestMapping("/h5")
    public View hello5(){

        View view = new InternalResourceView("/WEB-INF/page2/abc.jsp");

        return view;
    }

    // 以返回字符串的形式，回写数据
    @RequestMapping(value = "/h6")
    @ResponseBody  // 告诉SpringMVC 这个方法是用来返回数据的
    public ArrayList<Student> hello6(){
        // 返回 JSON 格式的数据
        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(16);

        Student student2 = new Student();
        student2.setName("张三");
        student2.setAge(16);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);

        // 想要让 SpringMVC 自动将我们返回的数据转为 JSON 格式
        return students;
    }

}
