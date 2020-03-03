package com.java.study.designpattern.structure.adapter;

/**
 * @author zrfan
 * @className Cat
 * @description TODO
 * @date 2020/3/3 21:54
 **/
public class Cat implements ICat {
    @Override
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
