package com.ujbj.test.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        dome1();
        dome2();
    }

    private static void dome1() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss EE");
        // 方法: format 格式化(日期对象 -> 字符串)
        String formatDate = sdf.format(new Date());
        System.out.println(formatDate);
    }

    public static void dome2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd mm:ss");
        // 方法: parse 解析(字符串 -> 日期对象)
        // 注意字符串对象格式要和SimpleDateFormat一致
        String str = "2003-07-13 00:00";
        Date date = sdf.parse(str);
        System.out.println(date.getTime());
    }
}
