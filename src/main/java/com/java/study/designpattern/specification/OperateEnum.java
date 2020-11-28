package com.java.study.designpattern.specification;

/**
 * @Author: zrfan
 * @Date: 2020/8/24 22:01
 * @Description: TODO
 */
public enum OperateEnum {
    EQ("="), NOT_EQ("<>"), GT(">"), LT("<");

    private String str;

    OperateEnum(String str) {
        this.str = str;
    }
}
