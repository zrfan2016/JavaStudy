package com.java.study.designpattern.action.visitor;

import java.util.UUID;

/**
 * @author zrfan
 * @className Test
 * @description TODO
 * @date 2020/3/31 21:32
 **/
public class Test {
    public static void main(String[] args) {
        int a = 0;
        String id = UUID.randomUUID().toString();
        System.out.println(id);
    }

    public void test(int a, int b) {
        System.out.println(a + b);
    }
}
