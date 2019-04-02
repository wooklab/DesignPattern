package com.wooklab.designpattern.strategypattern.character.client;

import com.wooklab.designpattern.strategypattern.character.type.impl.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        characterName = "괴물";
        System.out.println(characterName + " 캐릭터가 생성됩니다.");
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println(characterName + " 캐릭터가 못생기게 싸우기 시작합니다.");
    }
}
