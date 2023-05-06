import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
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
