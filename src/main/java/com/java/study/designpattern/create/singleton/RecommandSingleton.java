package com.java.study.designpattern.create.singleton;

/**
 * @author zrfan
 * @className RecommandSingleton
 * @description 线程安全 且懒加载 类加载机制保证
 * @date 2020/2/14 22:08
 **/
public class RecommandSingleton {

    private RecommandSingleton() {
    }

    private static RecommandSingleton instance;

    public static RecommandSingleton getInstance() {
        return Holder.instance;
    }

    private static class Holder {
        public static final RecommandSingleton instance = new RecommandSingleton();
    }

    public void writeObject() {
    }

}
