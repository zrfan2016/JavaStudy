package com.java.study.designpattern.create.singleton;

/**
 * @author zrfan
 * @className DoubleCheck
 * @description 为什么会有doublecheck
 * JDK较低的版本 synchronized 较重，每次都需要获取锁
 * JDK 6 升级后 synchronized 优化后 性能提升
 * 实际场景中，其实只需要第一次初始化的时候进行加锁，
 * 避免多线程并发问题
 * 如下方式是否 线程安全
 * @date 2020/2/14 21:42
 **/
public class DoubleCheck {
    private DoubleCheck() {
    }

    private static DoubleCheck instance;

    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SerializableSingleton.class) {
                /**
                 * answer 非线程安全
                 * instance = new DoubleCheck();
                 * 简单来说上面一行代码其实做了3件事
                 * 1.申请内存空间
                 * 2.对象初始化
                 * 3.内存地址指向初始化的对象
                 */
                instance = new DoubleCheck();
            }
        }
        return instance;
    }

}
