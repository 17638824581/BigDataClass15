package com.dahua.homework;

// 统计学生成绩
public class StudentResults {
    public static void main(String[] args) {

        // 长度12 的代表学生成绩的数组
        int[] scores = {72,89,65,58,87,91,53,82,71,93,76,68};

        // 表示 A 级的学生人数

        int[] counts = new int[5];

        // 通过遍历 成绩
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>=90){
                counts[4]++;
            }else if(scores[i]>=80){
                counts[3]++;
            }else if(scores[i]>=70){
                counts[2]++;
            }else if(scores[i]>=60){
                counts[1]++;
            }else{
                counts[0]++;
            }
        }

        System.out.println("A等级\tB等级\tC等级\tD等级\tE等级");
        System.out.println(counts[4]+"\t\t"+counts[3]+"\t\t"+counts[2]+"\t\t"+counts[1]+"\t\t"+counts[0]);

    }
}
