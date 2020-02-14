package com.java.study.designpattern.create.singleton;

/**
 * @author zrfan
 * @className HungrySingleton
 * @description 饿汉式，联想记忆，饿汉，乞丐，不能等，来了就要。
 * 获取的时候必须存在，提前创建好
 * question 1 为啥不需要同步？ 通过类加载机制保证的。线程安全
 * 扩展类加载机制   classloader  双亲委派模式
 * 加载过程 以及 static  /static final  对象类型 都是 对象 init
 * @date 2020/2/14 21:21
 **/
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

}