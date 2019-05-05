package com.wooklab.designpattern.strategypattern.character;

import com.wooklab.designpattern.strategypattern.character.client.*;
import com.wooklab.designpattern.strategypattern.character.client.Character;
import com.wooklab.designpattern.strategypattern.character.type.impl.AxeBehavior;
import com.wooklab.designpattern.strategypattern.character.type.impl.BowAndArrowBehavior;
import com.wooklab.designpattern.strategypattern.character.type.impl.KnifeBehavior;
import com.wooklab.designpattern.strategypattern.character.type.impl.SwordBehavior;

public class CharacterGenerator {
    public static void main(String[] args) {
        // 캐릭터 왕
        Character characterKing = new King();                   // Character 추상클래스 변수를 구현/확장 클래스로 인스턴스를 생성
        characterKing.fight();                                  // Character 추상클래스를 상속받은 구현클래스에서 메소드 구현(구현된 메소드)
        characterKing.performFight();                           // Character 추상클래스에서 공통으로 사용되는 메소드
        characterKing.setWeaponBehavior(new KnifeBehavior());   // Character 추상클래스에서 공통으로 사용되는 메소드, WeaponBehavior 구현체를 SET(변경될 부분을 캡슐화)
        characterKing.performFight();
        System.out.println();

        // 캐릭터 여왕
        Character characterQueen = new Queen();
        characterQueen.fight();
        characterQueen.performFight();
        characterQueen.setWeaponBehavior(new AxeBehavior());
        characterQueen.performFight();
        System.out.println();

        // 캐릭터 기사
        Character characterKnight = new Knight();
        characterKnight.fight();
        characterKnight.performFight();
        characterKnight.setWeaponBehavior(new BowAndArrowBehavior());
        characterKnight.performFight();
        System.out.println();

        // 캐릭터 괴물
        Character characterTroll = new Troll();
        characterTroll.fight();
        characterTroll.performFight();
        characterTroll.setWeaponBehavior(new SwordBehavior());
        characterTroll.performFight();
    }
}
