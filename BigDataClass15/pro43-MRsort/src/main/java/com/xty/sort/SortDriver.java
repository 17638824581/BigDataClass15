package com.xty.sort;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class SortDriver {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {

        Configuration conf = new Configuration();
        Job job = new Job(conf);

        job.setMapperClass(SortMapper.class);
        job.setReducerClass(Reducer.class);

        job.setMapOutputKeyClass(AllFlow.class);
        job.setMapOutputValueClass(Text.class);

        job.setOutputKeyClass(NullWritable.class);
        job.setOutputValueClass(Text.class);

        // 指定排序规则
//        job.setSortComparatorClass();
//        new RawComparator<>()

        FileInputFormat.setInputPaths(job,new Path("F:\\Desktop\\flow_data"));
        FileOutputFormat.setOutputPath(job,new Path("F:\\Desktop\\flow_data_out"));

        job.setJarByClass(SortDriver.class);

        job.waitForCompletion(true);


    }
}
