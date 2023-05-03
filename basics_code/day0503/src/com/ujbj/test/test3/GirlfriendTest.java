package com.ujbj.test.test3;

public class GirlfriendTest {
    /**
     * 定义数组存储4个女朋友的对象
     * 女朋友的属性：姓名、年龄、性别、爱好
     * 要求1：计算出四个女朋友的平均年龄
     * 要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来。
     */
    public static void main(String[] args) {
        Girlfriend[] gf = new Girlfriend[4];
        gf[0] = new Girlfriend("小红", 18, "女", "睡觉");
        gf[1] = new Girlfriend("小绿", 30, "女", "喜欢吃炸鸡");
        gf[2] = new Girlfriend("小白", 28, "女", "爱运动");
        gf[3] = new Girlfriend("小黑", 24, "女", "爱打游戏");
        int sum = 0;
        for (int i = 0; i < gf.length; i++) {
            sum += gf[i].getAge();
        }
        int average = sum / gf.length;
        System.out.println("average = " + average);
        int count = 0;
        for (int i = 0; i < gf.length; i++) {
            if (gf[i].getAge() < average) {
                count++;
                System.out.println(gf[i].getName() + ", " + gf[i].getGender() + ", " + gf[i].getAge() + ", " + gf[i].getHobby());
            }
        }
    }
}
