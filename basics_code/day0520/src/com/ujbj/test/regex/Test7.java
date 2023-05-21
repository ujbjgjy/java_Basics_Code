package com.ujbj.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test7 {
    public static void main(String[] args) {
        String str = "abbbbbbb";

        String regex1 = "ab+";
        String regex2 = "ab+?";

        regexDome(str, regex1);
        regexDome(str, regex2);
    }

    private static void regexDome(String str, String regex2) {
        Pattern p = Pattern.compile(regex2);
        Matcher m = p.matcher(str);
        m.find();
        System.out.println(m.group());
    }
}
