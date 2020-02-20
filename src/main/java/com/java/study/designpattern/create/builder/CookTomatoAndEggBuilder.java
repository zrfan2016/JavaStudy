package com.java.study.designpattern.create.builder;

/**
 * @author zrfan
 * @className CookTomatoAndEggBuilder
 * @description TODO
 * @date 2020/2/20 21:55
 **/
public class CookTomatoAndEggBuilder extends Cook {
    @Override
    protected void putOil() {
        System.out.println("放入适量的油");
    }

    @Override
    protected void putSalt() {
        System.out.println("放入少量的盐");
    }

    @Override
    protected void putVinegar() {

    }

    @Override
    protected void putSoySauce() {
        System.out.println("放入适量的生抽");
    }

    @Override
    protected void putWater() {

    }
}
