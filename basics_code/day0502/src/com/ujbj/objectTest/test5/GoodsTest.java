package com.ujbj.objectTest.test5;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] goods = new Goods[3];
        goods[0] = new Goods(001, "小米", 2999, 300);
        goods[1] = new Goods(002, "水果", 20, 200);
        goods[2] = new Goods(003, "牛奶", 30, 100);

        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].getId() + ", " + goods[i].getName() + ", " + goods[i].getPrice()+ ", " + goods[i].getCount());
        }
    }
}
