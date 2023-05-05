package com.xty.compress;

import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.compress.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.util.ReflectionUtils;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
*  测试 Hadhoop 中提供的各种压缩方式
* */
public class CompressTest {

    // 要压缩的文件路径
    String srcFile = "F:\\Desktop\\jianai\\jianai.txt";
    // 压缩后存储的文件路径
    String destFile = "F:\\Desktop\\jianai\\jianai_ys.bz2";

    /**
     * 压缩文件测试
     */
    @Test
    public void compress() throws IOException {
        // 1. 创建输入流读取文件数据
        FileInputStream fis = new FileInputStream(srcFile);

        // 2. 创建输出流写出数据
        FileOutputStream fos = new FileOutputStream(destFile);

        // 3. 使用 Haodop 提供的反射工具类，来创建指定类型的 压缩编解码器对象
        Configuration conf = new Configuration();
        Class<BZip2Codec> codecClass = BZip2Codec.class;  // 使用 bz2 压缩格式
        CompressionCodec compressionCodec = ReflectionUtils.newInstance(codecClass, conf);

        // 4. 使用压缩编解码器对象来创建压缩流，用于对数据进行压缩写出
        CompressionOutputStream outputStream = compressionCodec.createOutputStream(fos);

        // 5. 使用 Hadoop 中提供的工具类来读取、写出流数据
        int copy = IOUtils.copy(fis, outputStream);

        // 6. 关闭流
        IOUtils.closeQuietly(fis);
        IOUtils.closeQuietly(outputStream);
    }

    /**
     * 解压缩文件测试
     */
    @Test
    public void unCompress() throws IOException {
        // 1. 创建输入流读取 压缩文件 数据
        FileInputStream fis = new FileInputStream("F:\\Desktop\\jianai\\jianai_ys.bz2");

        // 2. 使用 Haodop 提供的反射工具类，来创建指定类型的 压缩编解码器对象
        Configuration conf = new Configuration();
        Class<BZip2Codec> codecClass = BZip2Codec.class;  // 使用 bz2 压缩格式
        CompressionCodec compressionCodec = ReflectionUtils.newInstance(codecClass, conf);

        // 3. 使用压缩编解码器对象来创建 解压缩输入流，用于对数据进行解压缩读入
        CompressionInputStream inputStream = compressionCodec.createInputStream(fis);

        // 4. 创建输出流写出数据
        FileOutputStream fos = new FileOutputStream("F:\\Desktop\\jianai\\jianai_jys.txt");

        // 5. 使用 Hadoop 中提供的工具类来读取、写出流数据
        int copy = IOUtils.copy(inputStream, fos);

        //6. 关闭流
        IOUtils.closeQuietly(inputStream);
        IOUtils.closeQuietly(fos);
    }


}
