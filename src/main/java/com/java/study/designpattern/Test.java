package com.java.study.designpattern;

/**
 * @Author: zrfan
 * @Date: 2020/8/30 20:38
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        int count_bits = Integer.SIZE - 3;

        int runningState = -1 << count_bits;
        int shutdown = 0 << count_bits;
        int stop = 1 << count_bits;

        System.out.println(Integer.toBinaryString(runningState));
        System.out.println(Integer.toBinaryString(shutdown));
        System.out.println(Integer.toBinaryString(stop));

        System.out.println(Integer.toBinaryString(1 | 0));

    }
}
