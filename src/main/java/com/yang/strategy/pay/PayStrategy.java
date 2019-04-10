package com.yang.strategy.pay;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
    public static final String ALI_PAY="AliPay";
    public static final String JD_PAY="JDPay";
    public static final String WECHAT_PAY="WeChatPay";
    public static final String DEFAULT_PAY="AliPay";

    private static Map<String,Payment> payStrategy = new HashMap<String,Payment>();
    static {
        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(WECHAT_PAY,new WeChatPay());
        payStrategy.put(JD_PAY,new JDPay());
    }
    public static Payment get(String payKey) {
        if (!payStrategy.containsKey(payKey)) {
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }
}
