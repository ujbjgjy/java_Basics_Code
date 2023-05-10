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

    public void printInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            System.out.printf("id:%s\t名字:%s\t价钱:%d\t产地:%s\t时间:%s\n", goods.getId(), goods.getName(), goods.getPrice(), goods.getProducer(), sdf.format(goods.getDate()));
        }
    }
}
