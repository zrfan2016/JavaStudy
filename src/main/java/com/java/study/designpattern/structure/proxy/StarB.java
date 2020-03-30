package com.java.study.designpattern.structure.proxy;

/**
 * @author zrfan
 * @className StarB
 * @description TODO
 * @date 2020/3/16 21:32
 **/
public class StarB implements IStar {
    @Override
    public void act() {
        System.out.println(getClass().getSimpleName() + "演技还好");
    }

    @Override
    public void sing() {
        System.out.println(getClass().getSimpleName() + "唱歌一般");
    }

    @Override
    public void dance() {
        System.out.println(getClass().getSimpleName() + "跳舞不错");
    }
}
