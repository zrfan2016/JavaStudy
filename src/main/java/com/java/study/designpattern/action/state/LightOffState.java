package com.java.study.designpattern.action.state;

/**
 * @author zrfan
 * @className LightOffState
 * @description TODO
 * @date 2020/4/6 21:26
 **/
public class LightOffState extends LightState {

    @Override
    public void on() {
        System.out.println("灯开了");
        super.getLight().setState(Light.ON);
        // super.getLight().on();
    }

    @Override
    public void off() {
        System.out.println("已经关了，不能在关了");
    }
}
