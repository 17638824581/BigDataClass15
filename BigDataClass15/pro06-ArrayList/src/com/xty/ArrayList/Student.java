package com.xty.ArrayList;

public class Student {
    // 成员变量
    private String id;      //学号
    private String name;    //姓名
    private int age;        //年龄
    private String gender;  //性别

    // 构造方法
    public Student() {
    }

    public Student(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // 成员方法

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // 功能性的成员方法
    public void printSelf(){
        System.out.println("大家好，我叫"+this.name+"，我今年"+this.age+"岁，我是个"+this.gender);
    }

    // toString() 方法，作用是可以自定义对象转换为字符串的内容
    public String toString(){
        return "Student{name="+this.name+", age="+this.age+", gender="+this.gender+", id="+this.id+"}";
    }

}
