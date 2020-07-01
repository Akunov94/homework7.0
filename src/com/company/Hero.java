package com.company;

public abstract class Hero implements HavingSuperAbility {
    private String name;
    private int health;
    private int damage;
    private int superpower;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
