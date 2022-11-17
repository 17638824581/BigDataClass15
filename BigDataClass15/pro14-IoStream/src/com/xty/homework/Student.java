package com.xty.homework;

import java.io.Serializable;

// Student 实现 Serializable 接口即可序列化
public class Student implements Serializable{
    private String id;
    private String name;
    private int age;
    private transient String location;

    // 使用序列化版本号
    private static final long serialVersionUID = 1L;

    public Student() {
    }

    public Student(String id, String name, int age, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
