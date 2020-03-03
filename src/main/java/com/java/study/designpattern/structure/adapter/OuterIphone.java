package com.java.study.designpattern.structure.adapter;

/**
 * @author zrfan
 * @className OuterIphone
 * @description TODO
 * @date 2020/3/3 21:35
 **/
public class OuterIphone implements Iphone {
    @Override
    public void charge(Charger charger) {
        if (charger instanceof OuterCharger) {
            charger.charge();
        } else {
            System.out.println("充电器不适配不能充电");
        }
    }
}
