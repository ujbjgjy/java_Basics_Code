package com.ujbj.objectTest.test1;

public class Girlfriend {

    private String name;
    private String gender;
    private int age;

    public void setName(String num) {
        // 判断名字是否违规
        this.name = num;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        } else {
            System.out.println("年龄不合适");
        }
    }
    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        // 判断
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void hobby() {
        System.out.println("喜欢我");
    }

    public void appearance() {
        System.out.println("肤白貌美大长腿");
    }
}
