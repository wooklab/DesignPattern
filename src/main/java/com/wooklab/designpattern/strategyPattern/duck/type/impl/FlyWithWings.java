package com.wooklab.designpattern.strategypattern.duck.type.impl;

import com.wooklab.designpattern.strategypattern.duck.type.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고 있어요!");
    }
}
