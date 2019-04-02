package com.wooklab.designpattern.strategypattern.character.type.impl;

import com.wooklab.designpattern.strategypattern.character.type.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("도끼로 찍습니다..!");
    }
}
