package com.java.study.designpattern.structure.flyweight;

/**
 * @author zrfan
 * @className PoolService
 * @description TODO
 * @date 2020/3/17 21:23
 **/
public interface PoolService {

    Connection getConnection() throws Exception;

    void release(Connection con);

}
