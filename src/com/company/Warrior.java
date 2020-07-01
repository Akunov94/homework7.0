package com.company;

public class Warrior extends Hero {

    @Override
    public String applySuperAbility(String superAbilityType) {
        return getName() + " применил суперспособность CRITICAL DAMAGE";
    }


}
