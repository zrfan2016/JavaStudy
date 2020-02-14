package com.java.study.designpattern.create.singleton;

/**
 * @author zrfan
 * @className HungrySingleton
 * @description 懒汉式 联想记忆，这个人比较懒，你需要的时候才去创建
 * 懒加载 等等
 * @date 2020/2/14 21:21
 **/
public class LazySingleton {

    private LazySingleton() {
    }

    private static LazySingleton instance;

    public synchronized static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
