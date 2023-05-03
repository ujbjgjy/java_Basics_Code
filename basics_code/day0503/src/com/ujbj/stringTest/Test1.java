package com.ujbj.stringTest;

import java.util.Scanner;

public class Test1 {
    /**
     * 用户登录
     * 需求：已知正确的用户名和密码，请用程序实现模拟用户登录。
     * 总共给三次机会，登录之后，给出相应的提示
     */
    public static void main(String[] args) {
        String userName = "张三";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入用户名:> ");
            String s1 = sc.next();
            System.out.print("请输入用户密码:> ");
            String s2 = sc.next();
            if (userName.equals(s1) && password.equals(s2)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("登录失败，你还有" + (2 - i) + "次");
            }
        }
    }
}
