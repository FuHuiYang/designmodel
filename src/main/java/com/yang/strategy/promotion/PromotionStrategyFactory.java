package com.yang.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP=new HashMap<String,PromotionStrategy>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK,new CouponStrategy());
    }
    private static final PromotionStrategy NON_PROMOTION =new EmptyStrategy();
    private PromotionStrategyFactory(){}
    public static PromotionStrategy getPrrmotionStrategy(String promotion){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotion);
        return  promotionStrategy==null?NON_PROMOTION:promotionStrategy;
    }
    private interface PromotionKey {
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
    }
}
