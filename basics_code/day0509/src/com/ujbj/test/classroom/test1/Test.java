package com.ujbj.test.classroom.test1;

public class Test {
    public static void main(String[] args) {
        Animal[] arr = new Animal[3];
        arr[0] = new Cat("猫", 4);
        arr[1] = new Duck("鸭", 2);
        arr[2] = new Dolphin("海豚");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Terrestial) {
                System.out.println(arr[i].getName() + "\t" + ((Terrestial) arr[i]).getLenNum());
            } else {
                System.out.println(arr[i].getName() + "\t" + 0);
            }
        }
    }
}
