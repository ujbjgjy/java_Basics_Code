package com.ujbj.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) {
        String str = "Java自从95问世以业，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长"
                + "期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史的舞台";
        // 定义规则
        Pattern p = Pattern.compile("Java\\d{0,2}");
        // 文本匹配器
        Matcher m = p.matcher(str);

        while (m.find()) {
            System.out.println(m.group());
        }
    }

    private static void matcherDome() {
        String str = "Java自从95问世以业，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长"
                + "期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史的舞台";
        // pattern: 模式 表示正则表达式
        // Matcher: 文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取。大串中去找符合匹配规则的子串
        // 获取正则表达式的对象(只能通过静态的方法获取对象)
        Pattern p = Pattern.compile("Java\\d{0,2}");
        // 获取文本匹配器的对象
        //  m要在str中找符合p的规则的小串
        Matcher m = p.matcher(str);

        // 拿着文本匹配器从头开始读取，寻找有满足规则的子串
        // 如果没有，方法返回false
        // 如果有，返回true。在底层记录子串的起始索引和结束引+1
        boolean b = m.find();
        // 会把截取的小串进行返回。
        String s1 = m.group();
        System.out.println(s1);
    }
}
