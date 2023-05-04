package com.ujbj.stringTest;

public class Test2 {
    /**
     * 1~2 省份
     * 3~4 城市
     * 7~14 出生年、月、日
     * 15~16位 所在地派出所
     * 17位 性别(奇数男，偶数女)
     * 18位 个人信息码(随机产生)
     */
    public static void main(String[] args) {
        String str = "511181199105134124";
        String date = str.substring(6, 14);
        int gender = str.charAt(16) - '0';
        System.out.println("出生日期：" + date);
        if (gender % 2 == 0) {
            System.out.println("性别：" + "女");
        } else {
            System.out.println("性别：" + "男");
        }
    }
}
