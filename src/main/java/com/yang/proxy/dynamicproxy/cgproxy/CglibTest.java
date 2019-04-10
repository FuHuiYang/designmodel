package com.yang.proxy.dynamicproxy.cgproxy;

import com.yang.proxy.Person;

public class CglibTest {
    public static void main(String[] args) {
        try {
            Customer customer =(Customer) new CglibMeipo().getInstance(Customer.class);
            customer.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
