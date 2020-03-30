package com.java.study.designpattern.action.command;

/**
 * @author zrfan
 * @className RejectCommand
 * @description TODO
 * @date 2020/3/21 21:11
 **/
public class RejectCommand extends AbstractCommand {

    private String orderNo;
    private String price;
    private String goods;
    private String reason;


    public RejectCommand(String orderNo, String price, String goods, String reason) {
        this.orderNo = orderNo;
        this.price = price;
        this.goods = goods;
        this.reason = reason;
    }

    private AbstractReceiver staff = new Staff();
    private AbstractReceiver expressman = new Expressman();

    @Override
    public void execute() {
        System.out.printf("退货[%s],订单号[%s]，价格：[%s]，原因[%s]", goods, orderNo, price, reason);
        expressman.doSomething();
        staff.doSomething();
    }
}
