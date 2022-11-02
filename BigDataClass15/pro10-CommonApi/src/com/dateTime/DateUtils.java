package com.dateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期操作的工具类，简化了日期格式化（Date ——> String） 和 日期字符串解析（String ——> Date） 的过程
 * @author Mr.yu
 * @date 2022/11/2 11:00
 */
public class DateUtils {
    
   /**
    * 将 Date 对象按照指定的格式 格式化为字符串，并返回。
    * @param d: 要格式化的 Date 对象
    * @param pattern: 指定的格式。
    * @return String
    * @author Mr.yu
    * @date 2022/11/2 11:04
    */
    public static String dateToString(Date d, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String str = sdf.format(d);
        return str;
    }

    /**
     * 按照给定的格式将字符串时间解析为 Date类型，并返回
     * @param time: 要解析的字符串时间。
	 * @param pattern: 解析格式
     * @return Date
     * @author Mr.yu
     * @date 2022/11/2 11:08
     */
    public static Date stringToDate(String time, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date d = sdf.parse(time);
        return d;
    }

    /**
     * 将 Calendar 对象，按照指定格式格式化为 String
     * @param c: 要格式化的 Calender 对象
     * @param pattern: 指定的格式
     * @return String
     * @author Mr.yu
     * @date 2022/11/2 11:40
     */
    public static String calendarToString(Calendar c,String pattern){
        Date time = c.getTime();
        String str = DateUtils.dateToString(time, pattern);
        return str;
    }
}
