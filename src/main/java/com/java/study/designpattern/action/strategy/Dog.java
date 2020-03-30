package com.java.study.designpattern.action.strategy;

/**
 * @author zrfan
 * @className Dog
 * @description 我家的小可爱
 * @date 2020/3/30 21:50
 **/
public class Dog {

    private IStrategy strategy;

    public Dog() {}

    public void act() {
        strategy.doOperate();
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
