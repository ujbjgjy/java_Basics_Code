package com.ujbj.test.test2;

public class PhoneTest {
    /**
     * 定义数组存储3部手机对象。
     * 手机的属性：品牌，价格，颜色。
     * 要求，计算出三部手机的平均价格
     */
    public static void main(String[] args) {
        // 定义三个空的类，
        Phone[] phone = new Phone[3];
        phone[0] = new Phone("小米", 2999, "橘黄");
        phone[1] = new Phone("三星", 1000, "白色");
        phone[2] = new Phone("华为", 2000, "黑色");
        int sum = 0;
        for (int i = 0; i < phone.length; i++) {
            sum += phone[i].getPrice();
        }
        int average = sum / phone.length;
        System.out.println(average);
    }
}
