package com.padcmyanmar.burpple.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ICE on 12-01-2018.
 */

public class FeaturedVo {

    @SerializedName("burpple-featured-id")
    private String burppleFeaturedId;
    @SerializedName("burpple-featured-image")
    private String burppleFeaturedImage;
    @SerializedName("burpple-featured-title")
    private String burppleFeaturedTitle;
    @SerializedName("burpple-featured-desc")
    private String burppleFeaturedDesc;
    @SerializedName("burpple-featured-tag")
    private String burppleFeaturedTag;

    public String getBurppleFeaturedId() {
        return burppleFeaturedId;
    }

    public String getBurppleFeaturedImage() {
        return burppleFeaturedImage;
    }

    public String getBurppleFeaturedTitle() {
        return burppleFeaturedTitle;
    }

    public String getBurppleFeaturedDesc() {
        return burppleFeaturedDesc;
    }

    public String getBurppleFeaturedTag() {
        return burppleFeaturedTag;
    }



}
