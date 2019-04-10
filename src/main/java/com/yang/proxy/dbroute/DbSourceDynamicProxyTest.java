package com.yang.proxy.dbroute;

import java.util.Date;

public class DbSourceDynamicProxyTest {
    public static void main(String[] args) {
        Order order=new Order();
        order.setCreate(new Date().getTime());
        IOrderService orderService=(IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
        orderService.createOrder(order);
    }
}
