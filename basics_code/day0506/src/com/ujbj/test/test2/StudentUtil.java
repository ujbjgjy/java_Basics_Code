package com.ujbj.test.test2;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }

    public static int getStudentMax(ArrayList<Student> list) {
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int value = list.get(i).getAge();
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
}
