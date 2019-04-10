package com.yang.strategy.promotion;

public class PromotionActivity {
    private  PromotionStrategy promotionStrategy;
    public  PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy=promotionStrategy;
    }
    public void excute(){
        promotionStrategy.doPromotion();
    }


}
