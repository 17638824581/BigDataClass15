package com.xty.sort;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class SortReducer extends Reducer<AllFlow, Text, NullWritable, Text> {

    private NullWritable outK = NullWritable.get();
    private Text outV = new Text();

    @Override
    protected void reduce(AllFlow key, Iterable<Text> values, Reducer<AllFlow, Text, NullWritable, Text>.Context context) throws IOException, InterruptedException {

        // 遍历相同总流量的数据
        for (Text value : values) {
            context.write(outK, value);
        }
    }
}
