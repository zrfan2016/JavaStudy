package com.java.study.designpattern.action.state;

/**
 * @author zrfan
 * @className LigthOnState
 * @description TODO
 * @date 2020/4/6 21:22
 **/
public class LigthOnState implements LightState {
    @Override
    public void on() {
        System.out.println("已经开了，不能在开了");
    }

    @Override
    public void off() {
        System.out.println("关灯");
    }
}
