package com.xty.pfc;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class PhoneFlowMapper extends Mapper<LongWritable, Text, Text, Flow> {

    // 提前初始化输出的 K、V
    private Text outK = new Text();

    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, Flow>.Context context) throws IOException, InterruptedException {
        // 1. 获取当前行数据      1	13736230513	192.196.100.1	www.music163.com	2481	24681	200
        String line = value.toString();

        // 2. 把手机号、上行流量分割出来
        String[] datas = line.split("\t");  // [1, 13736230513, 192.196.100.1, www.music163.com, 2481, 24681, 200]

        // 3. 手机号
        String number = datas[1];
        // 4. 上行流量
        long upFlow = Long.parseLong(datas[datas.length-3]);
        // 5. 下行流量
        long downFlow = Long.parseLong(datas[datas.length-2]);

        // 将上行、下行流量封装为 Flow 对象
        Flow flow = new Flow(upFlow, downFlow);

        // 填充要写出的 K、V
        outK.set(number);

        // 5. 写出数据
        context.write(outK,flow);
    }
}
