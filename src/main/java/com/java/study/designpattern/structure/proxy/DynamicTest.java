package com.java.study.designpattern.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zrfan
 * @className DynamicTest
 * @description TODO
 * @date 2020/3/16 22:11
 **/
public class DynamicTest {
    public static void main(String[] args) {
        IStar starA = new StarA();

        InvocationHandler handler = new DynamicProxyHandler(starA);

        IStar starProxy = (IStar) Proxy.newProxyInstance(starA.getClass().getClassLoader(), new Class[]{IStar.class}, handler);

        starProxy.dance();
        starProxy.act();
        starProxy.sing();


        IStar proxy = getProxy(starA);
        doWork(proxy);

        proxy = getProxy(new StarB());
        doWork(proxy);

        proxy = getProxy(new StarC());
        doWork(proxy);

    }

    private static void doWork(IStar proxy) {
        proxy.act();
        proxy.sing();
        proxy.dance();
    }


    private static <T> T getProxy(Object obj) {
        ClassLoader loader = obj.getClass().getClassLoader();
        Class[] interfaces = obj.getClass().getInterfaces();
        return (T) Proxy.newProxyInstance(loader, interfaces, new InvocationHandlerImpl(obj));
    }

}
