package com.wooklab.designpattern.strategypattern.character.client;

import com.wooklab.designpattern.strategypattern.character.type.impl.SwordBehavior;

public class King extends Character {
    public King() {
        characterName = "왕";
        System.out.println(characterName + " 캐릭터가 생성됩니다.");
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println(characterName + " 캐릭터가 와관을 집어 던지고 싸우기 시작합니다.");
    }
}
