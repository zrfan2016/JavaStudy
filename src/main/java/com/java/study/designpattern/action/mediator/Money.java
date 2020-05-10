package com.java.study.designpattern.action.mediator;

import java.util.Objects;

/**
 * @author zrfan 19042901
 * @date 2020/5/10 21:43
 * @description TODO
 */
public class Money {

    public int changePro(ProductService from, int quantity, ProductService target) {
        int res = target.getByMoney(from.change2Money(quantity));
        System.out.println("From " + from.getClass().getSimpleName() + " quantity" + quantity + " change to "
            + target.getClass().getSimpleName() + " quantity is " + res);
        return res;
    }

    private boolean isProduct(Class clz) {
        Class[] ars = clz.getInterfaces();
        if (Objects.isNull(ars)) {
            return false;
        }
        for (int i = 0; i < ars.length; i++) {
            if (ProductService.class.equals(ars[i])) {
                return true;
            }
        }
        return false;
    }

}
