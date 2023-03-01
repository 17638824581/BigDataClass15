package com.xty.json;

import com.alibaba.fastjson.JSON;
import com.xty.bean.Student;

/*
*  测试 FastJson 怎么使用
* */
public class TestFastJson {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        student.setSex("男");

        // 使用 FastJson 将对象转为 JSON 格式的字符串
        String s = JSON.toJSONString(student);

        System.out.println("s = " + s);

        // 能不能将 JSON 格式的字符串，再转为 Java 对象?
        Student newStu = JSON.parseObject(s, Student.class);

        System.out.println("newStu = " + newStu);
    }
}
