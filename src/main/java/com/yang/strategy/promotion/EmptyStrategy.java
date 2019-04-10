package com.yang.strategy.promotion;

public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无优惠的策略价格");
    }
}
