package com.java.study.designpattern.structure.adapter;

/**
 * @author zrfan
 * @className InternalCharger
 * @description TODO
 * @date 2020/3/3 21:30
 **/
public class InnerCharger implements Charger {

    @Override
    public void charge() {
        System.out.println("国行版iphone充电器充电中");
    }

}
