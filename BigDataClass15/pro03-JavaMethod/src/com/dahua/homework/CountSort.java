package com.dahua.homework;

// 实现计数排序法
public class CountSort {

    public static void main(String[] args) {


        // 计数排序法
        int[] arr = {15,984,31,548,32,15,15,15,15,15,15,153,56,15,612,5};

        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            // 遍历 arr 找出有多少个元素比 num 小
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < num){
                    count++;
                }
            }

            // 只要要填充的位置上已经有一个相同的元素了,就往后找一位
            while(newArr[count] == num){
                count++;
            }
            // 把 num存储到新数组中的 count 索引位上
            newArr[count] = num;
        }

        System.out.println("原数组:");
        T1.printArray(arr);
        System.out.println("新数组:");
        T1.printArray(newArr);

    }
}
