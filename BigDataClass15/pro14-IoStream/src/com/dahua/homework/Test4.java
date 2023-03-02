package com.dahua.homework;

import java.io.*;

public class Test4 {
    public static void main(String[] args) throws IOException {

        // 使用字节流，复制单级文件夹

        // 要复制的文件夹
        String path = "F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\output";
        File f1 = new File(path);
        // 要复制到的位置
        String path2  = "C:\\Users\\XTY\\Desktop";
        File f2 = new File(path2);

        // 计算复制的目标位置 -> C:\Users\XTY\Desktop\output
        File target = new File(f2, f1.getName());
        // 判断 target 所代表的路径是否存在
        if (!target.exists()){
            // 若目标目录不存在，则创建。
           target.mkdirs();
        }

        // 复制源文件夹中的文件到目标文件夹z
        File[] files = f1.listFiles();
        // 遍历文件
        for (File file : files) {
            // 计算文件应该复制到的位置
            File newFile = new File(target, file.getName());
            // 开始复制文件
            // 1. 根据file源文件路径，创建字节输入流
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            // 2. 跟俊newFile目标路径，创建字节输出流
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
        }

    }
}
