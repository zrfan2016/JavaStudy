package com.java.study.designpattern.structure.proxy;

/**
 * @author zrfan
 * @className StarA
 * @description TODO
 * @date 2020/3/16 21:30
 **/
public class StarA implements IStar {
    @Override
    public void act() {
        System.out.println(getClass().getSimpleName() + "演技很好");
    }

    @Override
    public void sing() {
        System.out.println(getClass().getSimpleName() + "唱歌也不错");
    }

    @Override
    public void dance() {
        System.out.println(getClass().getSimpleName() + "跳舞一般");
    }
}
