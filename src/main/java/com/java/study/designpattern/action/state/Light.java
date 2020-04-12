package com.java.study.designpattern.action.state;

/**
 * @author zrfan
 * @className Light
 * @description TODO
 * @date 2020/4/6 21:19
 **/
public class Light {

    public static final LightState ON = new LigthOnState();
    public static final LightState OFF = new LightOffState();

    private LightState state;

    public void on() {
        this.state.on();
    }

    public void off() {
        this.state.off();
    }

    public LightState getState() {
        return state;
    }

    public void setState(LightState state) {
        this.state = state;
        this.state.setLight(this);
    }

}
