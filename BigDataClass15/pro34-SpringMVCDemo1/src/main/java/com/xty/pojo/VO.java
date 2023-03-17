package com.xty.pojo;

import java.util.ArrayList;

/*
*
*  VO：ValueObject 指的是数据对象，用来让SpringMVC 借由VO封装数据
* */
public class VO {
    private ArrayList<Student> studentList;

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "studentList=" + studentList +
                '}';
    }
}
