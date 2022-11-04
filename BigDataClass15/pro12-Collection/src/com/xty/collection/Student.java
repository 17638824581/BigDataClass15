package com.xty.collection;

import java.util.HashMap;

public class Student {
    private String name;
    private int age;
    private double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null){
            return false;
        }

        if (!(obj instanceof Student)){
            return false;
        }

        Student stu = (Student) obj;
        if (stu.getName().equals(this.name) && stu.getAge() == this.age && stu.getScore() == this.score){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return (int) (this.name.hashCode() + this.age * 32);
    }
}
