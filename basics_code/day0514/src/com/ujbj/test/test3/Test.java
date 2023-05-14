package com.ujbj.test.test3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Test {
    public static void main(String[] args) {
        // J: java Frame:框架
        JFrame jFrame = new JFrame();
        // 设置界面的宽高
        jFrame.setSize(600, 500);
        // 设置界面标题
        jFrame.setTitle("事件演示");
        ImageIcon icon = new ImageIcon("E:\\图片\\IKUN军火库\\48775524.jpeg");
        jFrame.setIconImage(icon.getImage());
        // 设置界面置顶: Always:总是 on:在 top:上面
        // AlwaysOnTop: 总在最前
        jFrame.setAlwaysOnTop(true);
        // 设置界面居中, Location:位置、地方 Relative:相对的 To: 向、方向
        //  相对位置
        jFrame.setLocationRelativeTo(null);
        // 设置关闭模式 Default:默认的 Close:关闭 Operation:操作
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认的居中放置，只有取消了才会按照才XY轴的形式添加组件
        // Layout:布局
        jFrame.setLayout(null);

        // 事件
        //  创建一个按钮对象
        JButton btn1 = new JButton("按钮1");
        JButton btn2 = new JButton("按钮2");
        JButton btn3 = new JButton("按钮3");
        //  设置位置和宽高 Bounds:界限
        btn1.setBounds(50, 50, 100, 50);
        btn2.setBounds(50, 200, 100, 50);
        btn3.setBounds(100, 400, 100, 50);
        //  添加事件，需要一个ActionListener接口的实现类
        //  Action:动作 Listener:监听器
        //   1.
        btn1.addActionListener(AbstractAction -> {
            System.out.println("1你好呀");
        });
        //   2.
        btn2.addActionListener(new MyActionListener());
        //   3.
        btn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("3你好呀");
            }
        });

        jFrame.getContentPane().add(btn1);
        jFrame.getContentPane().add(btn2);
        jFrame.getContentPane().add(btn3);
        // 显示界面
        jFrame.setVisible(true);
    }
}
