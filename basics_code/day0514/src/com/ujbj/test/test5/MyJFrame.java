package com.ujbj.test.test5;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame extends JFrame implements MouseListener {
    public MyJFrame() {
        this.setSize(600, 500);
        this.setTitle("鼠标事件演示");
        ImageIcon icon = new ImageIcon("E:\\图片\\IKUN军火库\\79611629.jpeg");
        this.setIconImage(icon.getImage());
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认居中放置，只有取消了才会按照XY轴形式添加组件
        this.setLayout(null);

        JButton btn = new JButton("按钮");
        btn.setBounds(50, 100, 100, 50);
        btn.addMouseListener(this);
        this.getContentPane().add(btn);

        // 显示界面
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        System.out.println("按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        System.out.println("划出");
    }
}
