package com.ujbj.test.test1;

public class Test {
    public static void main(String[] args) {
        Husky husky = new Husky();
        LiHua liHua = new LiHua();
        System.out.println("猫");
        liHua.eat();
        liHua.drink();
        liHua.CatchingMice();
        System.out.println("狗");
        husky.drink();
        husky.eat();
        husky.seeHome();
        husky.breakHome();
        System.out.println("----------");
    }
}
