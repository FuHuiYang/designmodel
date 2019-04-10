package com.yang.com.yang.singleton.test;

import com.yang.singleton.register.EnumSingleton;
import com.yang.singleton.seriable.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumTest {
    public static void main(String[] args) {
        EnumSingleton s1=null;
        EnumSingleton s2= EnumSingleton.getInstance();
        FileOutputStream fos= null;

        s2.setObject(new Object());
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton)ois.readObject();
            ois.close();
            System.out.println(s1==s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
