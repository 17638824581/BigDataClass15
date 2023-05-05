package com.xty.partition;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class PartitionDriver {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        // 1. 创建 Job 对象
        Configuration conf = new Configuration();
        Job job = new Job(conf);

        // 2. 指定 MR 程序的 Mapper 和 Reducer 类
        job.setMapperClass(PartitionMapper.class);
        job.setReducerClass(PartitionReducer.class);

        // 3. 指定 Map 阶段输出K/V类型
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(LongWritable.class);

        // 4. 指定 MR 程序最终输出 K/V 类型
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(LongWritable.class);

        // 指定 分区数量
        job.setNumReduceTasks(5);

        // 按照 a-p 分到一个区 q-z 开头的分到另一个区
        // 指定自定义的分区器
        job.setPartitionerClass(MyPartition.class);

        // 5. 指定 MR 程序输入数据路径
        FileInputFormat.setInputPaths(job,new Path("F:\\【重要】讲课文件\\Java大数据资料\\7、Hadoop\\测试数据\\jianai"));

        // 6. 指定 输出数据路径
        FileOutputFormat.setOutputPath(job,new Path("F:\\Desktop\\out"));

        // 7. 指定 jar
        job.setJarByClass(PartitionDriver.class);

        // 8. 提交并运行job
        job.waitForCompletion(true);

    }
}
