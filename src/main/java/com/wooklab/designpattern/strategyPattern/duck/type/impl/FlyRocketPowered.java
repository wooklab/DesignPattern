package com.wooklab.designpattern.strategypattern.duck.type.impl;

import com.wooklab.designpattern.strategypattern.duck.type.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추친 파워!! 쇼숑!!");
    }
}
