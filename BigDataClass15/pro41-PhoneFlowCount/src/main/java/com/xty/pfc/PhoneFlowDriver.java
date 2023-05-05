package com.xty.pfc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class PhoneFlowDriver {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {

        // 1. 创建 Job 对象
        Configuration conf = new Configuration();

        Job job = new Job(conf);

        // 2. 设置 Mapper 类
        job.setMapperClass(PhoneFlowMapper.class);

        // 3. 设置 Reducer 类
        job.setReducerClass(PhoneFlowReducer.class);

        // 4. 设置 Map 输出的 K、V 类型
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(Flow.class);

        // 5. 设置 最终输出的 K、V 的类型
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Flow.class);

//        // 指定 reduceTask 的数量
//        job.setNumReduceTasks(5);
//        // 指定 使用自定义的分区器
//        job.setPartitionerClass(PhoneNumPartitioner.class);

        // 6. 指定 Job 输入数据的路径
        FileInputFormat.setInputPaths(job,new Path("F:/Desktop/phone_data"));

        // 7. 指定 Job 输出数据的路径
        FileOutputFormat.setOutputPath(job,new Path("F:/Desktop/phone_data_out"));

        // 8. 指定 Job 的 jar
        job.setJarByClass(PhoneFlowDriver.class);

        // 9. 提交等待执行 Job
        job.waitForCompletion(true);

    }
}
