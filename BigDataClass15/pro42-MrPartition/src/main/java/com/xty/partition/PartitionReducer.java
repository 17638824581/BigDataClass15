package com.xty.partition;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class PartitionReducer extends Reducer<Text, LongWritable, Text, LongWritable> {

    // 提前初始化 输出的 K，V 对象
    private Text outK = new Text();
    private LongWritable outV = new LongWritable();

    @Override
    protected void reduce(Text key, Iterable<LongWritable> values, Reducer<Text, LongWritable, Text, LongWritable>.Context context) throws IOException, InterruptedException {
        // 统计每一个单词的总次数
        long sum = 0;
        for (LongWritable value : values) {
            long l = value.get();
            sum += l;
        }
        // 给 K/V 赋值
        outK.set(key);
        outV.set(sum);

        // 写出 reduce 阶段的结果
        context.write(outK, outV);
    }
}
