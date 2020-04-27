package com.java.study.designpattern.action.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zrfan
 * @className Platform
 * @description TODO
 * @date 2020/4/19 17:56
 **/
public class Platform implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Delivery delivery = (Delivery)o;
        System.out.println("写入快递信息，快递当前是 " + delivery.getStatus() + ",到达" + delivery.getCurrentDst());
    }
}
