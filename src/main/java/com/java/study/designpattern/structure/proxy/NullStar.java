package com.java.study.designpattern.structure.proxy;

/**
 * @author zrfan
 * @className NullStar
 * @description TODO
 * @date 2020/3/16 21:45
 **/
public class NullStar implements IStar {

    private NullStar() {
    }

    private static final NullStar nullInstance = new NullStar();

    public static NullStar getNullStar() {
        return nullInstance;
    }

    @Override

    public void act() {
        System.out.println("不知道你要找谁演戏");
    }

    @Override
    public void sing() {
        System.out.println("不知道你要找谁唱歌");
    }

    @Override
    public void dance() {
        System.out.println("不知道你要找谁跳舞");
    }

}
