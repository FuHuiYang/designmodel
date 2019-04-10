package com.yang.proxy.dbroute;

public class OrderDao {
    public int insertOrder(Order order){
        System.out.println("创建订单成功");
        return 1;
    }
}
