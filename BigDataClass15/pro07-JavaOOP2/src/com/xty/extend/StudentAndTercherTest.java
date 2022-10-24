package com.xty.extend;

public class StudentAndTercherTest {
    public static void main(String[] args) {

        Person person = new Person("亚当", 18, "男");

        Student student = new Student("小明", 20, "男生");

        System.out.println("student.getName() = " + student.getName());
        System.out.println("student.getAge() = " + student.getAge());
        System.out.println("student.getGender() = " + student.getGender());


//        Student student = new Student();
//
//        student.setName("小张");
//        student.setAge(18);
//        student.setGender("男生");
//
//        System.out.println("student.getName() = " + student.getName());
//        System.out.println("student.getAge() = " + student.getAge());
//        System.out.println("student.getGender() = " + student.getGender());
//
//        student.study();
//
//
//        Teacher teacher = new Teacher();
//
//        teacher.setName("李老师");
//        teacher.setAge(35);
//        teacher.setGender("男生");
//
//        System.out.println("teacher.getName() = " + teacher.getName());
//        System.out.println("teacher.getAge() = " + teacher.getAge());
//        System.out.println("teacher.getGender() = " + teacher.getGender());
//
//
//        teacher.teaching();

    }
}
