package com.java.study.designpattern.action.strategy;

/**
 * @author zrfan
 * @className NullStrategy
 * @description TODO
 * @date 2020/3/30 21:47
 **/
public class NullStrategy implements IStrategy {
    @Override
    public void doOperate() {
        System.out.println("这是一个空策略");
    }
}
