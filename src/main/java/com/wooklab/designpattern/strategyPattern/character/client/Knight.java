package com.wooklab.designpattern.strategypattern.character.client;

import com.wooklab.designpattern.strategypattern.character.type.impl.KnifeBehavior;

public class Knight extends Character {
    public Knight() {
        characterName = "기사";
        System.out.println(characterName + " 캐릭터가 생성됩니다.");
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println(characterName + " 캐릭터가 갑옷을 벗고 싸우기 시작합니다.");
    }
}
