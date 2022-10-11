package com.dahua.array;

public class Homewoke {
    public static void main(String[] args) {


        // 创建一个长度为 100 的数组，赋初始值 1~100
//        int[] arr = new int[100];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i+1;
//
//            System.out.print(arr[i]+", ");
//        }
//        System.out.println();


        // 判断数组是否有序

//        int[] arr = {88,15,26,478,95,65,32,15,48};


        // 通过冒泡排序 将 arr 排序
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] < arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        // 使用布尔型的变量 表示 数组是否递增
        // b1 表示 arr 是否递增
//        boolean b1 = true;
//        // b2 表示 arr 是否递减
//        boolean b2 = true;
//
//        // 判断 arr 是否递增
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] > arr[i+1]){
//                b1 = false;
//                break;
//            }
//        }
//
//        // 判断 arr 是否递减
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] < arr[i+1]){
//                b2 = false;
//                break;
//            }
//        }
//
//        //  通过 b 判断 arr 是否递增
//        if (b1 || b2){
//            System.out.println("arr 有序的");
//        }else{
//            System.out.println("arr 是无序的");
//        }

        // 数组 插入元素

        // 如何将元素 10，插入到 索引 4 的位置

//        // 表示要查的元素
//        int value = 10;
//        // 表示要插的位置
//        int insertIndex = 0;
//
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//
//        // 1. 扩充数组
//        int[] newArr = new int[arr.length + 1];
//        // 2. 把原数组的元素挪到新数组中。
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i];
//        }
//        arr = newArr;
//
//        // 3. 把 10 插入到 索引 4 的位置
//        //   3.1 将索引4以及之后的元素往后挪一位
//        for (int i = arr.length-2; i >= insertIndex ; i--) {
//            arr[i+1] = arr[i];
//        }
//        //   3.2 再把要插的元素放到 索引 4 号位上
//        arr[insertIndex] = value;
//
//
//
//
//        // 打印插入完成后的 arr
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+", ");
//        }
//        System.out.println();



    }
}
