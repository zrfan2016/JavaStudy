package com.java.study.designpattern.action.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zrfan
 * @className Customer
 * @description TODO
 * @date 2020/4/19 17:51
 **/
public class Customer implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Delivery delivery = (Delivery)o;
        System.out.println("我的快递当前是 " + delivery.getStatus() + "," + delivery.getCurrentDst());
    }
}
