package com.ujbj.objectTest.test3;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    // 角色要攻击谁需要指定
    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int residue = role.getBlood() - hurt;
        residue = residue < 0 ? 0 : residue;
        role.setBlood(residue);
        System.out.println(this.getName() + "攻击了" + role.getName() + "造成了" + hurt + "伤害," + role.getName() + "还剩" + role.getBlood());
    }


}
