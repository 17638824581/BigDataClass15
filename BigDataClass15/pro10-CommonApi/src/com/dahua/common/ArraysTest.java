package com.dahua.common;

public class ArraysTest {
    public static void main(String[] args) {

        // 对 Arrays 类相关方法的测试

        // Arrays.binarySearch(arr,value); 对数组进行二分查找元素

        // Arrays.compare(arr1,arr2); 比较两个数组

//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {1,2,3,4,6};
//
//        int compare = Arrays.compare(arr1, arr2);
//
//        System.out.println("compare = " + compare);


        // Arrays.copyOf(arr, length); 以指定长度复制数组，多 0 少 截

//        int[] arr = {1,2,3,4,5};
//
//        int[] newArr = Arrays.copyOf(arr, 2);
//
//        System.out.println("newArr = " + Arrays.toString(newArr));


        // Arrays.copyOfRange(arr, form, to); 复制指定范围的数组内容

        //        int[] arr = {1,2,3,4,5};
//        int[] newArr = Arrays.copyOfRange(arr, 2, 4);
//        System.out.println("newArr = " + Arrays.toString(newArr));



        // Arrays.equals(arr1, arr2); 比较两个数组是否内容一致

//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {1,2,3,4,5};
//
//        System.out.println(Arrays.equals(arr1,arr2));



//
//        Arrays.fill(arr,10);
//        int[] arr = {1,2,3,4,5};
//        System.out.println(Arrays.toString(arr));

        // Arrays.fill(arr, i); 用元素 i 填充 arr 数组


//
//        // Arrays.mismatch(arr1, arr2); 比较两个数组内容，返回第一个不匹配的索引
//        int[] arr1 = {1,2,3,4,4,6};
//        int[] arr2 = {1,2,3,4,5,6};
//
//        int res = Arrays.mismatch(arr1, arr2);
//        System.out.println("res = " + res);


//        int[] arr = {88,55,364,879,15,3,64,89,2};

//        Student s1 = new Student("张三", 18, 88);
//        Student s2 = new Student("李四", 10, 100);
//        Student s3 = new Student("王五", 20, 30);
//        Student s4 = new Student("赵六", 30, 99);
//        Student s5 = new Student("田七", 17, 60);
//        Student s6 = new Student("王八", 88, 59);

//        Student[] stus = {s1,s2,s3,s4,s5,s6};

        // 确保 Student类实现了 Comparable 接口
//        Arrays.sort(stus);

        // 指定比较器 Comparator 进行比较排序
//        Arrays.sort(stus, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        Arrays.sort(stus, (o1,o2) -> o1.getAge()-o2.getAge());


        // Arrays.sort(arr) 升序排序数组
//        Arrays.sort(arr);

        // Arrays.sort(arr, formIndex, toIndex) 升序排序数组指定范围的元素
//        Arrays.sort(arr,3,8);

//         Arrays.sort(stus, new  ) ;

    //使用比较器对数组排序

//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-1-i; j++) {
//                // 比较前后两个元素
//                if (arr[j] < arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }


        // Arrays.toString(arr) 将数组转为字符串表达形式
//        System.out.println(Arrays.toString(stus));
    }
}
