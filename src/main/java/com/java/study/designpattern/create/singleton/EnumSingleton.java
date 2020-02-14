package com.java.study.designpattern.create.singleton;

/**
 * @author zrfan
 * @className EnumSingleton
 * @description 枚举单例，避免序列化、线程安全等问题
 * @date 2020/2/14 22:10
 **/
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("ssss");
    }
}
