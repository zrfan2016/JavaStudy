package com.java.study.designpattern.action.chain;

/**
 * @author zrfan
 * @className CustomerServicePreSales
 * @description 售前客服
 * @date 2020/3/18 21:32
 **/
public class CustomerServicePreSale extends CustomerService {
    public CustomerServicePreSale(String[] business) {
        super(business);
    }

    @Override
    protected String doAnswer(String questionType) {
        return "价格在给您优惠点，合适您就赶紧买吧，过几天就涨价了，而且也没有这么多优惠啦";
    }
}
