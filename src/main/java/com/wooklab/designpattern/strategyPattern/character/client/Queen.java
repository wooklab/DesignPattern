package com.wooklab.designpattern.strategypattern.character.client;

import com.wooklab.designpattern.strategypattern.character.type.impl.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        characterName = "여왕";
        System.out.println(characterName + " 캐릭터가 생성됩니다.");
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println(characterName + " 캐릭터가 치마를 걷어 올리고 싸우기 시작합니다.");
    }
}
