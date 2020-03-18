package com.java.study.designpattern.action.chain;

/**
 * @author zrfan
 * @className CustomerServicePostSale
 * @description 售后
 * @date 2020/3/18 21:34
 **/
public class CustomerServicePostSale extends CustomerService {
    public CustomerServicePostSale(String[] business) {
        super(business);
    }

    @Override
    protected String doAnswer(String questionType) {
        return "这个问题需要您把产品寄回来，给您维修好在快递给您。";
    }
}
