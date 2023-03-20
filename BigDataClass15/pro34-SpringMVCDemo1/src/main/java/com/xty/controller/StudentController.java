package com.xty.controller;

import com.xty.mapper.StudentMapper;
import com.xty.pojo.Student;
import com.xty.pojo.VO;
import com.xty.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/getAll")
    public ModelAndView getAll(ModelAndView mav) throws FileNotFoundException {
        List<Student> all = null;
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        all = mapper.getAll();

        FileInputStream fileInputStream = new FileInputStream("F:\\Desktop\\新建 文本文档.txt");

        mav.addObject("students", all);
        mav.setViewName("/student.jsp");

        sqlSession.commit();
        sqlSession.close();
        return mav;
    }

    @RequestMapping(value = "/delete", params = {"id"})
    @ResponseBody
    public String deleteById(int id) {   //接收基本类型的参数，只需要在控制器方法的参数列表标识出来，形参的名字要和参数名称一致
        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            mapper.deleteById(id);
            sqlSession.commit();
        }
        return "success";
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public String add(VO vo) {   //接收基本类型的参数，只需要在控制器方法的参数列表标识出来，形参的名字要和参数名称一致
        System.out.println("vo = " + vo);
        ArrayList<Student> studentList = vo.getStudentList();


        return "success";
    }

    @RequestMapping(value = "/addJson")
    @ResponseBody
    public String addJson(@RequestBody List<Student> list, String json) {   //接收基本类型的参数，只需要在控制器方法的参数列表标识出来，形参的名字要和参数名称一致

        System.out.println("list = " + list);
        System.out.println("json = " + json);

        return "success";
    }

    @RequestMapping(value = "/param")
    @ResponseBody
    public String getParam(@RequestParam(value = "mm", defaultValue = "佚名") String name) {
        System.out.println("name = " + name);
        return "哈哈";
    }

    @RequestMapping(value = "/testRestful/{id}", method = {RequestMethod.GET})
    @ResponseBody
    public String testRestful(@PathVariable Integer id) {
        System.out.println("收到 restful 的 GET 请求！");

        System.out.println("获取 id = " + id + "的数据....");
        return "哈哈";
    }

    @RequestMapping(value = "/testRestful", method = {RequestMethod.POST})
    @ResponseBody
    public String testRestful1() {
        System.out.println("收到 restful 的 POST 请求！");

        System.out.println("添加数据....");
        return "哈哈";
    }

    @RequestMapping(value = "/testRestful/{id}", method = {RequestMethod.DELETE})
    @ResponseBody
    public String testRestful2(@PathVariable Integer id) {
        System.out.println("收到 restful 的 DELETE 请求！");

        System.out.println("删除 id = " + id + "的数据....");
        return "哈哈";
    }

    @RequestMapping(value = "/testRestful/{id}", method = {RequestMethod.PUT})
    @ResponseBody
    public String testRestful3(@PathVariable Integer id) {
        System.out.println("收到 restful 的 PUT 请求！");

        System.out.println("修改 id = " + id + "的数据....");
        return "哈哈";
    }

    @RequestMapping("/getDate")
    public Object getDate(Date time) throws IOException {
        System.out.println("time = " + time);

        return new String("你好！");
    }

}
