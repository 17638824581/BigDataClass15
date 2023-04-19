package com.xty.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.permission.FsPermission;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

public class HDFSTest2 {

    // 文件上传
    @Test
    public void fileUpload() throws URISyntaxException, IOException, InterruptedException {

        // 总共四个配置文件：

        // 1. Hadoop 内置默认的配置文件： xxxx-default.xml
        // 2. Hadoop 服务器中 hadoop安装目录/etc/hadoop/ 的自定义配置文件：xxxx-site.xml
        // 3. Java 项目中，resoureces 目录下的自定义配置文件： xxxx-site.xml
        // 4. Java 项目中，Configuration 的对象

        // 配置文件的优先级：  Configuration > Java 项目中的 xxxx-site.xml > Hadoop安装目录中的 xxxx-site.xml >  Hadoop 内置的默认配置


        // 如果我们在 Configuration 中配置了一些内容
        // Configuration 中的配置项优先级是最高的

        // 其次就是项目中的 xxx-site.xml 配置文件
        // 项目中的 xxx-site.xml  配置文件的优先级 要比 hadoop 默认的配置文件优先级要高

        Configuration conf = new Configuration();

        FileSystem fileSystem = FileSystem.get(new URI("hdfs://hadoop101:9820"), conf, "hdp");

        Path src_file = new Path("F:\\Desktop\\排序.psd");

        // 调用方法来实现文件上传
        fileSystem.copyFromLocalFile(src_file,new Path("/"));

        // 关闭连接
        fileSystem.close();
    }


    @Test
    // 文件下载
    public void fileDownload() throws IOException, URISyntaxException, InterruptedException {
        // 1. 先获取 HDFS 连接
        Configuration conf = new Configuration();

        FileSystem fileSystem = FileSystem.get(new URI("hdfs://hadoop101:9820"),conf,"hdp");

        // 2. 调用方法，下载文件
        fileSystem.copyToLocalFile(true,new Path("/排序.psd"), new Path("F:\\Desktop\\download"),false);

        // 3. 关闭连接
        fileSystem.close();
    }

    // 删除文件和目录
    @Test
    public void deleteFiles() throws URISyntaxException, IOException, InterruptedException {
        //1. 先创建 HDFS 连接
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://hadoop101:9820"), new Configuration(), "hdp");

        // 2. 调用方法
        boolean delete = fileSystem.delete(new Path("/test"), true);
        System.out.println(delete);

        // 3. 关闭连接
        fileSystem.close();
    }

    // 文件更名和移动
    @Test
    public void fileRename() throws URISyntaxException, IOException, InterruptedException {
        //1. 先创建 HDFS 连接
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://hadoop101:9820"), new Configuration(), "hdp");

        // 2. 调用方法
        fileSystem.rename(new Path("/斗破苍穹.txt"),new Path("/doupocangqiong.txt"));

        // 3. 关闭连接
        fileSystem.close();
    }

    // 查看文件的详细信息
    @Test
    public void fileStutas() throws URISyntaxException, IOException, InterruptedException {
        //1. 先创建 HDFS 连接
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://hadoop101:9820"), new Configuration(), "hdp");

        FileStatus[] fileStatuses = fileSystem.listStatus(new Path("/datas"));

        for (FileStatus fileStatus : fileStatuses) {
            String name = fileStatus.getPath().getName();
            System.out.println("name = " + name);
        }


        // 2. 调用方法
//        FileStatus fileStatus = fileSystem.getFileStatus(new Path("/phone_data.txt"));
//
//        // 获取文件状态信息会得到 FileStatus 对象
//        // 获取文件名
//        String name = fileStatus.getPath().getName();
//        System.out.println("name = " + name);
//
//        long len = fileStatus.getLen();
//        System.out.println("len = " + len/1024.0 +"kb" );
//
//        String owner = fileStatus.getOwner();
//        String group = fileStatus.getGroup();
//        System.out.println("owner = " + owner);
//        System.out.println("group = " + group);
//
//        long accessTime = fileStatus.getAccessTime();
//        Date date = new Date(accessTime);
//        System.out.println("accessTime = " + date.toLocaleString());
//
//        long modificationTime = fileStatus.getModificationTime();
//        Date date2 = new Date(modificationTime);
//        System.out.println("modificationTime = " + date2.toLocaleString());
//
//        FsPermission permission = fileStatus.getPermission();
//        System.out.println("permission = " + permission);
//
//        boolean file = fileStatus.isFile();
//        System.out.println("isFile = " + file);
//
//
//        System.out.println("fileStatus = " + fileStatus);



        // 3. 关闭连接
        fileSystem.close();
    }

    // 在 Java 去遍历整个 HDFS 系统的所有文件？
    // 并打印所有文件的信息
    @Test
    public void traverseHdfs() throws IOException, URISyntaxException, InterruptedException {

        FileSystem fileSystem = FileSystem.get(new URI("hdfs://hadoop101:9820"), new Configuration(), "hdp");

        // 调用递归遍历方法
        printFile(fileSystem, "/");

        fileSystem.close();
    }

    // 递归遍历目录
    public static void printFile(FileSystem fs, String path) throws URISyntaxException, IOException, InterruptedException {

        // 获取当前路径下所有文件信息
        FileStatus[] fileStatuses = fs.listStatus(new Path(path));

        // 遍历这些文件信息
        for (FileStatus fileStatus : fileStatuses) {

            // 判断当前 fileStatus 是不是文件
            if (fileStatus.isFile()){
                // 是文件，就打印出文件信息
                Path p = fileStatus.getPath();
                System.out.println(p);
            }else{
                // 是目录，递归调用当前方法，遍历这个目录下的内容
                printFile(fs, String.valueOf(fileStatus.getPath()));
            }
        }

    }





}
