package com.yang.strategy.pay;

public class Order {
    private String uid;
    private String orderid;
    private double amount;

    public Order(String uid, String orderid, double amount) {
        this.uid = uid;
        this.orderid = orderid;
        this.amount = amount;
    }
    public PayState pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public PayState pay(String payKey) {
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用"+payment.getName()+"支付");
        System.out.println("本次交易金额为："+amount+",开始扣款");
        return payment.pay(uid,amount);
    }
}
