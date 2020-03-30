package com.java.study.designpattern.action.chain;

/**
 * @author zrfan
 * @className CallSenter
 * @description TODO
 * @date 2020/3/18 21:15
 **/
public class CallCenter {

    public static void main(String[] args) {
        CustomerService introduceCS = new CustomerServiceIntroduce(new String[]{CustomerService.INTRODUCE, CustomerService.ANS_QUES});
        CustomerService preSaleCS = new CustomerServicePreSale(new String[]{CustomerService.PRE_SALE, CustomerService.PRICE});
        CustomerService postSaleCS = new CustomerServicePostSale(new String[]{CustomerService.POST_SALE, CustomerService.MAINTAIN});
        CustomerService complaint = new CustomerServiceIntroduce(new String[]{CustomerService.COMPLAINT, CustomerService.SUGGEST});
        introduceCS.setNext(preSaleCS);
        preSaleCS.setNext(postSaleCS);
        postSaleCS.setNext(complaint);

        String question = "introduce";
        System.out.println(introduceCS.answerQuestion(question));


    }
}
