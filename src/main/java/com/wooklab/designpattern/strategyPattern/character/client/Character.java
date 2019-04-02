package com.wooklab.designpattern.strategypattern.character.client;

import com.wooklab.designpattern.strategypattern.character.type.WeaponBehavior;

public abstract class Character {
    String characterName;
    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        System.out.println(characterName + "의 무기가 변경됩니다.");
        this.weaponBehavior = weaponBehavior;
    }
    public abstract void fight();

    public void performFight() {
        System.out.print(characterName + "(이)가 ");
        weaponBehavior.useWeapon();
    }
}
