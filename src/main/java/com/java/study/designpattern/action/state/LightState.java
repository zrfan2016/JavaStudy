package com.java.study.designpattern.action.state;

/**
 * @author zrfan
 * @className LightState
 * @description TODO
 * @date 2020/4/6 21:21
 **/
public abstract class LightState {

    private Light light;

    public abstract void on();

    public abstract void off();

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }
}
