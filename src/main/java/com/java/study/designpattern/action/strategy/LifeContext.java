package com.java.study.designpattern.action.strategy;

/**
 * @author zrfan
 * @className LifeContext
 * @description 生活场景
 * @date 2020/3/30 21:55
 **/
public class LifeContext {

    public static void main(String[] args) {
        IStrategy strategy = new ActSpoiledStrategy();
        Dog dog = new Dog();
        System.out.println("你刚到家或是你自己在待着");
        dog.setStrategy(strategy);
        dog.act();

        System.out.println("拆家后被发现");
        strategy = new ActCuteStrategy();
        dog.setStrategy(strategy);
        dog.act();

        System.out.println("领导给它撑腰，然后你跟它说啥它都是");
        strategy = new ActShamelesslyStrategy();
        dog.setStrategy(strategy);
        dog.act();
    }
}
