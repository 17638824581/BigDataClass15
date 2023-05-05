package com.xty.pfc;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class PhoneFlowReducer extends Reducer<Text, Flow, Text, Flow> {

    // 提前初始化输出的 K、V
    private Text outK = new Text();
    private LongWritable outV = new LongWritable();


    @Override
    protected void reduce(Text key, Iterable<Flow> values, Reducer<Text, Flow, Text, Flow>.Context context) throws IOException, InterruptedException {
        // 1. 累加当前手机号总的上行流量
        long sumUpFlow = 0;
        long sumDownFlow = 0;

        for (Flow value : values) {
            sumUpFlow += value.getUpFlow();
            sumDownFlow += value.getDownFlow();
        }

        // 2. 填充要输出的 K、V
        outK = key;

        Flow flow = new Flow(sumUpFlow, sumDownFlow);

        // 3. 写出手机号 和 总上行流量
        context.write(outK,flow);
    }
}
