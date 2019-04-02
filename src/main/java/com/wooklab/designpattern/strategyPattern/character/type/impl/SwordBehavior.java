package com.wooklab.designpattern.strategypattern.character.type.impl;

import com.wooklab.designpattern.strategypattern.character.type.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("검을 휘두릅니다..!");
    }
}
