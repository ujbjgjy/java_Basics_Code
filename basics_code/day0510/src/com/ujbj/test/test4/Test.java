package com.ujbj.test.test4;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Shopping shopping = new Shopping();

        Goods goods1 = new Goods("001", "小米", 2000, "中国", new Date());
        Goods goods2 = new Goods("002", "魅族", 1000, "中国", new Date());
        Goods goods3 = new Goods("003", "锤子", 4000, "中国",  new Date());
        Goods goods4 = new Goods("004", "华为", 3000, "中国",  new Date());
        Goods goods5 = new Goods("005", "卫龙", 2, "中国",  new Date());

        shopping.addGoods(goods1);
        shopping.addGoods(goods2);
        shopping.addGoods(goods3);
        shopping.addGoods(goods4);
        shopping.addGoods(goods5);

        shopping.printInfo();
    }
}
