package com.java.study.designpattern.structure.adapter;

/**
 * @author zrfan
 * @className Dog
 * @description TODO
 * @date 2020/3/3 21:56
 **/
public class Dog implements IDog {
    @Override
    public void protectHome() {
        System.out.println("狗看家护院");
    }
}
