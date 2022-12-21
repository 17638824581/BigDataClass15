package com.xty.StudentDAO;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

// 专门来测试 StudnetDao 类
public class StudentDaoTest {

    @Test
    public void getAll() {
        // 测试 getAll() 方法
        StudentDao studentDao = new StudentDao();
        List<Student> all = studentDao.getAll();
        System.out.println(all);
    }

    @Test
    public void getAllByName() {
        // 测试 getAllByName() 方法
        StudentDao studentDao = new StudentDao();
        List<Student> l = studentDao.getAllByName("小张");
        System.out.println(l);
    }

    @Test
    public void getById(){
        // 测试 getById() 方法
        StudentDao studentDao = new StudentDao();
        Student s = studentDao.getById(7);
        System.out.println(s);
    }

    @Test
    public void deleteById(){
        //从测试 deleteById() 方法
        StudentDao studentDao = new StudentDao();
        boolean b = studentDao.deleteById(6);
        System.out.println("是否删除成功："+b);
    }

    @Test
    public void addStudent(){
        // 测试 addStudent() 方法
        StudentDao studentDao = new StudentDao();
        // 创建一个学生对象
        Student student = new Student();
        // 给学生对象属性赋值
        student.setS_name("奥利艾");

        System.out.println(student);


        boolean b = studentDao.addStudent(student);

        System.out.println("是否插入成功："+b);
    }

    @Test
    public void addStudent2(){
        // 测试另一种插入学生信息的方法
        StudentDao studentDao = new StudentDao();
        boolean b = studentDao.addStudent("王大锤", "男", 88, 15);
        System.out.println("是否插入成功："+b);
    }

    @Test
    public void updateStudent(){
        // 测试 修改学生信息的方法 updateStudent()
        StudentDao studentDao = new StudentDao();

        // 假如，我们要修改 id = 9 这个学生的名字
//        // 1. 通过 id 来获取这个学生信息(直接就获取到了这个学生对象)
//        Student s = studentDao.getById(9);
//        System.out.println("修改之前"+s);
//        // 2. 直接对这个学生对象修改名字
//        s.setS_name("奥利奥");
//        System.out.println("修改之后"+s);
//        // 3. 调用 updateStudent() 方法，更新这条数据
//        studentDao.updateStudent(9,s);


        // 假如我们在修改学生信息的时候，没有先查这个学生信息，而是直接创建了一个新的学生对象
        // 假如我们要修改 id = 8 的这条数据
        Student student = new Student();
        System.out.println("修改之前："+student);
        student.setS_name("老二");
        System.out.println("修改之后"+student);

        studentDao.updateStudent(8,student);

    }


}