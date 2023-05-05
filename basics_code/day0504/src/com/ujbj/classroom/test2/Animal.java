package com.ujbj.classroom.test2;

public abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void shout();
}
