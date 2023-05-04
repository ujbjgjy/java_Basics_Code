package com.ujbj.test.test4;

import java.util.Scanner;

public class StudentTest {
    /**
     * 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
     * 学生的属性：学号，姓名，年龄。
     * 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
     * 要求2：添加完毕之后，遍历所有学生信息。
     * 要求3：通过id删除学生信息
     * 如果存在，则删除，如果不存在，则提示删除失败。
     * 要求4：删除完毕之后，遍历所有学生信息。
     * 要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
     */
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student(1, "张三", 18);
        arr[1] = new Student(2, "王五", 28);
        arr[2] = new Student(3, "李四", 38);
        int count = 3;
        while (count-- > 0) {
            Student student = new Student( 10 + count, "赵四", 12);
            if (addStudentInfo(arr, student) != null) {
                arr = addStudentInfo(arr, student);
            } else {
                System.out.println("有重复的id");
            }
        }
        ergodic(arr);

    }

    // 遍历学生信息
    public static void ergodic(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + ", " + arr[i].getName() + ", " + arr[i].getAge());
            }
        }
    }

    // 判断有相同id
    public static boolean compare(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                // 发现有相同id
                if (arr[i].getId() == id) return true;
            }
        }
        // 没有相同的
        return false;
    }

    public static Student[] addStudentInfo(Student[] arr, Student student) {
        if (!compare(arr, student.getId())) {
            Student[] newArr = new Student[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    newArr[i] = arr[i];
                }
            }
            newArr[arr.length] = student;
            return newArr;
        } else {
            return null;
        }
    }
}
