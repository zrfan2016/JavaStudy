package com.java.study.designpattern.specification;/**
 * @Auther: zrfan
 * @Date: 2020/8/24 21:30
 * @Description: TODO
 */

/**
 * @author zrfan
 * @className AbstractCondition
 * @description TODO
 * @date 2020/8/24 21:30
 **/
public abstract class AbstractCondition implements Condition{

    @Override
    public Condition and(Condition con) {
        return new AndConditon(this,con);
    }

    @Override
    public Condition or(Condition con) {
        return new OrCondition(this,con);
    }
}
