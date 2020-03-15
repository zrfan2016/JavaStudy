package com.java.study.designpattern.structure.facade;

/**
 * @author zrfan
 * @className Test
 * @description TODO
 * @date 2020/3/15 20:26
 **/
public class Test {
    public static void main(String[] args) {
        OpenUrl instance = OpenUrl.getInstance();
        System.out.println(doOpen(instance));

    }

    private static String doOpen(OpenUrl instance) {
        boolean flag = instance.cacheDNSParse();
        if (!flag) {
            flag = instance.localDNSParse();
            if (!flag) {
                flag = instance.rootDNSParse();
            }
        }
        if (!flag) {
            return "404";
        }
        instance.connect();
        return instance.getResponse();
    }
}
