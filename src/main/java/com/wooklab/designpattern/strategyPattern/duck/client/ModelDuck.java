package com.wooklab.designpattern.strategypattern.duck.client;

import com.wooklab.designpattern.strategypattern.duck.type.impl.FlyNoWay;
import com.wooklab.designpattern.strategypattern.duck.type.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("모형오리!!");
    }
}
