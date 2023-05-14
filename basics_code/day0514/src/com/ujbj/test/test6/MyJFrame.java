package com.ujbj.test.test6;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame extends JFrame implements KeyListener {
    public MyJFrame() {
        this.setSize(600, 500);
        this.setTitle("键盘事件");
        ImageIcon icon = new ImageIcon("E:\\图片\\IKUN军火库\\79611629.jpeg");
        this.setIconImage(icon.getImage());
        // 界面置顶
        this.setAlwaysOnTop(true);
        // 界面位置
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认的居中放置
        this.setLayout(null);

        // 键盘事件
        this.addKeyListener(this);


        // 显示界面
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }
    // 如果我们按下一个按键没有松开，那么会重复的去调用KeyPressed
    @Override
    public void keyPressed(KeyEvent keyEvent) {
        System.out.println("键盘按下不松");
    }

    // this 通过 keyEvent相同接口的实现接收，跟继承一样，编译看左运行看左属性，编译看左运行看右方法
    @Override
    public void keyReleased(KeyEvent keyEvent) {
        System.out.println("松开按键");
        // 获取键盘上每个按键的编号 getKeyCode
        int code = keyEvent.getKeyCode();
        System.out.println(code);
        if (code == keyEvent.VK_DOWN) {
            System.out.println("按下向下键");
        } else if (code == keyEvent.VK_A) {
            System.out.println("按下a键");
        }
    }
}
