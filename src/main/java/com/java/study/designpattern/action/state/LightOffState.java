package com.java.study.designpattern.action.state;

/**
 * @author zrfan
 * @className LightOffState
 * @description TODO
 * @date 2020/4/6 21:26
 **/
public class LightOffState implements LightState {
    @Override
    public void on() {
        System.out.println("开灯");
    }

    @Override
    public void off() {
        System.out.println("已经关了，不能在关了");
    }
}
