package com.java.study.designpattern.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zrfan
 * @className DynamicProxy
 * @description TODO
 * @date 2020/3/16 22:07
 **/
public class DynamicProxyHandler implements InvocationHandler {

    private Object obj;

    public DynamicProxyHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.obj, args);
    }
}
