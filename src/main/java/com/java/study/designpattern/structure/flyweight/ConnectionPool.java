package com.java.study.designpattern.structure.flyweight;

import java.util.LinkedList;

/**
 * @author zrfan
 * @className ConnectionPool
 * @description TODO
 * @date 2020/3/16 21:23
 **/
public class ConnectionPool implements PoolService {

    private int minNum;
    private int maxNum;

    private LinkedList<Connection> usedConnections = new LinkedList<>();
    private LinkedList<Connection> unUsedonnections = new LinkedList<>();

    private volatile static ConnectionPool poolInstance;

    private ConnectionPool(int minNum, int maxNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        initConnection(minNum);
    }

    @Override
    public Connection getConnection() throws Exception {
        int allConnections = unUsedonnections.size() + usedConnections.size();
        boolean maxFlag = allConnections >= maxNum;
        if (maxFlag && unUsedonnections.isEmpty()) {
            throw new Exception("no connections");
        }

        if (unUsedonnections.isEmpty()) {
            resize(allConnections);
        }
        Connection con = unUsedonnections.pop();
        usedConnections.addLast(con);
        return con;
    }

    @Override
    public void release(Connection con) {
        usedConnections.remove(con);
        unUsedonnections.addLast(con);
    }

    private void initConnection(int num) {
        for (int i = 0; i < num; i++) {
            unUsedonnections.add(new Connection());
        }
    }

    private void resize(int currentSize) {
        int remain = maxNum - currentSize;
        int num = remain > 5 ? 5 : remain;
        initConnection(num);
    }

    public static ConnectionPool getInstance(int minNum, int maxNum) {
        if (poolInstance == null) {
            synchronized (ConnectionPool.class) {
                if (poolInstance == null) {
                    poolInstance = new ConnectionPool(minNum, maxNum);
                }
            }
        }
        return poolInstance;
    }


}
