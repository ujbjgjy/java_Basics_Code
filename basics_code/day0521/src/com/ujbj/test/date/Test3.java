package com.ujbj.test.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    /**
     * 假设，你初恋的出生年月日为：2000-11-11
     * 请用字符串表示这个数据，并将其转换为：2000年11月11日
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse("2000-11-11");

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf2.format(date));
    }
}
