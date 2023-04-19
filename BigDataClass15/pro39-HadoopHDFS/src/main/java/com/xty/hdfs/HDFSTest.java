package com.xty.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HDFSTest {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        // 要操作 HDFS，先获取对 HDFS 的连接

        // 1. 先连接 HDFS 系统 ---> 创建一个 文件系统对象

        // 需要传入一个配置对象
        Configuration conf = new Configuration();

        String uri = "hdfs://hadoop101:9820";
        // fileSystem 就是我们 HDFS 的连接对象
        FileSystem fileSystem = FileSystem.get(new URI(uri), conf, "hdp");

        // 2. 通过调用方法来操作 HDFS
        boolean mkdirs = fileSystem.mkdirs(new Path("/test"));

        System.out.println("mkdirs = " + mkdirs);

        // 3. 关闭文件系统的连接
        fileSystem.close();
    }
}
