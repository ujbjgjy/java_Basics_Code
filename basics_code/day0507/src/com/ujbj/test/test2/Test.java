package com.ujbj.test.test2;

public class Test {
    public static void main(String[] args) {
        LiHua liHua = new LiHua();
        Husky husky = new Husky();

        liHua.behavior();
        liHua.eat();
        liHua.drink();

        System.out.println("---------------");
        husky.heme();
        husky.behavior();
        husky.eat();
        husky.drink();
    }
}
