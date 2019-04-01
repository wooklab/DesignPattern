package com.wooklab.designpattern.strategypattern.duck.type.impl;

import com.wooklab.designpattern.strategypattern.duck.type.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥~~!");
    }
}
