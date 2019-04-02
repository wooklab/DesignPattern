package com.wooklab.designpattern.strategypattern.character.type.impl;

import com.wooklab.designpattern.strategypattern.character.type.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("칼로 벱니다..!");
    }
}
