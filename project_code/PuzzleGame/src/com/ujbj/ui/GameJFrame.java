package com.ujbj.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    // 用来加载图片
    int[][] data = new int[4][4];
    // 定义当前路径
    String path = "PuzzleGame/image/girl/girl1/";
    // 计算当前步数
    int step;

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

        // 添加步数,JLabel管理文字和图片
        JLabel stepText = new JLabel("步数:\t" + step);
        stepText.setBounds(50, 0, 100, 30);
        this.getContentPane().add(stepText);

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

    JMenuBar gameJMenuBar = new JMenuBar();

    JMenu functionJMenu = new JMenu("功能");
    JMenu aboutJMenu = new JMenu("关于我们");

    JMenu replaceImg = new JMenu("更换图片");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem motion = new JMenuItem("运动");
    JMenuItem beauty = new JMenuItem("美女");
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem LoginAgainItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem codeItem = new JMenuItem("公众号");

    private void initJMenuBar() {
        // 添加事件
        // 给重新游戏添加事件
        replayItem.addActionListener(this);
        // 给重新登录添加事件
        LoginAgainItem.addActionListener(this);
        // 关闭游戏添加事件
        closeItem.addActionListener(this);
        // 公众号添加事件
        codeItem.addActionListener(this);
        // 给更换图片添加图片
        //  1. 给动物添加事件
        animal.addActionListener(this);
        //  2. 给运动添加事件
        motion.addActionListener(this);
        //  3. 给美女添加事件
        beauty.addActionListener(this);

        // 添加到JMenuBar
        gameJMenuBar.add(functionJMenu);
        gameJMenuBar.add(aboutJMenu);

        // 添加到JMenu
        //  1. functionJMenu
        replaceImg.add(animal);
        replaceImg.add(motion);
        replaceImg.add(beauty);
        functionJMenu.add(replaceImg);
        functionJMenu.add(replayItem);
        functionJMenu.add(LoginAgainItem);
        functionJMenu.add(closeItem);
        //  2. aboutJMenu
        aboutJMenu.add(codeItem);

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
            step++;
            initImage();
        } else if (code == e.VK_DOWN) {
            System.out.println("键盘向下");
            // 图片在最上底，上面已经没有图片在移动
            if (x == 0) return;
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == e.VK_LEFT) {
            System.out.println("键盘向左");
            // 往左移动，也就是右边图片往左移动
            if (y == 3) return;
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == e.VK_RIGHT) {
            System.out.println("键盘向右");
            if (y == 0) return;
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
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

    @Override
    public void actionPerformed(ActionEvent e) {
        Random r = new Random();
        // 获取被点的事件源
        Object source = e.getSource();
        if (source == replayItem) {
            System.out.println("重新游戏");
            // 计数器清零
            step = 0;
            // 初始化数据 打乱数组
            initDate();
            // 重新加载图片
            initImage();
        } else if (source == LoginAgainItem) {
            System.out.println("重新登录");

            // 隐藏主界面
            this.setVisible(false);
            // 打开登录界面
            new LogInJFrame();

        } else if (source == closeItem) {
            System.out.println("关闭游戏");
            System.exit(0);
        } else if (source == codeItem) {
            System.out.println("公众号");

            // 创建一个弹框对象
            JDialog jDialog = new JDialog();
            // 创建一个管理图片的容器对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("PuzzleGame/image/about.png"));
            // 设置位置宽高
            jLabel.setBounds(0, 0, 400, 400);
            // 把图片添加到弹框当中
            jDialog.getContentPane().add(jLabel);

            // 设置弹框大小
            jDialog.setSize(400, 400);
            // 让弹窗置顶
            jDialog.setAlwaysOnTop(true);
            // 让弹窗居中
            jDialog.setLocationRelativeTo(null);
            // 弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            // 弹框显示
            jDialog.setVisible(true);
        } else if (source == animal) {
            System.out.println("动物");

            int randomNum = r.nextInt(9) + 1;
            path = "PuzzleGame/image/animal/animal" + randomNum + "/";
            step = 0;
            initDate();
            initImage();
        } else if (source == motion) {
            System.out.println("运动");

            int randomNum = r.nextInt(10) + 1;
            path = "PuzzleGame/image/sport/sport" + randomNum + "/";
            step = 0;
            initDate();
            initImage();
        } else if (source == beauty) {
            System.out.println("美女");

            int randomNum = r.nextInt(14) + 1;
            path = "PuzzleGame/image/girl/girl" + randomNum + "/";
            step = 0;
            initDate();
            initImage();
        }
    }
}
