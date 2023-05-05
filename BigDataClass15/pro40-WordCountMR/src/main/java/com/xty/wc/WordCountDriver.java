package com.xty.wc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.CombineTextInputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

/*
*  WordCountDriver 是 MR 程序的驱动类，将来执行 MR 程序的时候，实际上就是来执行我们
*   这个驱动类，驱动类中写主方法，在主方法中。我们主要需要将 RM 程序的 Map、Reduce 端整合为 一个 Job 对象。
*   并设置 Job 对象相关的参数，最后提交执行 Job 。
* */
public class WordCountDriver {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        // 1. 初始化 Job 对象
        Configuration conf = new Configuration();

        Job job = new Job(conf);


        // 2. 设置 Job 的 Mapper 类
        job.setMapperClass(WordCountMapper.class);
        // 3. 设置 Job 的 Reducer 类
        job.setReducerClass(WordCountReducer.class);
        // 4. 设置 Job 的 Map 阶段输出的 K,V 类型
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);
        // 5. 设置 Job 最终输出的 K,V 类型。
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        // 设置 CombineTextInputFormat 的虚拟切片的最大值，设置为 40MB
        CombineTextInputFormat.setMaxInputSplitSize(job,41943040);
        // 设置 Job 使用的 InputFormat 类型为 CombineTextInputFormat
        job.setInputFormatClass(CombineTextInputFormat.class);

        // 6. 设置 Job 的 jar
        // MR 如果在本地运行，setJarByClass()
        job.setJarByClass(WordCountDriver.class);
        // MR 如果要在集群上运行，setJar() ：设置 jar 包的位置。
//        job.setJar("F:\\Code\\Java\\github\\BigDataClass15\\pro40-WordCountMR\\target\\pro40-WordCountMR-1.0-SNAPSHOT.jar");

        // 7. 设置 Job 的输入数据的路径
//        FileInputFormat.setInputPaths(job,new Path("/jianai"));
        FileInputFormat.setInputPaths(job,new Path("F:/Desktop/wc"));
        // 8. 设置 Job 的输出数据的路径
//        FileOutputFormat.setOutputPath(job,new Path("/jianai_out"));
        FileOutputFormat.setOutputPath(job,new Path("F:/Desktop/wc_out"));

        // 9. 提交Job，并等待执行。
        job.waitForCompletion(true);
    }
}
