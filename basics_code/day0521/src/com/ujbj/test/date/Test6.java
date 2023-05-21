package com.ujbj.test.date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test6 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(Instant.ofEpochMilli(1000L));

        ZonedDateTime time = now.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        Instant time2 = Instant.ofEpochSecond(60L, 1000000L);
        System.out.println(time2);
    }
}
