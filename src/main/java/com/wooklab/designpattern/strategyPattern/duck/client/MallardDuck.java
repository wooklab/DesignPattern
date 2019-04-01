package com.wooklab.designpattern.strategypattern.duck.client;

import com.wooklab.designpattern.strategypattern.duck.type.impl.FlyWithWings;
import com.wooklab.designpattern.strategypattern.duck.type.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리 입니다.");
    }
}
