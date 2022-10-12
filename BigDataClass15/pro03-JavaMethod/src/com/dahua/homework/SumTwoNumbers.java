package com.dahua.homework;

public class SumTwoNumbers {

    // 接收一个数组，和一个整数
    // 返回一个长度为2的数组，数组中两个元素是索引
    public static int[] getIndex(int[] arr, int target){
        int aIndex = 0;
        int bIndex = 0;

        A:for (int i = 0; i < arr.length-1; i++) {
            // arr[i] 表示其中一位数
            int a = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                int b = arr[j];
                if (a+b == target){
                    System.out.println(a+"+"+b+"="+target);
                    aIndex = i;
                    bIndex = j;
                    break A;
                }
            }
        }

        return new int[]{aIndex,bIndex};
    }


    public static void main(String[] args) {
        // 给一个数组，再给一个整数 target
        // 从数组中找出两个数字，它们的和等于 target
        // 输出这两个数组的 索引

        int[] arr = {5,1,2,3,6,4,8,9,7};

        int[] index = getIndex(arr, 10);

        T1.printArray(index);


    }
}
