package com.java.study.designpattern.create.prototype;

/**
 * @author zrfan
 * @className User
 * @description TODO
 * @date 2020/2/29 21:57
 **/
public class Student implements java.lang.Cloneable {
    private String name;
    private String stuNo;
    private int gender;
    private String phone;

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", stuNo='").append(stuNo).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    public static Student createStudent(String name, int gender, String phone, String stuNo) {
        Student st = new Student();
        st.setName(name);
        st.setGender(gender);
        st.setPhone(phone);
        st.setStuNo(stuNo);
        return st;
    }


}
