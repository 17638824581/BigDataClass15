package com.xty.homework;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException {
        // 使用字节流，尝试复制多级文件夹

        // 要复制的文件夹
        String srcDir = "F:\\【重要】讲课文件\\大华\\大数据十五班\\资料";
        // 复制到的位置
        String tarDir = "C:\\Users\\XTY\\Desktop";

        copyDir(new File(srcDir), new File(tarDir));

    }

    /**
     * 通过递归的思想，复制多级文件夹，到指定位置下
     * @param source: 要复制的文件或文件夹路径。
     * @param target: 要复制到的目标位置。
     * @return void
     * @author Mr.yu
     * @date 2022/11/16 15:26
     */
    public static void copyDir(File source,File target) throws IOException {
        // 1. 先判断f是不是null
        if (source==null) return;
        // 2. 再判断f存不存在
        if (source.exists() == false) return;

        // 计算出 source 应该复制到的位置
        File newFile = new File(target, source.getName());

        // 如果 source 所表示的路径是一个文件
        if (source.isFile()){
            // 开始复制文件
            // 1. 根据 source 源文件路径，创建字节输入流
            FileInputStream fis = new FileInputStream(source);
            BufferedInputStream bis = new BufferedInputStream(fis);
            // 2. 跟根据 newFile 复制后文件的位置，创建字节输出流
            FileOutputStream fos = new FileOutputStream(newFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            // 3.从字节输入流中读取数据，再写入字节输出流中。
            byte[] bytes = new byte[2048];
            int len;
            while ((len=bis.read(bytes,0,bytes.length)) != -1){
                bos.write(bytes,0,len);
            }
            // 4. 关闭输入、输出流
            bos.close();
            fos.close();
            bis.close();
            fis.close();

        // 如果 source 表示的是一个目录，则我们需要创建这个目录，还需要将目录中的文件进行处理
        }else{
            // 先创建目录
            if (newFile.exists() == false){
                newFile.mkdirs();
            }
            // 遍历源文件夹下面的所有内容
            File[] files = source.listFiles();
            if (files == null) return;
            for (File file : files) {
                // 通过递归的方式将源文件夹 source 的内容，复制到计算出的目标文件夹 newFile 下面
                copyDir(file,newFile);
            }
        }

    }
}
