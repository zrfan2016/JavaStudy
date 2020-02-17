package com.java.study.designpattern.create.factory.simple;

/**
 * @author zrfan
 * @className Student
 * @description 学生实体类
 * @date 2020/2/15 22:28
 **/
public class Student {
    private String name;
    private String stuNo;
    private String gender;
    private int age;
    private String address;
    private String phone;

    /**
     * effective java 中提到 可用静态方法替代 构造放法
     *
     * @param name
     * @param gender
     * @param age
     * @return
     */
    public static Student createStudent(String name, String gender, int age) {
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(age);
        stu.setGender(gender);
        return stu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", stuNo='").append(stuNo).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", age=").append(age);
        sb.append(", address='").append(address).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append('}');
        return sb.toString();
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
}
