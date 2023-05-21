package com.ujbj.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test6 {
    /**
     * 有如下文本，请按照要求爬取数据。
     * Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11,因为这两个是长
     * 期支持版本，下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台
     * 需求1：爬取版本号为8,11,17的java文本，但是只要java,不显示版本号。
     * 需求2：爬取版本号为8,11,17的java文本。正确爬取结果为：Java8 Java11 Java17 Java17
     * 需求3：爬取除了版本号为8,11,17的java文本
     */
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11,因为这两个是长" +
                "期支持版本，下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";
        // 需求1: 爬取版本号为8,11,17的java文本，但是只要java,不显示版本号
        //  ?=8|11|17 获取java的文本，但是后面必须是8，11，17但不包含
        String regex1 = "(?i)java(?=8|11|17)";
        // 需要2: 爬取版本号为8,11,17的java文本。正确爬取结果为：Java8 Java11 Java17 Java17
        //  ?:8|11|17
        String regex2 = "(?i)java(?:8|11|17)";
        // 需求3：爬取除了版本号为8,11,17的java文本
        //  ?! 获取后面不是8，11，17
        String regex3 = "(?i)java(?!8|11|17)";

        regexDome(regex1);
        regexDome(regex2);
        regexDome(regex3);
    }

    public static void regexDome(String regex) {
        String str = "java自从95年问世以来，经历了很多版本，目前企业中用的最多的是JAVA8和Java11,因为这两个是长" +
                "期支持版本，下一个长期支持版本是Java17,相信在未来不久JavA17也会逐渐登上历史舞台";

        Pattern p = Pattern.compile(regex);
        Matcher m =  p.matcher(str);
        System.out.println("----------------");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
