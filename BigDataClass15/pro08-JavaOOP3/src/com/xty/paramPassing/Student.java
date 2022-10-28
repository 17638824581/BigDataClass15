package com.xty.paramPassing;

public class Student extends Person {

    private String Class;

    public Student(){
    }

    public Student(String name, int age, String sex, String aClass) {
        super(name, age, sex);
        Class = aClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Class='" + Class + '\'' +
                '}';
    }
}
