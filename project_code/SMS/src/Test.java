import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 1. 登录与注册
        verification();
        // 2. 进入学生管理系统
        SMS();
    }

    public static void verification() {
        ArrayList<User> users = new ArrayList<>();
        while (true) {
            System.out.println("-------------欢迎来到学生管理系统----------------");
            System.out.println("请选择操作1.登录 2.注册 3.忘记密码 :)");
            System.out.print("$ ");
            String choose = sc.next();
            switch (choose) {
                case "1" -> {
                    if (login(users)) {
                        System.out.println("登录成功");
                        return;
                    }
                }
                case "2" -> register(users);
                case "3" -> forgotPwd(users);
                default -> System.out.println("输入错误 :)");
            }
        }
    }

    // 1. 登录
    public static boolean login(ArrayList<User> users) {
        int count = 3;
        while (count-- > 0) {
            System.out.println("还有" + (count + 1) + "次机会");
            System.out.println("请输入用户名 :)");
            System.out.print("$ ");
            String userName = sc.next();

            System.out.println("请入用户密码 :)");
            System.out.print("$ ");
            String password = sc.next();
            if (checkLogin(users, userName, password)) {
                return true;
            } else {
                System.out.println("用户名不存在，请先注册 :(");
            }
        }
        return false;
    }
    // 2. 注册
    public static void register(ArrayList<User> users) {
        User user = new User();
        // 1. 输入用户
        while (true) {
            System.out.println("请输入用户名 :)");
            System.out.print("$ ");
            String userName = sc.next();
            if (checkUserName(userName)) {
                if (checkRepeat(users, userName)) {
                    user.setUserName(userName);
                    break;
                } else {
                    System.out.println("用户名重复");
                }
            } else {
                System.out.println("用户不合法 :(");
                System.out.println("请输入3~15之间，包含字母和数字 ~_~");
            }
        }
        // 2. 输入密码
        while (true) {
            System.out.println("请输入密码 :)");
            System.out.print("$ ");
            String password = sc.next();
            System.out.println("请在输入密码确认 :)");
            System.out.print("$ ");
            String confirmPwd = sc.next();

            String randCode = userCode();
            System.out.println("请在输入验证码 :)");
            System.out.println("验证码: " + randCode);
            System.out.print("$ ");
            String code = sc.next();
            if (password.equals(confirmPwd) && code.equals(randCode)) {
                user.setPassword(password);
                break;
            } else {
                System.out.println("两次密码不一致 :(");
            }
        }
        // 3. 输入身份证号码
        while (true) {
            System.out.println("请输入身份证号号码 :)");
            System.out.print("$ ");
            String IDNum = sc.next();
            if (checkIDNum(IDNum)) {
                user.setIDNum(IDNum);
                break;
            } else {
                System.out.println("身份证号不合法 :(");
            }
        }
        // 4. 输入手机号
        while (true) {
            System.out.println("请输入手机号 :)");
            System.out.print("$ ");
            String phoneNum = sc.next();
            if (checkPhoneNum(phoneNum)) {
                user.setPhoneNum(phoneNum);
                break;
            } else {
                System.out.println("手机号码不合法 :(");
            }
        }
        users.add(user);
    }
    // 3. 忘记密码
    public static void forgotPwd(ArrayList<User> users) {
            System.out.println("请输入要修改密码的用户名 :)");
            System.out.print("$ ");
            String userName = sc.next();
            int index = findUser(users, userName);
            if (index == -1) {
                System.out.println("当前用户不存在");
                return;
            }
            System.out.println("请输入身份号码 :)");
            System.out.print("$ ");
            String IDNum = sc.next();
            System.out.println("请输入手机号码 :)");
            String phoneNum = sc.next();
            if (users.get(index).getIDNum().equals(IDNum) && users.get(index).getPhoneNum().equals(phoneNum)) {
                System.out.println("输入要修改的密码 :)");
                System.out.print("$ ");
                users.get(index).setPassword(sc.next());
                System.out.println("修改成功 :)");
            } else {
                System.out.println("修改失败 :(");
            }
    }

    public static int findUser(ArrayList<User> users, String userName) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }

    // 判断用户名是否合法
    public static boolean checkUserName(String userName) {
        if (userName.length() > 15 || userName.length() < 3) {
            return false;
        }
        // 不能是纯数字，也不能是纯字母
        boolean flagCh = false;
        boolean flagNum = false;
        for (int i = 0; i < userName.length(); i++) {
            char ch = userName.charAt(i);
            // a-z || A-Z || 0-9
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                // 说明有字母
                flagCh = true;
            } else if (ch >= '0' && ch <= '9') {
                // 说明有数字
                flagNum = true;
            }
        }

        return flagCh && flagNum;
    }
    // 检查用户名是否重复
    public static boolean checkRepeat(ArrayList<User> users, String userName) {
        if (users.size() == 0) return true;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkIDNum(String IDNum) {
        if (IDNum.length() < 17) return false;
        if (IDNum.charAt(0) == '0') return false;
        for (int i = 0; i < IDNum.length() - 1; i++) {
            char ch = IDNum.charAt(i);
            if (ch > '9' || ch < '0') {
                return false;
            }
        }
        char ch = IDNum.charAt(IDNum.length() - 1);
        // 0-9 || ch == x || ch = X
        if (ch >= '0' && ch <= '9' || ch == 'x' || ch == 'X') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkPhoneNum(String phoneNum) {
        if (phoneNum.length() != 11) return false;
        if (phoneNum.charAt(0) == '0') return false;
        for (int i = 0; i < phoneNum.length(); i++) {
            if (i > '9' && i < '0') {
                return false;
            }
        }
        return true;
    }

    public static boolean checkLogin(ArrayList<User> users, String userName, String password) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName) && users.get(i).getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static String userCode() {
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        int len = 3;
        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(len);
            if (num == 0) {
                char ch = (char) (r.nextInt('z' - 'a' + 1) + 'a');
                sb.append(ch);
            } else if (num == 1) {
                char ch = (char) (r.nextInt('Z' - 'A' + 1) + 'A');
                sb.append(ch);
            } else {
                len = 2;
                sb.append(r.nextInt(10));
            }
        }
        if (len == 3) {
            int randIndex = r.nextInt(sb.length());
            char randChar = (char) (r.nextInt(10) + '0');
            sb.setCharAt(randIndex, randChar);
        }
        return sb.toString();
    }

    /************* 学生管理系统 *******************/
    public static void SMS() {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            String choose = sc.next();
            switch (choose) {
                case "1" -> add(list);
                case "2" -> remove(list);
                case "3" -> modify(list);
                case "4" -> printStu(list);
                case "0" -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("输入错误");
            }
        }
    }

    // 1. 菜单
    public static void menu() {
        System.out.println("-------------欢迎来到学生管理系统----------------");
        System.out.println("1. 添加学生");
        System.out.println("2. 删除学生");
        System.out.println("3. 修改学生");
        System.out.println("4. 查询学生");
        System.out.println("0. 退出");
        System.out.print("请选择:> ");
    }

    // 1. 添加学生
    public static void add(ArrayList<Student> list) {
        Student student = new Student();

        while (true) {
            System.out.print("请输入ID:> ");
            student.setId(sc.next());
            if (getIndex(list, student.getId()) < 0) {
                break;
            }
            System.out.println("ID重复 :)");
        }

        System.out.print("请输入名字:> ");
        student.setName(sc.next());

        System.out.print("请输入年龄:> ");
        student.setAge(sc.nextInt());

        System.out.print("请输入住址:> ");
        student.setAddress(sc.next());

        list.add(student);
        System.out.println("添加成功");
    }

    // 2. 删除学生
    public static void remove(ArrayList<Student> list) {
        while (true) {
            System.out.print("请输入要删除的id:> ");
            String id = sc.next();
            int index = getIndex(list, id);
            if (index >= 0) {
                list.remove(index);
                break;
            }
            System.out.println("当前id不存在");
        }
        System.out.println("删除成功 :)");
    }

    // 3. 修改学生
    public static void modify(ArrayList<Student> list) {
        while (true) {
            System.out.print("请输入要查找修改的id:> ");
            String id = sc.next();
            int index = getIndex(list, id);
            if (index != -1) {
                System.out.print("请输入要修改的id:> ");
                list.get(index).setId(sc.next());

                System.out.print("请输入要修改名字:> ");
                list.get(index).setName(sc.next());

                System.out.print("请输入要修改年龄:> ");
                list.get(index).setAge(sc.nextInt());

                System.out.print("请输入要修改住址:> ");
                list.get(index).setAddress(sc.next());
                break;
            }
            System.out.println("查找不到ID :(");
        }
        System.out.println("修改成功 :)");
    }

    // 4. 查询学生
    public static void printStu(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("管理系统为空");
            return;
        }
        System.out.println();
        System.out.println("id\t\t性名\t\t年龄\t\t住址");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getAge());
        }
    }

    // 如果有id相同返回相同的id的下标
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
