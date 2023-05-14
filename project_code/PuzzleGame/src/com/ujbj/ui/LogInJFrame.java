package com.ujbj.ui;

import javax.swing.*;

public class LogInJFrame extends JFrame {
    // 初始化登录界面
    public LogInJFrame() {
        //  1. 设置界面的宽高
        this.setSize(500, 300);
        //  2. 设置界面的标题
        this.setTitle("拼图 登录");
        //  3. 设置界面置顶
        this.setAlwaysOnTop(true);
        //  4. 设置界面居中
        this.setLocationRelativeTo(null);
        //  5. 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //  6. 显示界面
        this.setVisible(true);
    }
}
