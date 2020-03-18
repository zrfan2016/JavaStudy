package com.java.study.designpattern.action.chain;

/**
 * @author zrfan
 * @className CustomerServiceIntroduce
 * @description 业务介绍
 * @date 2020/3/18 21:38
 **/
public class CustomerServiceIntroduce extends CustomerService {
    public CustomerServiceIntroduce(String[] business) {
        super(business);
    }

    @Override
    protected String doAnswer(String questionType) {
        return "根据您的问题，我们的产品是这样式的 bla bla";
    }
}
