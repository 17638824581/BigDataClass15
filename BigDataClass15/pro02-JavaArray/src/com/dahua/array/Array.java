package com.dahua.array;

public class Array {

    // 这就是一个方法，主方法，是java程序的入口
    public static void main(String[] args) {
        // 基本数据类型（四类八种）
        //   1. 整数类
        //      字节型  byte
        //      短整型  short
        //      整形    int
        //      长整型  long
        //   2. 浮点数类
        //      单精度浮点数  float
        //      双精度浮点型  double
        //   3. 字符类
        //       char
        //   4. 布尔类
        //       boolean

        // 字符串型， String

        // 数组 Array
        //   存储一组数据


        // 定义一个字符串类型的数组，大量存储 名字
        // 给数组存储数据
        // 方式一：初始化数组（在创建数组的时候，就给定它内容）
//        String[] names = {"张三","李四","王五","马六","田七"};

        // 方式二：初始化数组(在创建数组的时候，指定数组的长度)
//        String[] names = new String[30];     // 创建一个长度为 5 的 String 类型的数组

        // 怎么给数组的内容赋值
//        names[0] = "张三";        // 给 names 数组的 0 号索引位置 赋值为 ”张三“
//        names[1] = "李四";
//        names[2] = "王五";
//        names[3] = "马六";
//        names[4] = "田七";

        // 数组一旦创建，它的长度就无法改变了。



        // 怎么访问 数组中的数据？
        //  数组名[索引号]
        //  names[5] 表示，访问 names 数组中的 5 号索引元素


        //  数组 是有长度的，数组中存储了多少个元素，数组的长度就是多少
        //   数组名.length ，可以获取数组的长度
//        System.out.println(names.length);




        // 数组的长度是固定的，一旦创建，长度无法改变
//        int[] arr = {99,88,77};

        // 在Java中，数据类型除了 基本数据类型之外，其他数据全都是引用数据类型。
        // 基本数据类型，byte、int、short、long、double、char、float、boolean
        // 引用数据类型，默认值统一都是  null。

        // 1. 通过内容创建数组
        // 2. 通过长度创建数组(数组元素内容是这个类型的默认值)(常用)

        // String 类型，是    引用数据类型。
        // 数组，是           引用数据类型。

        // 引用数据类型：变量之间互相传递的是，内存地址


        // 基本数据类型：变量之间互相传递的是，数据本身

        // 基本数据类型
//        int a = 10;
//        int b = a;
//
//        a = 20;
//
//        System.out.println(b);

        // 引用数据类型
//        int[] arr1 = new int[3];
//        arr1[0] = 100;
//
//        int[] arr2 = arr1; // 引用传递，arr1将它持有的内存地址给了arr2
//
//        arr1[0] = 0;
//        System.out.println(arr2[0]);





        // 电脑是如何存储数据的

        // 计算机组成
            //1. 运算器
            //2. 控制器
            //3. 存储器（存储数据）
                // 外存储器（硬盘、u盘、光盘、软盘、磁盘）
                    // 永久性存储数据
                // 内存储器（内存条）
                    // 易失性存储（内存条一旦断电，数据就会丢失）
                    //
            // 手机 （8G(运行内存大小)+256G(储存大小)）

            //4. 输入设备
            //5. 输出设备


//        int[] arr1 = {10,20,30,50};
//
//        int[] arr2 = {50,40,30};
//
//        arr1[0] = 99;
//
//        System.out.println(arr2[0]);

        // 索引越界异常
//        int[] a = new int[10];

        // 空指针异常
//        System.out.println(a.length);

        // 字符串，引用数据类型
//        String[] a = new String[10];
//        a[0] ="我爱你";
//
//        System.out.println(a[0].length());



        // 通过内容创建数据
//        int[] arr = {15,26,48,59,78,11,48};
//
//        // 获取数组中的最值
//        // 最大值
//        int max = arr[0];
//        // 最小值
//        int min = arr[0];
//
//        for (int i = 0; i < arr.length ; i++) {
//
//            if (arr[i] > max){
//                max = arr[i];
//            }
//            if (arr[i] < min){
//                min = arr[i];
//            }
//        }
//
//        System.out.println("数组中的最大值为："+max);
//        System.out.println("数组中的最小值为："+min);

        // 通过 for 循环对 arr 数组进行遍历
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


        // 二维数组，数组中的元素还是数组
//        int[][] arr = {
//                    {15,26,48},
//                    {15,79,45,99,26},
//                    {88,99,100},
//                    {12,23,45,23},
//                    {78,12,45},
//                    {66,88,77,626,62,62,32}};

        // 通过长度创建二维数组
//        int[][] arr2 = new int[10][15];




        // 遍历外层数组
//        for (int i = 0; i < arr.length; i++) {
//            // 遍历子数组
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+", ");
//            }
//            System.out.println();
//        }


        // 1. 数组反转

