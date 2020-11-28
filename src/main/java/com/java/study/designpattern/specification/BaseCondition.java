package com.java.study.designpattern.specification;

/**
 * @Author: zrfan
 * @Date: 2020/8/24 21:57
 * @Description: TODO
 */
public class BaseCondition extends AbstractCondition {

    private String key;
    private String value;
    // private

    @Override
    public String toSql() {
        return "";
    }
}
