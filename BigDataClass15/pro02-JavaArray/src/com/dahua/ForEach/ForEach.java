package com.dahua.ForEach;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {

        int[] arr = {1,32,45,6,589,595};

        // 遍历数组
        // 1. for 循环遍历

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 100;
//        }


        // 另一种遍历数组的方式——迭代器forEach
        // 当对数组进行的都是 读取 的操作
        // 无法修改数组内容
        for(int item : arr){
            System.out.println(item);
        }

        System.out.println(Arrays.toString(arr));

    }
}
