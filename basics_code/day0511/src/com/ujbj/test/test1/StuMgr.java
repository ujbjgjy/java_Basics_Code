package com.ujbj.test.test1;

import java.util.ArrayList;

public class StuMgr {
    private ArrayList<Student> list = new ArrayList<>();

    public StuMgr() {
    }

    public void addStu(Student s) {
        list.add(s);
    }

    public void showAll() {
        System.out.println("学号\t姓名\t性别");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getGender());
        }
    }
}
