package com.java.study.designpattern.structure.adapter;

/**
 * @author zrfan
 * @className OuterCharger
 * @description TODO
 * @date 2020/3/3 21:36
 **/
public class OuterCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("非国行充电器充电中");
    }
}
