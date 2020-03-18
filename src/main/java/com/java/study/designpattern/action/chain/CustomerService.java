package com.java.study.designpattern.action.chain;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author zrfan
 * @className CustomerService
 * @description TODO
 * @date 2020/3/18 21:17
 **/
public abstract class CustomerService {

    private String[] business;

    private CustomerService next;

    protected static final String INTRODUCE = "introduce";
    protected static final String ANS_QUES = "answerQuestion";
    protected static final String PRE_SALE = "preSale";
    protected static final String PRICE = "price";
    protected static final String POST_SALE = "postSale";
    protected static final String MAINTAIN = "maintain";
    protected static final String COMPLAINT = "complaint";
    protected static final String SUGGEST = "suggest";

    public CustomerService(String[] business) {
        this.business = business;
    }

    public String answerQuestion(String questionType) {
        String answer = "这个问题我们处理不了，我们反馈给领导，有结果后给您回复。";
        if (canProcess(questionType)) {
            answer = doAnswer(questionType);
        } else {
            if (this.next != null) {
                answer = next.answerQuestion(questionType);
            }
        }
        return answer;
    }

    protected boolean canProcess(String questionType) {
        if (Objects.nonNull(this.business) && this.business.length > 0) {
            List<String> businessList = Arrays.asList(this.business);
            return businessList.contains(questionType);
        }
        return false;
    }

    protected abstract String doAnswer(String questionType);

    public CustomerService getNext() {
        return next;
    }

    public void setNext(CustomerService next) {
        this.next = next;
    }
}
