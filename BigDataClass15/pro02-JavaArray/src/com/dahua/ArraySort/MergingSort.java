package com.dahua.ArraySort;


import java.util.Arrays;

// 归并排序
public class MergingSort {

    // 拆分数组
    public static int[][] breakUpArray(int[] arr){
        int[] arr1 = new int[arr.length/2];
        int[] arr2 = new int[arr.length-arr1.length];

        // 将 arr 中的元素依次填入 arr1 和 arr2
        for (int i = 0; i < arr.length; i++) {
            if(i<arr1.length){
                arr1[i] = arr[i];
            }else{
                arr2[i-arr1.length] = arr[i];
            }
        }

        return new int[][]{arr1,arr2};
    }


    /*
     * 接收两个整形数组，将两个数组中的内容合并为新数组并返回
     * @param arr1: 代表第一个要合并的数组
	 * @param arr2: 代表第二个要合并的数组
     * @return int[]: 合并完成的数组
     * @author Mr.yu
     * @date 2022/10/17 17:47
     */
    public static int[] mergeArray(int[] arr1, int[] arr2){
        int[] newArr = new int[arr1.length+arr2.length];

        // 定义一个代表索引的变量
        int index = 0;

        // forEach 迭代器
        for (int item: arr1) {
            newArr[index] = item;
            index++;
        }

        for (int item: arr2) {
            newArr[index] = item;
            index++;
        }

        return newArr;
    }


    // 归并排序
    public static int[] mergingSort(int[] arr){
        // 首先判断数组长度能不能拆
        if(arr.length>1){
            // 1.首先拆开arr
            int[][] ints = breakUpArray(arr);

            int[] arr1 = ints[0];
            int[] arr2 = ints[1];

            // 2.排序并合并
            return mergeArray(mergingSort(arr1),mergingSort(arr2));

        }else{
            return arr;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = {};

        int[][] ints = breakUpArray(arr1);

        System.out.println("前半部分:"+Arrays.toString(ints[0]));
        System.out.println("前半部分:"+Arrays.toString(ints[1]));

        // 使用 for 循环遍历数组
        // 通过 i 代表索引
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 100;
//        }

//        System.out.println(Arrays.toString(arr));
//
//        // 使用 forEach 迭代器遍历数组
//        // 拿变量 i 遍历 arr 中的内容
//        // 使用 forEach 时候，无法修改数组的元素
//        for(int item:arr){
//            item = 100;
//        }
    }

}
