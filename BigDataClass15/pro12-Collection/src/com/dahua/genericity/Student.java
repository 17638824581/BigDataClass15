package com.dahua.genericity;

public class Student extends Person{

    private String banji;

    public Student() {
    }

    public Student(String name, int age, String banji) {
        super(name, age);
        this.banji = banji;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + super.getName()+ ", " +
                "age=" + super.getAge()+ ", " +
                "banji='" + banji + '\'' +
                "}";
    }
}
