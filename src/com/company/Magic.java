package com.company;

public class Magic extends Hero {
    @Override
    public String applySuperAbility(String superAbilityType) {
        return getName() + " применил суперспособность Magical Attack";
    }
}
