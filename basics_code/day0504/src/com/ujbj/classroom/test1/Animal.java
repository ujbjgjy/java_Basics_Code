package com.ujbj.classroom.test1;

public abstract class Animal {
    private String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void shout();

    public String getName() {
        return name;
    }
}
