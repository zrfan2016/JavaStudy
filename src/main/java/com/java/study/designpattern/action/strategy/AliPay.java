package com.java.study.designpattern.action.strategy;

/**
 * @author zrfan
 * @className Ali
 * @description TODO
 * @date 2020/4/1 22:05
 **/
public class AliPay implements PayStrategy {

    public static final String SUCC_RES = "SUCCESS";
    public static final String PAY_TYPE = "Ali";

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
        System.out.println(PAY_TYPE + "查询订单状态");
        return SUCC_RES;
    }
}
