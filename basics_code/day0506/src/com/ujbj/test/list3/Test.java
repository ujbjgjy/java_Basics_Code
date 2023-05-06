package com.ujbj.test.list3;

import java.util.ArrayList;

public class Test {
    /**
     * 添加手机对象并返回要求的数据
     * 需求：
     * 定义Javabean类：Phone
     * Phone属性：品牌，价格。
     * main方法中定义一个集合，存入三个手机对象。
     * 分别为：小米，1000。苹果，8000。锤子2999。
     * 定义一个方法，将价格低于3000的手机信息返回。
     */
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        phones.add(p1);
        phones.add(p2);
        phones.add(p3);

        ArrayList<Phone> InfoPhone = getInfoPhone(phones);
        for (int i = 0; i < InfoPhone.size(); i++) {
            System.out.println(InfoPhone.get(i).getBrand() + "\t" + InfoPhone.get(i).getPrice());
        }
    }

    public static ArrayList<Phone> getInfoPhone(ArrayList<Phone> phones) {
        ArrayList<Phone> infoPhone = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getPrice() <= 3000) {
                infoPhone.add(phones.get(i));
            }
        }
        return infoPhone;
    }
}
