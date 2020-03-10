package com.java.study.designpattern.structure.bridge;

/**
 * @author zrfan
 * @className WineFactory
 * @description 酒厂
 * @date 2020/3/10 22:15
 **/
public abstract class WineFactory {

    public void sellWine() {
        makeWine();
        sell();
    }

    protected abstract void sell();

    protected abstract void makeWine();

}
