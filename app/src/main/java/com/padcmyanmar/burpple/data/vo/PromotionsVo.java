package com.padcmyanmar.burpple.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ICE on 12-01-2018.
 */

public class PromotionsVo {

    @SerializedName("burpple-promotion-id")
    private String burpplePromotionId;
    @SerializedName("burpple-promotion-image")
    private String burpplePromotionImage;
    @SerializedName("burpple-promotion-title")
    private String burpplePromotionTitle;
    @SerializedName("burpple-promotion-until")
    private String burpplePromotionUntil;



    @SerializedName("burpple-promotion-shop")
    private PromotionsShopVo burpplePromotionShop;
    @SerializedName("is-burpple-exclusive")
    private boolean isBurppleExclusive;
    @SerializedName("burpple-promotion-terms")
    private List<String> burpplePromotionTerms;





    public String getBurpplePromotionId() {
        return burpplePromotionId;
    }

    public String getBurpplePromotionImage() {
        return burpplePromotionImage;
    }

    public String getBurpplePromotionTitle() {
        return burpplePromotionTitle;
    }

    public String getBurpplePromotionUntil() {
        return burpplePromotionUntil;
    }

    public PromotionsShopVo getBurpplePromotionShop() {
        return burpplePromotionShop;
    }

    public boolean isBurppleExclusive() {
        return isBurppleExclusive;
    }


    public List<String> getBurpplePromotionTerms() {
        return burpplePromotionTerms;
    }


}
