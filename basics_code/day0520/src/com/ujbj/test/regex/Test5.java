package com.ujbj.test.regex;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("[\\d&&[^0]]\\d{5}(18|19|20)\\d{2}((0[1-9])|(1[0-2]))((0[1-9])|([12][0-9])|(3[01]))\\d{3}[xX\\d]");
        // 创建一个URL对象
        URL url = new URL("http://idcard.ifanyi.com.cn/");
        // 连接上这个网址
        URLConnection conn = url.openConnection();
        // 创建一个对象读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        // 在读取的进候每次读一整行
        String line;
        while ((line = br.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }

        br.close();
    }
}
