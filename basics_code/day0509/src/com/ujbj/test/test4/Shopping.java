package com.ujbj.test.test4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Shopping {
    private ArrayList<Goods> list = new ArrayList<>();
    public Shopping() {
    }

    public void addGoods(Goods goods) {
        list.add(goods);
    }

    public void printGoods() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            System.out.printf("商品ID:%s\t名字:%s\t价钱:%.2f\t日期:%s\n", goods.getId(), goods.getName(), goods.getPrice(), sdf.format(goods.getDate()));
        }
    }
}
