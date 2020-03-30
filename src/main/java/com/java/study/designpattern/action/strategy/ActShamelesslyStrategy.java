package com.java.study.designpattern.action.strategy;

/**
 * @author zrfan
 * @className ActShamelesslyStrategy
 * @description 耍赖
 * @date 2020/3/30 21:34
 **/
public class ActShamelesslyStrategy implements IStrategy {
    @Override
    public void doOperate() {
        System.out.println("耍赖");
    }
}
