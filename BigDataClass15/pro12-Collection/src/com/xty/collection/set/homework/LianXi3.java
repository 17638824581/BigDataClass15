package com.xty.collection.set.homework;

import com.xty.collection.set.homework.Student;

import java.util.ArrayList;

public class LianXi3 {
    public static void main(String[] args) {
        ArrayList<Student> stus = new ArrayList<>();

        stus.add(new Student("小红",18,"女生","13838812345","大数据",57,36,34));
        stus.add(new Student("小黄",19,"男生","13636665431","H5",43,75,58));
        stus.add(new Student("小橙",16,"女生","15935512457","大数据",77,76,76));
        stus.add(new Student("小白",18,"女生","16648485975","UI",14,27,48));
        stus.add(new Student("小紫",41,"男生","18935458482","UI",68,86,95));
        stus.add(new Student("小绿",42,"女生","13848495921","大数据",75,83,34));
        stus.add(new Student("小青",35,"男生","15758496153","H5",24,47,57));
        stus.add(new Student("小蓝",29,"男生","16848491532","UI",75,75,84));
        stus.add(new Student("小黑",24,"女生","13849845151","大数据",68,60,94));
        stus.add(new Student("小金",16,"男生","17684845215","UI",98,66,16));
        stus.add(new Student("小银",24,"男生","15948465152","大数据",75,47,68));
        stus.add(new Student("小碳",35,"女生","16684841515","大数据",48,88,43));
        stus.add(new Student("小氮",37,"女生","13184845123","UI",78,77,88));
        stus.add(new Student("小氧",31,"男生","15184846515","大数据",77,57,99));
        stus.add(new Student("小氟",28,"男生","17841984666","大数据",68,68,55));
        stus.add(new Student("小氖",24,"男生","18913848471","H5",94,49,44));
        stus.add(new Student("小钠",26,"男生","13548496629","大数据",86,37,33));
        stus.add(new Student("小镁",38,"女生","19948416587","H5",73,18,77));
        stus.add(new Student("小铝",14,"男生","13654848415","H5",27,98,88));
        stus.add(new Student("小硅",27,"女生","19984851512","大数据",37,76,43));

        // 1. 找出所有总分大于 200 分的学生
//        ArrayList<Student> stus1 = new ArrayList<>();
//
//        for (Student student : stus) {
//            if (student.getChineseScore()+student.getMathScore()+student.getEnglishScore() > 200){
//                stus1.add(student);
//            }
//        }
//
//        System.out.println(stus1);

        // 2. 找出所有手机号为 138 和 168 开头的学生
//        ArrayList<Student> stus2 = new ArrayList<>();
//
//        for (Student student : stus) {
//           if (student.getPhone().substring(0,3).equals("138") || student.getPhone().substring(0,3).equals("168")){
//               stus2.add(student);
//           }
//        }
//
//        for (Student student : stus2) {
//            System.out.println(student);
//        }

        // 3. 找出所有班级为“大数据班” 且 总分小于 150 分的 男生 学生

        // 4. 找出所有班级为 ”大数据“或”H5“ 的女生 并按成绩排序

        // 5. 找出总分前 5 名学生

        // 6. 找出总分倒数前 5 名的 男生。

        // 7. 找出所有未成年学生，并按成绩排序。

        // 8. 找出”大数据“ 和 ”h5“班，已成年学生 且 分数大于 150 的学生人数。

        // 9. 找出所有手机号以 1和8结尾的 未成年男生，按成绩排序

        // 10. 找出语文 50~60 分 和 60 ~70 分 和 70~80 分中最高分的三个学生。

    }
}
