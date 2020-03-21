package com.java.study.designpattern.action.command;

/**
 * @author zrfan
 * @className Staff
 * @description TODO
 * @date 2020/3/21 21:01
 **/
public class Staff extends AbstractReceiver {
    @Override
    public void doSomething() {
        System.out.println("准备商品，打包发快递");
    }
}
