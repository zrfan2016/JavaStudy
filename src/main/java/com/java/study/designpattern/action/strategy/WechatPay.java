package com.java.study.designpattern.action.strategy;

/**
 * @author zrfan
 * @className WechatPay
 * @description TODO
 * @date 2020/4/1 22:07
 **/
public class WechatPay implements PayStrategy {

    public static final String SUCC_RES = "SUCCESS";
    public static final String PAY_TYPE = "Wechat";

    @Override
    public String doPay(String orderNo) {
        System.out.println(PAY_TYPE + "支付");
        return SUCC_RES;
    }

    @Override
    public String doRefund(String orderNo) {
        System.out.println(PAY_TYPE + "退款");
        return SUCC_RES;
    }

    @Override
    public String doQuery(String orderNo) {
        System.out.println(PAY_TYPE + "退款");
        return SUCC_RES;
    }
}
