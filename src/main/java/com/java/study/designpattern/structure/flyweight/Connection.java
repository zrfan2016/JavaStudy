package com.java.study.designpattern.structure.flyweight;

import java.util.UUID;

/**
 * @author zrfan
 * @className Connection
 * @description TODO
 * @date 2020/3/16 21:24
 **/
public class Connection {

    private String id;

    public Connection() {
        this.id = UUID.randomUUID().toString().toUpperCase();
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Connection{");
        sb.append("id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
