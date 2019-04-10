package com.yang.strategy.pay;

import com.yang.delegate.mvc.controllers.MemberController;

public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1", "1615651", 11.2);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