        // 方式一：通过新建数组的方式，反转数组
//        int[] newArr = new int[arr.length];
//
//        // 倒着将 arr 的元素，搬到 newArr 中。
//        int j = 0;
//        for (int i = arr.length-1; i >= 0 ; i--) {
//            newArr[j] = arr[i];
//            j++;
//        }

        // 方式二：通过交换前后对应位置的元素
//        for (int i = 0; i < arr.length/2; i++) {
//
//            // 交换对应位置元素
//            int temp = arr[arr.length-1-i];
//            arr[arr.length-1-i] = arr[i];
//            arr[i] = temp;
//        }
//
//        // newArr 就是最后反转完成的 arr 打印 newArr
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+", ");
//        }


        // 2. 数组元素排序
//        int[] arr = {15, 12,97 , 18, 48, 54,  32, 88, 41, 1,  59, 32, 65};
//
//        // 冒泡排序
//        for (int i = 0; i < arr.length - 1; i++) {
//            //  每次对比相邻的两个元素，只要前面的元素比后面的大，就交换他俩的位置。
//            for (int j = 0; j < arr.length-1-i; j++) {
//                // 如果前面的元素，比后面的大，则交换位置
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
//        // 遍历打印排好序之后的数组
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+", ");
//        }
//        System.out.println();


        // 选择排序
//        for (int j = 0; j < arr.length-1; j++) {
//            // 每次循环，找未排序部分的最小元素的位置
//            int min = arr[j];
//            int minIndex = j;
//            for (int i = j; i < arr.length; i++) {
//                if (arr[i]<min){
//                    min = arr[i];
//                    minIndex = i;
//                }
//            }
//
//            // 把找到的最小元素，和未排序部分最前面的元素交换位置
//            int temp = arr[minIndex];
//            arr[minIndex] = arr[j];
//            arr[j] = temp;
//        }
//
//        // 遍历打印排好序之后的数组
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+", ");
//        }
//        System.out.println();


        // 数组遍历
        // 二维数组
        // 数组排序
            // 1. 选择排序
            // 2. 冒泡排序
        // 数组反转

        // 查找数组元素

        // 1. 查找指定的元素在不在数组中

        // b 表示有没有找到指定的元素，默认为false
//        int[] a = {15,49,8,6,23,15,48,95,6,251,84,0};
//        boolean b = false;
//
//        for (int i = 0; i < a.length; i++) {
//            // 当找到指定的元素时，b设为 true
//            if(a[i] == 6){
//                b = true;
//                break;
//            }
//        }
//
//        // 根据 b 打印结果
//        if (b == true){
//            System.out.println("有！");
//        }else{
//            System.out.println("没有！");
//        }


        // 2. 查找指定的元素在数组的位置（索引）
//        int[] a = {15,49,8,6,251,23,15,48,95,6,251,84,0};
//
//        int num = 251;   // 要找的元素
//        int index = -1; // 表示找到的元素所在的位置
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == num){
//                index = i;
//                break;
//            }
//        }
//
//        // 根据index来打印结果
//        if(index==-1){
//            System.out.println("数组中不存在这个元素");
//        }else{
//            System.out.println("找到了，索引为："+index);
//        }

        // 3. 找某一个元素 在数组中 有几个，时间复杂度，O(n)
//        int[] a = {15,49,8,20,6,251,23,15,48,95,6,20,20,251,84,0};
//
//        int b = 20;         // b 表示要找的那个元素
//        int count = 0;      // count 表示要找的元素有几个，默认为0个
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == b){
//                count++;
//            }
//        }
//
//        System.out.println(b+"在a数组中有"+count+"个");

        // 3. 优化查找算法（二分查找法）

        // 用二分查找，前提 这数组是一个有序的数组
//        int[] a = {15,49,8,20,6,251,23,15,48,95,6,20,20,251,84,0,999};
//
//        // 找 84 在 a 数组中的位置
//        int num = 999;
//
//        // 使用冒泡
//        for (int i = 0; i < a.length-1; i++) {
//            for (int j = 0; j < a.length-1-i; j++) {
//                if (a[j] > a[j+1]){
//                    int temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//            }
//        }
//        // 排好序后：0, 6, 6, 8, 15, 15, 20, 20, 20, 23, 48, 49, 84, 95, 251, 251, 999
//
//        // 需要两个索引表示范围
//        int left = 0;
//        int right = a.length - 1;
//
//        while(right != left){
//            // 计算中间位置
//            int center =  left+(right-left)/2;
//            // 使用二分查找
//            if(num == a[center]){
//                left = center;
//                break;
//            // 如果 num > a[index] 代表着 num 在 a[index] 的右边
//            }else if(num > a[center]){
//                // 下一次就找 后半部分中间的索引
//                left = center+1;
//            }else if(num < a[center]){
//                right = center-1;
//            }
//        }
//
//        // 因为当 left == right 时，循环才会结束
//        // 所以当 left 和 right 同时指向一个元素时，这个元素就是 我们要找的 或这 要找的元素并不存在
//        if(a[left] != num){
//            System.out.println("数组中没有"+num);
//        }else{
//            System.out.println(num+"在数组中的位置是："+left);
//        }



    }
}
