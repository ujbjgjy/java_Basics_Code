package com.ujbj.test.test4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    // 创建按钮对象
    JButton btn1 = new JButton("按钮1");
    JButton btn2 = new JButton("按钮2");
    public MyJFrame() {
        this.setSize(600, 500);
        this.setTitle("事件演示");
        ImageIcon icon = new ImageIcon("E:\\图片\\IKUN军火库\\78540369.jpeg");
        this.setIconImage(icon.getImage());
        // 置顶
        this.setAlwaysOnTop(true);
        // 界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认的居中位置
        // Layout:布局
        this.setLayout(null);
        // 添加事件，参数需要一个接口是ActionListener的实现类，this是ActionListener接口的实现类
        btn1.addActionListener(this);
        btn1.setBounds(50, 50, 100, 50);
        btn2.addActionListener(this);
        btn2.setBounds(100, 200, 100, 50);
        this.getContentPane().add(btn1);
        this.getContentPane().add(btn2);
        // 显示界面
        this.setVisible(true);
    }

    @Override
    // action: 动作 Performed:执行
    //  this 和 ActionEvent相同的接口
    public void actionPerformed(ActionEvent e) {
        // 对当前的按钮进行判断
        // 获取当前的被操作的那个按钮对象
        Object source = e.getSource();
        if (source == btn1) {
            btn1.setSize(200, 200);
        } else if (source == btn2) {
            // Location: 位置
            Random r = new Random();
            btn2.setLocation(r.nextInt(500), r.nextInt(500));
        }
    }
}
