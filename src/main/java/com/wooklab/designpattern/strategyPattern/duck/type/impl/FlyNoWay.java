package com.wooklab.designpattern.strategypattern.duck.type.impl;

import com.wooklab.designpattern.strategypattern.duck.type.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 못 날아요~0~");
    }
}
