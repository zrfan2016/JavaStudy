package com.java.study.designpattern.structure.adapter;

/**
 * @author zrfan
 * @className InnerIphone
 * @description TODO
 * @date 2020/3/3 21:33
 **/
public class InnerIphone implements Iphone {

    @Override
    public void charge(Charger charger) {
        if (charger instanceof InnerCharger) {
            charger.charge();
        } else {
            System.out.println("充电器不适配不能充电");
        }
    }
}
