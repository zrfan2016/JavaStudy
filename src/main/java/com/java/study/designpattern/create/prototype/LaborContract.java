package com.java.study.designpattern.create.prototype;

/**
 * @author zrfan
 * @className LaborContract
 * @description 劳动合同/试卷/租房合同
 * @date 2020/3/1 9:49
 **/
public class LaborContract implements java.lang.Cloneable {
    private Employee employee;
    private String content;

    public LaborContract() {
    }

    @Override
    public LaborContract clone() throws CloneNotSupportedException {
        return (LaborContract) super.clone();
    }

    public static LaborContract defaultLaborContract() {
        LaborContract contract = new LaborContract();
        contract.setContent("我们签订雇佣劳动合同");
        return contract;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LaborContract{");
        sb.append("employee=").append(employee);
        sb.append(", content='").append(content).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
