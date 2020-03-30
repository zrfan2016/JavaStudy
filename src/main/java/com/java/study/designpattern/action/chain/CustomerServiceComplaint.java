package com.java.study.designpattern.action.chain;

/**
 * @author zrfan
 * @className CustomerServiceComplaint
 * @description 投诉建议
 * @date 2020/3/18 21:37
 **/
public class CustomerServiceComplaint extends CustomerService {

    public CustomerServiceComplaint(String[] business) {
        super(business);
    }

    @Override
    protected String doAnswer(String questionType) {
        return "我们已经收到您的投诉或建议，并已反馈领导，稍后会给您满意答复。";
    }
}
