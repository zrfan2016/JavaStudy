package com.java.study.designpattern.structure.facade;

import java.util.Random;

/**
 * @author zrfan
 * @className OpenUrl
 * @description 面试题，打开一个网址是都发生了什么 -_-!
 * @date 2020/3/15 20:13
 **/
public class OpenUrl {

    private Random random = new Random();

    public boolean cacheDNSParse() {
        System.out.println("缓存域名解析");
        return getResult();
    }

    public boolean localDNSParse() {
        System.out.println("本地域名解析");
        return getResult();
    }

    public boolean rootDNSParse() {
        System.out.println("根域名解析");
        return getResult();
    }

    public void connect() {
        System.out.println("connect to ip");
    }

    public String getResponse() {
        return "hello world!";
    }

    private boolean getResult() {
        int num = random.nextInt();
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static OpenUrl getInstance() {
        return new OpenUrl();
    }


}
