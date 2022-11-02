package com.dateTime;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;


public class TestCalendar {

    // 输入年份，返回该年份的2月的天数
    public static int getFebDays(int year){

        // 1. 创建一个 Calendar 对象
        Calendar c = Calendar.getInstance();
        // 2. 清空参数
        c.clear();
        // 3. 设置该对象为 year 年 3 月 1日
        c.set(year,2,1);
        // 4. 使这个对象 - 1 天
        c.add(Calendar.DAY_OF_MONTH,-1);
        // 5. 获取天数
        int days = c.get(Calendar.DAY_OF_MONTH);

        return days;
    }



    public static void main(String[] args) throws ParseException {

        int febDays = getFebDays(2022);
        System.out.println(febDays);


//        Calendar c = Calendar.getInstance();
//        c.clear();
//        c.set(Calendar.YEAR,2000);
//        c.set(Calendar.MONTH,10);
//        c.set(Calendar.DAY_OF_MONTH,5);
//
//        System.out.println(DateUtils.calendarToString(c,"yyyy-MM-dd HH:mm:ss"));
//
//
//        // Calendar 类是 日历类
//        Calendar c1 = Calendar.getInstance();
//        Calendar c2 = Calendar.getInstance();
//
////        "2000-10-5"
//        Date date1 = DateUtils.stringToDate("2000-10-5", "yyyy-MM-d");
//        Date date2 = DateUtils.stringToDate("1999-10-5", "yyyy-MM-d");
//
//        // 调整日期类对象 c 所表示的时间
//        c1.setTime(date1);
//        c2.setTime(date2);
//
//        System.out.println("原本的 Calendar 时间：");
//        System.out.println(DateUtils.calendarToString(c1, "yyyy-MM-dd HH:mm:ss"));
//        System.out.println(DateUtils.calendarToString(c2, "yyyy-MM-dd HH:mm:ss"));
//
//        boolean before = c1.before(c2);
//        System.out.println("before = " + before);
//        System.out.println("判断 c1 是否是在 c2 之前的时间。");
//
//        boolean after = c1.after(c2);
//        System.out.println("after = " + after);
//        System.out.println("判断 c1 是否是在 c2 之后的时间");
//
//
//        System.out.println("---------------------------");
//
//        Calendar instance = Calendar.getInstance();
//        instance.clear();
//        instance.set(Calendar.YEAR,2001);
//        instance.set(Calendar.MONTH,2);
//        instance.set(Calendar.DAY_OF_MONTH,1);
//
//        instance.add(Calendar.DAY_OF_MONTH,-1);
//
//        System.out.println(DateUtils.calendarToString(instance,"yyyy-MM-dd"));
//
//        int leastMaximum = instance.getLeastMaximum(Calendar.DAY_OF_MONTH);
//        int i = instance.get(Calendar.DAY_OF_MONTH);
//        System.out.println(i);

    }
}
