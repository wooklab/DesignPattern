package com.wooklab.designpattern.strategypattern.character.type.impl;

import com.wooklab.designpattern.strategypattern.character.type.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("화살을 쏩니다..!");
    }
}
