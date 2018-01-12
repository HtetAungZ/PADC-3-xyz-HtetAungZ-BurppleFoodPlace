package com.padcmyanmar.burpple.network.responses;

import com.padcmyanmar.burpple.data.vo.PromotionsVo;

import java.util.List;

/**
 * Created by ICE on 12-01-2018.
 */

public class GetPromotionsResponse {

    private int code;
    private String message;
    private String apiVersion;
    private String page;
    private List<PromotionsVo> promotions;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<PromotionsVo> getPromotions() {
        return promotions;
    }
}
