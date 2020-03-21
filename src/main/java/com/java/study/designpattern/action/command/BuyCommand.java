package com.java.study.designpattern.action.command;

/**
 * @author zrfan
 * @className BuyCommand
 * @description TODO
 * @date 2020/3/21 21:05
 **/
public class BuyCommand extends AbstractCommand {

    private String orderNo;
    private String price;
    private String goods;

    public BuyCommand(String orderNo, String price, String goods) {
        this.orderNo = orderNo;
        this.price = price;
        this.goods = goods;
    }

    private AbstractReceiver staff = new Staff();
    private AbstractReceiver expressman = new Expressman();

    @Override
    public void execute() {
        System.out.printf("购买[%s],订单号[%s]，价格：[%s]", goods, orderNo, price);
        staff.doSomething();
        expressman.doSomething();
    }
}
