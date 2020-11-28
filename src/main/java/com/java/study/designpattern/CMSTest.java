package com.java.study.designpattern;

/**
 * @Author: zrfan
 * @Date: 2020/9/12 11:45
 * @Description:
 * 
 *               -Xmx3m -Xmn3m -XX:+PrintGCDetails -Dfile.encoding=UTF-8 -XX:+PrintGCDetails -XX:+PrintCommandLineFlags
 */
public class CMSTest {

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        int MAX_LOOP = 10;
        while (true && i < MAX_LOOP) {
            Student stu = new Student();
            i++;
            System.out.println("i:" + i + ",stu:" + stu.hashCode());
            Thread.sleep(1000);
        }
    }

}

class Student {
    private int id;
    private String code;
    private String name;
    private String address;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
