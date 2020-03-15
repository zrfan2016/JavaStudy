package com.java.study.designpattern.structure.facade;

import java.util.Random;

/**
 * @author zrfan
 * @className OpenUrlNew
 * @description TODO
 * @date 2020/3/15 20:34
 **/
public class OpenUrlNew {

    private Random random = new Random();

    public boolean parseIP(String url) {
        boolean flag = this.cacheDNSParse();
        if (!flag) {
            flag = this.localDNSParse();
            if (!flag) {
                flag = this.rootDNSParse();
            }
        }
        return flag;
    }

    public String requestContent(boolean flag) {
        if (!flag) {
            System.out.println("can't get ip 404");
            return "404";
        }
        System.out.println("parse ip success");
        connect();
        return getResponse();
    }

    private boolean cacheDNSParse() {
        System.out.println("缓存域名解析");
        return getResult();
    }

    private boolean localDNSParse() {
        System.out.println("本地域名解析");
        return getResult();
    }

    private boolean rootDNSParse() {
        System.out.println("根域名解析");
        return getResult();
    }

    private void connect() {
        System.out.println("connect to ip");
    }

    private String getResponse() {
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

    public static OpenUrlNew getInstance() {
        return new OpenUrlNew();
    }

}
