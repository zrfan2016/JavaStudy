package com.java.study.designpattern.create.prototype;

/**
 * @author zrfan
 * @className Employee
 * @description 员工
 * @date 2020/3/1 9:51
 **/
public class Employee {
    private String name;
    /**
     * 工号
     */
    private String no;
    /**
     * 部门
     */
    private String dept;
    /**
     * 职位
     */
    private String position;
    /**
     * 薪水
     */
    private double salary;
    /**
     * 地址
     */
    private String address;
    /**
     * 电话
     */
    private String phone;
    /**
     * 身份证
     */
    private String id;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", no='").append(no).append('\'');
        sb.append(", dept='").append(dept).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", address='").append(address).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

    static class Builder {
        private Employee employee;

        public Builder() {
            employee = new Employee();
        }

        public Builder name(String name) {
            employee.setName(name);
            return this;
        }

        public Builder no(String no) {
            employee.setNo(no);
            return this;
        }

        public Builder dept(String dept) {
            employee.setDept(dept);
            return this;
        }

        public Builder position(String position) {
            employee.setPosition(position);
            return this;
        }

        public Builder salary(double salary) {
            employee.setSalary(salary);
            return this;
        }

        public Builder address(String address) {
            employee.setAddress(address);
            return this;
        }

        public Builder phone(String phone) {
            employee.setPhone(phone);
            return this;
        }

        public Builder id(String id) {
            employee.setId(id);
            return this;
        }

        public Employee build() {
            return employee;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
