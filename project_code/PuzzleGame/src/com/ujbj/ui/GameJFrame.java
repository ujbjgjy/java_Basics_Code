package com.ujbj.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {
    // 用来加载图片
    int[][] data = new int[4][4];
    // 定义当前路径
    String path = "PuzzleGame/image/girl/girl1/";

    // 创建主界面
    public GameJFrame() {
        // 初始化主界面
        initJFrame();

        // 初始化菜单界面
        initJMenuBar();

        // 初始化数组
        initDate();

        // 初始化图片
        initImage();

        // 显示界面
        this.setVisible(true);
    }

    private void initImage() {
        // 清空原本已经出现的所有图片
        this.getContentPane().removeAll();
        // 在打印所有图片时来判断是否胜利
        if (victory()) {
            ImageIcon icon = new ImageIcon("PuzzleGame/image/win.png");
            JLabel win = new JLabel(icon);
            win.setBounds(203, 273, 197, 73);
            this.getContentPane().add(win);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 创建一个图片ImageIcon的对象
                //  相对路径:相对于当前项目
                ImageIcon icon = new ImageIcon(path + data[i][j] + ".jpg");
                // 创建一个JLabel的对象(管理容器)
                JLabel jLabel = new JLabel(icon);
                // 设置位置
                jLabel.setBounds(j * 105 + 90, i * 105 + 100, 105, 105);
                // 需要一个Border接口的实现类，已知实现类BevelBorder
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED) {
                });
                // 获取隐藏容器,把管理容器添加到界面中
                this.getContentPane().add(jLabel);
            }
        }
        // 先加载的图片在上方，后载的图片塞在下面
        JLabel jLabel = new JLabel(new ImageIcon("PuzzleGame/image/background.png"));
        jLabel.setBounds(45, 5, 508, 560);
        this.getContentPane().add(jLabel);

        // 刷新一下界面
        this.getContentPane().repaint();
    }

    int x;
    int y;

    private void initDate() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();

        for (int i = 0; i < tempArr.length; i++) {
            int indexRandom = r.nextInt(16);
            int temp = tempArr[indexRandom];
            tempArr[indexRandom] = tempArr[i];
            tempArr[i] = temp;
        }

        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    private void initJMenuBar() {
        JMenuBar gameJMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem LoginAgainItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem code = new JMenuItem("公众号");

        // 添加到JMenuBar
        gameJMenuBar.add(functionJMenu);
        gameJMenuBar.add(aboutJMenu);

        // 添加到JMenu
        //  1. functionJMenu
        functionJMenu.add(replayItem);
        functionJMenu.add(LoginAgainItem);
        functionJMenu.add(closeItem);
        //  2. aboutJMenu
        aboutJMenu.add(code);

        // 添加到JFrame
        this.setJMenuBar(gameJMenuBar);
    }

    private void initJFrame() {
        // 设置界面的宽高
        this.setSize(600, 620);
        // 设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 取消默认的居中放置，只有取消了xy轴的形式添加组件
        this.setLayout(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 添加键盘录入
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == e.VK_A) {
            this.getContentPane().removeAll();
            ImageIcon icon = new ImageIcon(path + "all.jpg");
            JLabel jLabel = new JLabel(icon);
            jLabel.setBounds(90, 100, 420, 420);
            this.getContentPane().add(jLabel);

            // 先加载的图片在上方，后载的图片塞在下面
            JLabel bg = new JLabel(new ImageIcon("PuzzleGame/image/background.png"));
            bg.setBounds(45, 5, 508, 560);
            this.getContentPane().add(bg);

            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("x = " + x + "\ty = " + y);
        int code = e.getKeyCode();
        // 没有拼图可以拼，不用在移动
        if (victory()) return;
        if (code == e.VK_UP) {
            // 图片在最底层，下方已经没有图片
            System.out.println("键盘向上");
            if (x == 3) return;
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            initImage();
        } else if (code == e.VK_DOWN) {
            System.out.println("键盘向下");
            // 图片在最上底，上面已经没有图片在移动
            if (x == 0) return;
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            initImage();
        } else if (code == e.VK_LEFT) {
            System.out.println("键盘向左");
            // 往左移动，也就是右边图片往左移动
            if (y == 3) return;
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            initImage();
        } else if (code == e.VK_RIGHT) {
            System.out.println("键盘向右");
            if (y == 0) return;
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            initImage();
        } else if (code == e.VK_A) {
            initImage();
        } else if (code == e.VK_W) {
            for (int i = 0; i < 15; i++) {
                data[i / 4][i % 4] = i + 1;
            }
            data[3][3] = 0;
            x = 3;
            y = 3;
            initImage();
        }
    }

    public boolean victory() {
        for (int i = 0; i < 15 - 1; i++) {
            // 1~14只要有一个不相同，就返回false
            if (data[i / 4][i % 4] != i + 1) {
                return false;
            }
        }
        return true;
    }
}
