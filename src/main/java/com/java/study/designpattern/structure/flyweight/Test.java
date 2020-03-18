package com.java.study.designpattern.structure.flyweight;

import java.util.Random;

/**
 * @author zrfan
 * @className Test
 * @description TODO
 * @date 2020/3/17 22:00
 **/
public class Test {

    public static void main(String[] args) throws Exception {
        ConnectionPool pool = ConnectionPool.getInstance(5, 10);

        Random random = new Random();

        int requestNo = 20;
        for (int i = 0; i < requestNo; i++) {
            Connection con = pool.getConnection();
            System.out.println(con.getId());
            int rand = random.nextInt();
            if (rand % 2 == 0) {
                pool.release(con);
            }
        }

    }
}
