package com.ujbj.test.classroom.test2;

import org.apache.log4j.Logger;

public class Test {
    public static void main(String[] args) {
// 通过反射机制 获取到类的类名
        Logger logger = Logger.getLogger(Test.class.getName());
        try {
            int i = 3 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("报错了，除数为0了哦。");
        }
    }
}
