package com.java.study.designpattern.structure.bridge;

/**
 * @author zrfan
 * @className CounterfeitFactory
 * @description TODO
 * @date 2020/3/10 22:30
 **/
public class CounterfeitFactory extends WineFactory {
    @Override
    protected void sell() {
        System.out.println("卖假酒");
    }

    @Override
    protected void makeWine() {
        System.out.println("造假酒");
    }
}
