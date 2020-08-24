package com.java.study.designpattern.specification;

/**
 * @author zrfan
 * @className ConditionService
 * @description TODO
 * @date 2020/8/24 21:26
 **/
public interface Condition {

    String toSql();

    Condition and(Condition con);

    Condition or(Condition con);

}
