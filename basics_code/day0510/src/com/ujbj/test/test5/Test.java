package com.ujbj.test.test5;

public class Test {
    public static void main(String[] args) {
        PingPongCoach ppc = new PingPongCoach("乒乓球教练", 40);
        BasketballCoach bbc = new BasketballCoach("篮球教练", 32);
        PingPong pp = new PingPong("乒乓球运动员", 20);
        Basketball bb = new Basketball("篮球运动员", 19);

        System.out.printf("%-10s\t%d\n", ppc.getName(), ppc.getAge());
        ppc.work();
        System.out.printf("%-10s\t%d\n", pp.getName(), pp.getAge());
        pp.work();
        pp.english();
        System.out.printf("%-10s\t%d\n", bbc.getName(), bbc.getAge());
        bbc.work();
        System.out.printf("%-10s\t%d\n", bb.getName(), bb.getAge());
        bb.work();
        bb.english();
    }
}
