package com.xty.sort;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

// 为了自定义排序规则而封装的一个 Bean 类
public class AllFlow implements WritableComparable<AllFlow> {

    public long flow;

    public AllFlow() {
    }

    public long getFlow() {
        return flow;
    }

    @Override
    public int compareTo(AllFlow o) {
        return (int)(o.flow - this.flow);
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(this.flow);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        this.flow = in.readLong();
    }

    @Override
    public String toString() {
        return String.valueOf(this.flow);
    }
}