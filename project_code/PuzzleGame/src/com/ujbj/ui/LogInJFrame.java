package com.ujbj.ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LogInJFrame extends JFrame implements MouseListener {
    // 初始化登录界面
    public LogInJFrame() {
        // 初始化登录界面
        initLogIn();

        // 添加图片
        initImage();

        //  显示界面
        this.setVisible(true);
    }

    private void initLogIn() {
        // 设置界面的宽高
        this.setSize(490, 425);
        // 设置界面的标题
        this.setTitle("拼图游戏 v1.0登录");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 取消默认居中放置
        this.setLayout(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // 登录
    JButton loginBtn = new JButton();
    // 注册
    JButton registerBtn = new JButton();
    // 用户名
    JTextField userJTextField = new JTextField();
    // 密码
    JPasswordField pwdJPasswordField = new JPasswordField();
    // 用户输入验证码
    JTextField codeJField = new JTextField();
    // 随机码
    String randCode = CodeUtil.codeStr();

    private void initImage() {
        // 添加用户名
        JLabel userjLabel = new JLabel(new ImageIcon("PuzzleGame/image/login/用户名.png"));
        userjLabel.setBounds(100, 150, 50, 20);
        this.getContentPane().add(userjLabel);
        // 添加文本框
        userJTextField.setBounds(200, 150, 150, 20);
        this.getContentPane().add(userJTextField);

        // 添加密码
        JLabel passwordJLabel = new JLabel(new ImageIcon("PuzzleGame/image/login/密码.png"));
        passwordJLabel.setBounds(100, 200, 50, 20);
        this.getContentPane().add(passwordJLabel);
        // 添加文本框
        pwdJPasswordField.setBounds(200, 200, 150, 20);
        this.getContentPane().add(pwdJPasswordField);

        // 添加验证码
        JLabel codeJLabel = new JLabel(new ImageIcon("PuzzleGame/image/login/验证码.png"));
        codeJLabel.setBounds(100, 260, 50, 20);
        this.getContentPane().add(codeJLabel);
        // 添加文本框
        codeJField.setBounds(200, 260, 80, 20);
        this.getContentPane().add(codeJField);
        // 添加随机码
        randCode = CodeUtil.codeStr();
        JLabel randCodeJLabel = new JLabel(randCode);
        randCodeJLabel.setBounds(300, 260, 50, 20);
        this.getContentPane().add(randCodeJLabel);

        // 登录和注册按钮
        loginBtn.setBounds(60, 300, 125, 47);
        loginBtn.setIcon(new ImageIcon("PuzzleGame/image/login/登录按钮.png"));
        //去除按钮的默认边框
        loginBtn.setBorderPainted(false);
        //去除按钮的默认背景
        loginBtn.setContentAreaFilled(false);

        registerBtn.setBounds(300, 300, 125, 47);
        registerBtn.setIcon(new ImageIcon("PuzzleGame/image/login/注册按钮.png"));
        //去除按钮的默认边框
        registerBtn.setBorderPainted(false);
        //去除按钮的默认背景
        registerBtn.setContentAreaFilled(false);


        // 添加事件
        //  1. 登录
        loginBtn.addMouseListener(this);
        //  2. 注册
        registerBtn.addMouseListener(this);


        // 添加界面里面
        this.getContentPane().add(loginBtn);
        this.getContentPane().add(registerBtn);

        // 添加背景图片
        ImageIcon bgImg = new ImageIcon("PuzzleGame/image/login/background.png");
        JLabel bgjLabel = new JLabel(bgImg);
        bgjLabel.setBounds(0, 0, 470, 390);
        this.getContentPane().add(bgjLabel);
    }

    //要展示用户名或密码错误
    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);
        //
        jDialog.setLayout(null);

        //创建JLabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(55, 20, 100, 50);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }

    //创建一个集合存储正确的用户名和密码
    static ArrayList<User> list = new ArrayList<>();

    static {
        list.add(new User("ujbj", "wjdsg"));
        list.add(new User("zhangsan", "123"));
        list.add(new User("lisi", "1234"));
    }

    public void mouseClicked(MouseEvent e) {
        // 获取触发事件的按钮
        Object source = e.getSource();
        if (source == loginBtn) {
            System.out.println("登录");
            System.out.println("userJTextField = " + userJTextField.getText());
            System.out.println("pwdJPasswordField = " + pwdJPasswordField.getText());
            System.out.println("codeJField = " + codeJField.getText());

            verification();
        } else if (source == registerBtn) {
            System.out.println("注册");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // 获取触发事件的按钮
        Object source = e.getSource();
        if (source == loginBtn) {
            loginBtn.setIcon(new ImageIcon("PuzzleGame/image/login/登录按下.png"));

        } else if (source == registerBtn) {
            registerBtn.setIcon(new ImageIcon("PuzzleGame/image/login/注册按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // 获取触发事件的按钮
        Object source = e.getSource();
        if (source == loginBtn) {
            loginBtn.setIcon(new ImageIcon("PuzzleGame/image/login/登录按钮.png"));
        } else if (source == registerBtn) {
            registerBtn.setIcon(new ImageIcon("PuzzleGame/image/login/注册按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    // 判断用户输入是否输入错误
    public int verification() {
        if (!codeJField.getText().equals(randCode)) {
            codeJField.setText("");
            showJDialog("验证码错误");
            return -1;
        }
        // 代码相同 则登录成功
        if (!findUser()) {
            showJDialog("用户名或密码错误");
            codeJField.setText("");
            return 0;
        }
        this.setVisible(false);
        new GameJFrame();
        return 1;
    }

    public boolean findUser() {
        String user = userJTextField.getText();
        String pwd = pwdJPasswordField.getText();
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            System.out.println(user + "\t" + u.getName());
            System.out.println(pwd + "\t" + u.getPassword());

            if (u.getName().equals(user) && u.getPassword().equals(pwd)) {
                return true;
            }
        }
        return false;
    }
}
