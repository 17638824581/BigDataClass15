package com.dahua.homework;

public class Median {

    // 一个通用的对数组进行冒泡排序的方法，
    // 接收一个数组，
    // 对这个数组进行排序,
    // 将排好序的数组返回
    public static int[] bubbleSort(int[] arr){
        // 对arr进行排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }



    public static void main(String[] args) {
        // 给两个数组
        // 合并这两个数组，并找出中位数

        int[] arr1 = {12,48,65,87,100};
        int[] arr2 = {2,3,40,68};

        // 1. 合并两个数组
        int[] arr3 = new int[arr1.length+arr2.length];

        // 将 arr1 中的元素装到 arr3 中
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        // 将 arr2 中的元素装到 arr3中
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        // 2. 对新数组排序
        arr3 = bubbleSort(arr3);
        // 使用之前 T1 中写好的 打印数组的方法
        System.out.println("合并数组排序完成后：");
        T1.printArray(arr3);

        // 3. 找出新数组中的中位数
        // 根据数组长度决定怎么找中位数
        if (arr3.length % 2 == 1){
            System.out.println("中位数就是："+arr3[arr3.length / 2]);
        }else{
            double d = arr3[arr3.length/2] + arr3[arr3.length/2-1];
            System.out.println("中位数是："+d/2);
        }

    }
}