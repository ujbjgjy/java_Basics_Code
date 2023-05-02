package com.ujbj.objectTest.test1;

public class GirlfriendTest {
    public static void main(String[] args) {
        Girlfriend girlfriend = new Girlfriend();
        girlfriend.setName("怜瑾");
        girlfriend.setGender("女");
        girlfriend.setAge(18);
        System.out.println(girlfriend.getName());
        System.out.println(girlfriend.getGender());
        System.out.println(girlfriend.getAge());
        girlfriend.hobby();
        girlfriend.appearance();
    }
}
