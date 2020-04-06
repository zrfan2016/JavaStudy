package com.java.study.designpattern.action.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zrfan
 * @className OrderService
 * @description TODO
 * @date 2020/4/1 22:15
 **/
public class OrderService {

    private static Map<PayTypeEnum, PayStrategy> map = new HashMap<>(4);

    static {
        map.put(PayTypeEnum.ALI, new AliPay());
        map.put(PayTypeEnum.WECHAT, new WechatPay());
    }

    public String pay(String orderNo, PayTypeEnum payType) {
        return map.get(payType).doPay(orderNo);
    }

    public String refund(String orderNo) {
        return map.get(queryPayType(orderNo)).doRefund(orderNo);
    }

    public String queryOrder(String orderNo) {
        return map.get(queryPayType(orderNo)).doQuery(orderNo);
    }

    private PayTypeEnum queryPayType(String orderNo) {
        // 这里应该是查询出来的
        return PayTypeEnum.ALI;
    }

}
