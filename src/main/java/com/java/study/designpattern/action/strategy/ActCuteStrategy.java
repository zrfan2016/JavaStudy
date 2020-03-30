package com.java.study.designpattern.action.strategy;

/**
 * @author zrfan
 * @className ActCuteStrategy
 * @description 卖萌策略
 * @date 2020/3/30 21:35
 **/
public class ActCuteStrategy implements IStrategy {
    @Override
    public void doOperate() {
        System.out.println("卖萌");
    }
}
