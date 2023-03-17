package com.xty.converter;

import org.springframework.core.convert.converter.Converter;

import java.util.Date;

/*
*  一个用于将 String 转为 Date 的转换器
* */
public class String2DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        // 进行转换  s 它是 时间戳的格式
        long l = Long.parseLong(s);
        Date date = new Date(l);
        return date;
    }
}
