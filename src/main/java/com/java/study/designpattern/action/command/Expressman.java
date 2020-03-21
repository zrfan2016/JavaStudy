package com.java.study.designpattern.action.command;

/**
 * @author zrfan
 * @className Expressman
 * @description TODO
 * @date 2020/3/21 21:02
 **/
public class Expressman extends AbstractReceiver {
    @Override
    public void doSomething() {
        System.out.println("派送快递");
    }
}
