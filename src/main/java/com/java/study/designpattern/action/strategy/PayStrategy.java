package com.java.study.designpattern.action.strategy;

/**
 * @author zrfan
 * @className PayStrategy
 * @description TODO
 * @date 2020/4/1 22:03
 **/
public interface PayStrategy {

    String doPay(String orderNo);

    String doRefund(String orderNo);

    String doQuery(String orderNo);

}
