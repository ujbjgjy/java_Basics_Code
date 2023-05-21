package com.ujbj.test.date;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    /**
     * 肯打鸡限时秒杀
     * 秒杀开始时间: 2023年11月11日 00:00:00
     * 秒杀结束时间: 2023年11月11日 00:10:00
     * 需求
     * 小贾下单并付款的时间为：2023年11月11日00:01:00
     * 小皮下单并付款的时间为：2023年11月11日00:11:00
     * 用代码说明这两位同学有没有参加上秒杀活动？
     * @param args
     */
    public static void main(String[] args) throws ParseException {
        // 格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        // 1. 获取秒杀开始和结束的时间戳
        Date start = sdf.parse("2023年11月11日 00:00:00");
        Date end = sdf.parse("2023年11月11日 00:10:00");
        // 2. 分别获取小贾和小皮的下单的时间戳
        long xiaoJia =  sdf.parse("2023年11月11日 00:01:00").getTime();
        long xiaoPi =  sdf.parse("2023年11月11日 00:11:00").getTime();

        if (xiaoJia >= start.getTime() && xiaoJia <= end.getTime()) {
            System.out.println("小贾付款成功");
        } else {
            System.out.println("小贾未付款成功");
        }

        if (xiaoPi >= start.getTime() && xiaoPi <= end.getTime()) {
            System.out.println("小皮付款成功");
        } else {
            System.out.println("小皮未付款成功");
        }

    }
}
