package com.yang.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class ProtypeTest {
    public static void main(String[] args) {
        ConcreatePrototypeA concreatePrototypeA =new ConcreatePrototypeA();
        List hobbies =new ArrayList();
        concreatePrototypeA.setHobbies(hobbies);
        concreatePrototypeA.setAge(18);
        concreatePrototypeA.setName("Json");

        Client client=new Client(concreatePrototypeA);
        ConcreatePrototypeA copy = (ConcreatePrototypeA) client.starClone(concreatePrototypeA);
        System.out.println(copy);
        System.out.println("克隆对象中引用类型的地址："+copy.getHobbies());
    }
}
