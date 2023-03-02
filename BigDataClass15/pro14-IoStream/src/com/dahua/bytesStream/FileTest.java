package com.dahua.bytesStream;

import java.io.File;

// File 类 测试
public class FileTest {
    public static void main(String[] args){

        // File 是文件的意思
        // File 类代表的是一个（文件/目录）的地址

        // 假如说，我想要通过java程序打开 abc.txt 这个文件
        // 想要将 abc.txt 这个文件中的内容读取到java程序中

        // 文件位置：需要去告诉 java 程序，我们要打开的文件的位置 是在哪儿
        // 描述一个文件的位置，我们需要清楚的描述它所在的位置

        // 绝对路径：从盘符（C:、 D:等）开始描述的路径
        // 相对路径：由 . 或 .. 开头的，就是相对路径
        //  ./ 代表的是从本文件目录开始
        //  ../ 代表的是本文件目录的上一层目录


        // 遍历打印某一个目录下的所有 文件、文件夹
//        String path1 = "F:\\Code";
//        File file = new File(path1);
//
//
//        printFiles(file);

        // 能不能给一个文件名，找到这个文件在哪
//        String name = "01.jpg";
//        String path = "C:\\Users\\";
//
//        serachFilename(name,new File(path));



        // renameTo() 更改文件路径及文件名

        // delete() 删除本file 代表的文件路径

        // list() 获取本file代表的文件路径下的所有 文件、文件夹 的名称，返回 String[]
//        String[] list = file.list();
//        System.out.println(Arrays.toString(list));

        // listFiles() 获取本file代表的文件路径下所有的 文件、文件夹 所构成的 File 对象， 返回 File[]
//        File[] files = file.listFiles();
//        System.out.println(Arrays.toString(files));


//        if (file.exists()){
//            System.out.println("已存在，不需要创建！");
//        }else{
//            // 获取 file 表示的文件的目录路径（不包含文件名）
//            String parent = file.getParent();
//            new File(parent).mkdirs();
//            System.out.println("创建所有必须的父目录");
//            // 创建 abc.txt 文件
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("创建出最后的文件");
//        }


//        File file = new File("./pro14-IoStream/itgeek/java.txt");
//
//
//        // 先把 file 所代表的路径拆为 路径 + 文件名
//        String parent = file.getParent();
//        // 1. 先创建必要的父目录
//        new File(parent).mkdirs();
//        // 2. 再创建下面的文件
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        File file = new File("D://");
        printFiles(file);

    }

    // 查找文件位置的方法，提供文件名 和 初始查找路径
    public static void serachFilename(String name, File path){
        File[] files = path.listFiles();
        if (files == null) return;
        for (File f : files) {
            if (f.isFile()){
                if (f.getName().equals(name)) {
                    System.out.println(f);
                }
            }else{
                serachFilename(name, f);
            }
        }
    }

    // 使用递归，来遍历 File 路径下面的所有文件、文件夹
    public static void printFiles(File f){
        // 如果 f 代表的是文件
        if(f.isFile()){
            System.out.println("文件："+f);
        // 如果 f 代表的是 文件夹的路径
        }else{
            System.out.println("文件夹："+f);
            // 获取 f 下面的所有路径
            File[] files = f.listFiles();
            if (files == null) return;
            for (File file : files) {
                printFiles(file);
            }
        }
    }
}
