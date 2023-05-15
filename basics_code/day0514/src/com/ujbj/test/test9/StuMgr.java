package com.ujbj.test.test9;

import java.util.ArrayList;

public class StuMgr extends ArrayList<Student> {

    public void showAll() {
        for (int i = 0; i < this.size(); i++) {
            Student s = this.get(i);
            System.out.printf("学号:%s\t\t姓名:%s\t性别:%s\n", s.getId(), s.getName(), s.getGender());
        }
        System.out.println();
    }

    public int findStu(String name) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
