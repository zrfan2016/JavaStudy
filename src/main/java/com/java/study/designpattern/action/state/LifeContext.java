package com.java.study.designpattern.action.state;

/**
 * @author zrfan
 * @className LifeContext
 * @description TODO
 * @date 2020/4/12 11:17
 **/
public class LifeContext {

    public static void main(String[] args) {
        Light light = new Light();
        light.setState(Light.OFF);
        light.on();
        light.on();
        light.off();
        light.off();
        light.on();
    }
}
