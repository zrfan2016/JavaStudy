package com.java.study.designpattern.create.singleton;

/**
 * @author zrfan
 * @className Hungry1Singleton
 * @description 饿汉式 另一种写法,同样线程安全，通过类加载机制保证。
 * 扩展 类加载机制
 * @date 2020/2/14 21:38
 **/
public class Hungry1Singleton {
    private static Hungry1Singleton instance;

    static {
        instance = new Hungry1Singleton();
    }

    private Hungry1Singleton() {
    }

    public static Hungry1Singleton getInstance() {
        return instance;
    }
}
