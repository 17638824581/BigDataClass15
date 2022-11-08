package com.xty.collection.set.homework;

import com.xty.collection.Student;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 使用 TreeSet 对学生按成绩排序
 * @author Mr.yu
 * @date 2022/11/8 11:01
 */
public class LianXi1 {
    public static void main(String[] args) {
        // 使用 Set 集合来存储多个学生信息
        Student s1 = new Student("小明", 18, 80, 34, 66);
        Student s2 = new Student("小亮", 17, 56, 17, 57);
        Student s3 = new Student("小美", 15, 54, 50, 42);
        Student s4 = new Student("小花", 13, 57, 43, 68);
        Student s5 = new Student("小白", 14, 15, 68, 96);
        Student s6 = new Student("小东", 19, 28, 95, 24);
        Student s7 = new Student("小帅", 20, 96, 75, 54);
        Student s8 = new Student("小丽", 16, 68, 44, 67);

        // TreeSet 是依靠比较器进行元素排序，如果两个元素比较结果相同。这两个元素将会被视为重复元素。

        TreeSet<Student> stus = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //计算出 o1 的总分
                double s1 = o1.getChineseScore() + o1.getMathScore() + o1.getEnglishScore();
                //计算出 o2 的总分
                double s2 = o2.getChineseScore() + o2.getMathScore() + o2.getEnglishScore();

                return s1-s2>0 ? -1 : 1;
            }
        });

        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        stus.add(s4);
        stus.add(s5);
        stus.add(s6);
        stus.add(s7);
        stus.add(s8);

        // 遍历打印 TreeSet 的元素
        for (Student student : stus) {
            System.out.println(student+"总分为："+(student.getChineseScore()+student.getMathScore()+student.getEnglishScore()));
        }
    }
}
