package com.java.study.designpattern.create.singleton;

/**
 * @author zrfan
 * @className SafeDoubleCheck
 * @description 线程安全的doublecheck volatile
 * volatile 保证可见性、有序性
 * 内存模型，禁止重排序
 * @date 2020/2/14 22:04
 **/
public class SafeDoubleCheck {

    private static volatile SafeDoubleCheck instance;

    private SafeDoubleCheck() {
    }

    public static SafeDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SerializableSingleton.class) {
                instance = new SafeDoubleCheck();
            }
        }
        return instance;
    }

}
