package com.yang.strategy.promotion;

public class PromotionStrategyTest {
    public static void main(String[] args) {
//        PromotionActivity promotionActivity1111=new PromotionActivity(new CashbackStrategy());
//        promotionActivity1111.excute();
        String promotionKey = "GROUPBUY";


        PromotionActivity promotionActivity = new
                PromotionActivity(PromotionStrategyFactory.getPrrmotionStrategy(promotionKey));
        promotionActivity.excute();
    }
}
