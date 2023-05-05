package com.xty.wc;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/*
*  Reducer类，是 MR 程序中 负责执行 Reduce 阶段任务的核心类。
*    1. 让类去继承 Hadoop 提供的 Reducer 类
*    2. 设置 Reducer 端的，输入数据的 K，V 类型（应该和 Mapper 端的输出的 K，V 类型相对应），输出数据的 K，V 类型。
*    3. 重写 Reducer 类的 reduce() 方法，并编写 reduce 阶段的业务处理逻辑。
*
* */
public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

    // 初始化 Reduce 阶段输出的 K 和 V
    private Text outK = new Text();
    private IntWritable outV = new IntWritable();

    @Override
    // reduce() 方法，会将 Map 阶段输出的数据以相同的 key 封装为一组，value 封装为一个迭代器，传入 reduce() 方法来处理。
    // 每一组相同的 key 的数据执行一次 reduce() 方法。
    protected void reduce(Text key, Iterable<IntWritable> values, Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
        // key ： 会是一个 单词 a
        // values ： 会是这个单词作为key，所对应的所有 value 的迭代器。 [1,1]

        // 计算当前 key 的单词的总的出现次数。
        int sum = 0;
        for (IntWritable value : values) {
            sum += value.get();
        }

        // 封装要输出的 k，v 的值
        outK.set(key);
        outV.set(sum);

        // 调用 Context 对象的 write() 方法写出最终结果
        context.write(outK,outV);
    }
}
