package com.yang.strategy.promotion;

public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券策略，减少价格");
    }
}
