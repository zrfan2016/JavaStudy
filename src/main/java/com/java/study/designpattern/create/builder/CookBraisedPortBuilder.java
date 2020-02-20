package com.java.study.designpattern.create.builder;

/**
 * @author zrfan
 * @className CookBraisedPortBuilder
 * @description TODO
 * @date 2020/2/20 21:56
 **/
public class CookBraisedPortBuilder extends Cook {
    @Override
    protected void putOil() {
        System.out.println("多放点油，把肉好好炒一下");
    }

    @Override
    protected void putSalt() {
        System.out.println("放入适量的盐");
    }

    @Override
    protected void putVinegar() {
        System.out.println("放入一点醋");
    }

    @Override
    protected void putSoySauce() {
        System.out.println("放入适量的生抽");
    }

    @Override
    protected void putWater() {
        System.out.println("加水没过肉");
    }
}
