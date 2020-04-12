package com.java.study.designpattern.action.state;

/**
 * @author zrfan
 * @className LigthOnState
 * @description TODO
 * @date 2020/4/6 21:22
 **/
public class LigthOnState extends LightState {

    @Override
    public void on() {
        System.out.println("灯已经打开了");
    }

    @Override
    public void off() {
        System.out.println("灯关了");
        super.getLight().setState(Light.OFF);
    }
}
