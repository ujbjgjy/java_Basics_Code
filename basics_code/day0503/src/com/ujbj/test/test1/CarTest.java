package com.ujbj.test.test1;

import java.util.Scanner;

public class CarTest {
    /**
     * 定义数组存储3部汽车对象。
     * 汽车的属性：品牌，价格，颜色。
     * 创建三个汽车对象，数据通过键盘录入而来，并把数据存入到数组当中
     */
    public static void main(String[] args) {
       Car[] car = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < car.length; i++) {
            Car c = new Car();
            System.out.println("第" + (i + 1) + "辆车");
            System.out.print("请输入汽车品牌:> ");
            c.setBrand(sc.next());
            System.out.print("请输入汽车价钱:> ");
            c.setPrice(sc.nextInt());
            System.out.print("请输入汽车颜色:> ");
            c.setColor(sc.next());
            car[i] = c;
        }
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i].getBrand() + ", " + car[i].getPrice() + "," + car[i].getColor());
        }
    }
}
