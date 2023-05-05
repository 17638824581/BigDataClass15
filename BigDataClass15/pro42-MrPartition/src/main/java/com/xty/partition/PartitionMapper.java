package com.xty.partition;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class PartitionMapper extends Mapper<LongWritable, Text, Text, LongWritable> {

    // 提前初始化 输出的 K，V 对象
    private Text outK = new Text();
    private LongWritable outV = new LongWritable();

    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, LongWritable>.Context context) throws IOException, InterruptedException {
        // 获取当前行数据
        String line = value.toString();
        // 分割出每个单词
        String[] words = line.split(" ");

        // 遍历每个单词
        for (String word : words) {
            // 给 输出的 K/V 赋值
            outK.set(word);
            outV.set(1);

            // 写出 mapper 阶段的结果
            context.write(outK,outV);
        }
    }
}
