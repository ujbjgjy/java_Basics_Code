package com.ujbj.test.test3;

public class Test {

    public static void main(String[] args) {
        Dog d = new Dog("狗子", 3);
        Frog f = new Frog("青蛙", 32);
        Rabbit r = new Rabbit("兔子", 123);
        System.out.printf("%s\t%d\n", d.getName(), d.getAge());
        d.eat();
        d.swim();
        System.out.println();
        System.out.printf("%s\t%d\n", f.getName(), f.getAge());
        f.eat();
        f.swim();
        System.out.println();
        System.out.printf("%s\t%d\n", r.getName(), r.getAge());
        r.eat();
    }

    public static void timer(int timeNum) {
        long t = System.currentTimeMillis();
        long curTime = System.currentTimeMillis();
        while (curTime - t <= timeNum) curTime = System.currentTimeMillis();
    }
}
