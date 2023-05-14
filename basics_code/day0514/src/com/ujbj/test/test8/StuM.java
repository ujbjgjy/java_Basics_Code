package com.ujbj.test.test8;

import java.util.ArrayList;

public class StuM extends ArrayList<Student> {
    public void showAll() {
        for (int i = 0; i < this.size(); i++) {
            Student s =  this.get(i);
            System.out.printf("学号:%s\t姓名:%s\t性别:%s\n", s.getId(), s.getName(), s.getGender());
        }
    }
}
