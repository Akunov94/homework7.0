package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior w1 = new Warrior();
        w1.setName("Warrior Golem");

        Medic m1 = new Medic();
        m1.setName("Medic Aibolit");

        Magic mg1 = new Magic();
        mg1.setName("Magic Aladdin");

        Hero[] heroes = {w1, m1, mg1};
        for (Hero arr:heroes) {
            System.out.println(arr.applySuperAbility(""));
        }
    }
}
