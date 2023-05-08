package com.ujbj.test.test4;

public class Test {
    public static void main(String[] args) {
        Chef chef = new Chef("001", "张三", 5000);
        Manage manage = new Manage("002", "李四", 8000, 2000);
        System.out.printf("%s\t%s\t%s\n", chef.getID(), chef.getName(), chef.getWages());
        chef.work();
        chef.eat();
        System.out.println("-------------------");
        System.out.printf("%s\t%s\t%s\t%d\n", manage.getID(), manage.getName(), manage.getWages(), manage.getBonus());
        manage.work();
        manage.eat();
    }
}
