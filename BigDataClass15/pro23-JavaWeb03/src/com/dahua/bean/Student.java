package com.dahua.bean;

public class Student {
    private String name;
    private int age;
    private double price;
    private String location;

    public Student() {
    }

    public Student(String name, int age, double price, String location) {
        this.name = name;
        this.age = age;
        this.price = price;
        this.location = location;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", location='" + location + '\'' +
                '}';
    }
}
