package com.java.study.designpattern.action.observer;

/**
 * @author zrfan
 * @className Test
 * @description TODO
 * @date 2020/4/19 17:57
 **/
public class Test {

    public static void main(String[] args) {
        Delivery delivery = new Delivery();
        Customer customer = new Customer();
        Platform platform = new Platform();
        delivery.addObserver(customer);
        delivery.addObserver(platform);
        delivery.updateMsg("揽收", "在 XXX");
        delivery.updateMsg("运输", "运输中");
        delivery.updateMsg("派送", "由快递员小哥派送中");

    }
}
