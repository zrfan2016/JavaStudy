package com.java.study.designpattern.action.strategy;

/**
 * @author zrfan
 * @className ActSpoiledStrategy
 * @description 撒娇
 * @date 2020/3/30 21:32
 **/
public class ActSpoiledStrategy implements IStrategy {
    @Override
    public void doOperate() {
        System.out.println("撒娇");
    }
}
