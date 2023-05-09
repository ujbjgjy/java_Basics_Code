package com.ujbj.test.test4;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        Shopping shopping = new Shopping();

        Goods g1 = new Goods("001", "小米", 2000, new Date());
        Goods g2 = new Goods("002", "华为", 2000, new Date());
        Goods g3 = new Goods("003", "三星", 2000, new Date());
        Goods g4 = new Goods("004", "卫龙", 2.5, new Date());

        shopping.addGoods(g1);
        shopping.addGoods(g2);
        shopping.addGoods(g3);
        shopping.addGoods(g4);
        shopping.printGoods();
    }
}
