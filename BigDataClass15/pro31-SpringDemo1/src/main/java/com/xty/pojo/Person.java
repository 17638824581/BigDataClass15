package com.xty.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private String name;
    private int age;
    private double money;
    private boolean isMan;
    private Student son;
    private String[] friends;
    private List<Student> students;
    private Map<String,Teacher> teachers;
    private Properties properties;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public void setSon(Student son) {
        this.son = son;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setTeachers(Map<String, Teacher> teachers) {
        this.teachers = teachers;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", isMan=" + isMan +
                ", son=" + son +
                ", friends=" + Arrays.toString(friends) +
                ", students=" + students +
                ", teachers=" + teachers +
                ", properties=" + properties +
                '}';
    }
}
