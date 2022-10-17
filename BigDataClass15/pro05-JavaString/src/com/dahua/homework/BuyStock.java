package com.dahua.homework;

import java.util.Arrays;

/*
 * 买股票，赚大钱
 * @author Mr.yu
 * @date 2022/10/17 11:47
 */
public class BuyStock {
    public static void main(String[] args) {
        int[] arr  = {5,12,36,50,4,45,8,9,6,34,2,20,15,4};

        int max = method(arr);

        System.out.println("最大利润："+max);

        int[] indexs = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            indexs[i] = i;
        }

        System.out.println("排序之前：");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(indexs));

        // 对arr进行排序
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    temp = indexs[j];
                    indexs[j] = indexs[j+1];
                    indexs[j+1] = temp;
                }
            }
        }

        System.out.println("排序之后：");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(indexs));

    }

    public static int method(int[] arr){
        // 最高的利润
        int max = 0;
        // 最低股票价格
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int m = arr[i] - min;

            if (m > max){
                max = m;
            }

            if(min > arr[i]){
                min = arr[i];
            }
        }
        return max;
    }
}
