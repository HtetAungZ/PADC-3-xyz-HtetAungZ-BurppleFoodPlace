package com.padcmyanmar.burpple.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ICE on 12-01-2018.
 */

public class PromotionsShopVo {


    @SerializedName("burpple-shop-id")
    private String burppleShopId;
    @SerializedName("burpple-shop-name")
    private String burppleShopName;
    @SerializedName("burpple-shop-area")
    private String burppleShopArea;


    public String getBurppleShopId() {
        return burppleShopId;
    }

    public String getBurppleShopName() {
        return burppleShopName;
    }

    public String getBurppleShopArea() {
        return burppleShopArea;
    }


}
