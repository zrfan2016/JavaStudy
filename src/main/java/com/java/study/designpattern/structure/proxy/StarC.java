package com.java.study.designpattern.structure.proxy;

/**
 * @author zrfan
 * @className StarC
 * @description TODO
 * @date 2020/3/16 21:35
 **/
public class StarC implements IStar {
    @Override
    public void act() {
        System.out.println(getClass().getSimpleName() + "演技很好");
    }

    @Override
    public void sing() {
        System.out.println(getClass().getSimpleName() + "唱歌一般");
    }

    @Override
    public void dance() {
        System.out.println(getClass().getSimpleName() + "不会跳舞");
    }
}
