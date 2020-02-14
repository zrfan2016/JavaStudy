package com.java.study.designpattern.create.singleton;

import java.io.*;

/**
 * @author zrfan
 * @className SerializableSingleton
 * @description TODO
 * @date 2020/2/14 22:14
 **/
public class SerializableSingleton implements Serializable {


    private static volatile SerializableSingleton instance;

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        if (instance == null) {
            synchronized (SerializableSingleton.class) {
                instance = new SerializableSingleton();
            }
        }
        return instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "tempFile";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(SerializableSingleton.getInstance());
        File file = new File(fileName);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        SerializableSingleton instance = (SerializableSingleton) ois.readObject();
        System.out.println(instance == SerializableSingleton.getInstance());
        file.delete();
    }
}
