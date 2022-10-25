package com.xty.StudentArrayList;

public class Main {
    public static void main(String[] args) {

        //   存储学生到容器中，可以是数组，
//        Student[] stus = new Student[33];

        // 使用我们自己写的 MyStudentList 来存储学生数据
        MyStudentList my = new MyStudentList();



        // 为了让容器更好用，增、删、改、查
        // 从数组的基础上，将数组打包


        my.add(new Student("张无忌", 20, "男", "s02"));
        my.add(new Student("李逍遥", 15, "男", "s03"));
        my.add(new Student("令狐冲", 19, "男", "s04"));



        my.add(3,new Student("令狐冲", 19, "男", "s05"));


        System.out.println(my.getSize());


//        System.out.println(stus[0]);
//        System.out.println(stus[1]);
//        System.out.println(stus[2]);
//        System.out.println(stus[3]);

        System.out.println(my);
    }
}
