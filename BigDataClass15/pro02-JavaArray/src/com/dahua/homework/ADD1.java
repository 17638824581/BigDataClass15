package com.dahua.homework;

public class ADD1 {

    // 打印数组
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            // 判断是否是最后一个元素
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }


    public static void main(String[] args) {

        // 给你一个数组，数组中每个元素表示一个数字
        // 例如 给你 {1,2,3} 这个数组表示数字 123
        // 在这个数字的基础上 +1， 123 + 1 => 124
        // 输出由 124 组成的数组 [1,2,4]


        int[] arr = {8};

        // 表示最后一位数字的索引
        int index = arr.length-1;

        // 先判断最后一位数字是不是 9
        if(arr.length ==1 && arr[0] == 9){
            arr = new int[]{1,0};
        } else if(arr[index] == 9){
            // 使用循环找寻连续的最前面的9
            while (arr[index-1] == 9){
                arr[index] = 0;

                index -= 1;
                // 如果index 已经指向了 第二个元素
                if (index == 0 && arr[index]== 9){
                    // 只要走到这个if中，就说明整个数组全都是9
                    // 1. 新建一个数组，长度是 原数组长度+1
                    int[] arr2 = new int[arr.length + 1];
                    // 2. 新数组的第一个元素设置为 1
                    arr2[0] = 1;
                    arr = arr2;
                    break;
                }
            }

            if(index!=0){
                // 循环结束后，指向的就是排在最前面的 9 的索引
                // 1. 让 index 前面的元素 +1
                arr[index-1] += 1;
                // 2. 让 index 所代表的元素置零
                arr[index] = 0;
            }

        }else{
            arr[index] += 1;
        }

        printArray(arr);


    }
}
