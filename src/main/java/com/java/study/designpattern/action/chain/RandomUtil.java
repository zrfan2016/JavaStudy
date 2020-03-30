package com.java.study.designpattern.action.chain;

import java.util.Random;

/**
 * @author zrfan
 * @className RandomUtil
 * @description TODO
 * @date 2020/3/18 22:18
 **/
public class RandomUtil {

    private static Random random = new Random();

    public static int getRandom() {
        return random.nextInt();
    }

    public static boolean hasRemainder(int a, int b) {
        return a % b == 0;
    }

}
