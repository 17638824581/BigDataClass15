package com.xty.sort;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class SortMapper extends Mapper<LongWritable, Text, AllFlow, Text> {

    private AllFlow outK = new AllFlow();
    private Text outV = new Text();

    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, AllFlow, Text>.Context context) throws IOException, InterruptedException {

        // 获取当前行数据
        String line = value.toString();

        // 分割出总流量
        String[] split = line.split("\t");
        String sum = split[split.length - 1];

        // K/V 赋值
        outK.flow = Long.parseLong(sum);
        outV.set(value);

        // 写出k/v
        context.write(outK, outV);
    }
}
