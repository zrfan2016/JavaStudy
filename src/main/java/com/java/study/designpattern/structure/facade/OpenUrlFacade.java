package com.java.study.designpattern.structure.facade;

/**
 * @author zrfan
 * @className OpenUrlFacade
 * @description 打开网址门面
 * @date 2020/3/15 20:33
 **/
public class OpenUrlFacade {

    public String openUrl(String url) {
        OpenUrlNew instance = OpenUrlNew.getInstance();
        boolean flag = instance.parseIP(url);
        return instance.requestContent(flag);
    }

    public static void main(String[] args) {
        OpenUrlFacade facade = new OpenUrlFacade();
        System.out.println(facade.openUrl("www.baidu.com"));
    }

}
