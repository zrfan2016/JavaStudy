package com.java.study.designpattern.create.prototype;

/**
 * @author zrfan
 * @className Test1
 * @description
 * @date 2020/3/1 10:00
 **/
public class Test1 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee.Builder().name("张三").no("111").dept("研发部").position("程序员").salary(10000).
                address("beijing").id("11111111111111111").phone("1213132132").build();

        Employee e2 = new Employee.Builder().name("里斯").no("112").dept("市场部").position("市场专员").salary(10000).
                address("beijing").id("21313131").phone("4213131").build();

        LaborContract contract = LaborContract.defaultLaborContract();
        LaborContract c2 = contract.clone();
        LaborContract c1 = contract.clone();
        c1.setEmployee(e1);
        c2.setEmployee(e2);

        System.out.println(c1);
        System.out.println(c2);

    }
}
