package com.ujbj.test.test2;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }
}

class Fu {
    String name = "Fu";
    String hobby = "喝茶";
}

class Zi extends Fu {
    String name = "Zi";
    String game = "吃鸡";

    public void show() {
        System.out.println(name);
        System.out.println(super.name);
        // 局部位置找 --> 本类成员位置找 --> 父类成员位置找
        System.out.println(hobby);
        // 本类成员位置找 --> 父类成员位置找
        System.out.println(this.hobby);
        // 父类成员位置找
        System.out.println(super.hobby);
        System.out.println(game);
    }
}
