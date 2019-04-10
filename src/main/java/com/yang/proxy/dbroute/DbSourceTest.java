package com.yang.proxy.dbroute;

import java.util.Date;

public class DbSourceTest {
    public static void main(String[] args) {
        Order order=new Order();
        order.setCreate(new Date().getTime());
        IOrderService orderService=new OrderServiceStaticProxy(new OrderService());
        orderService.createOrder(order);
    }
}
