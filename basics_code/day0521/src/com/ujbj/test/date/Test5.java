package com.ujbj.test.date;

import java.time.ZoneId;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
        ZoneId zoneId1 = ZoneId.systemDefault();
        System.out.println(zoneId1);
        ZoneId zoneId2 = ZoneId.of("America/Cuiaba");
        System.out.println(zoneId2);
    }
}
