package com.padcmyanmar.burpple.network.responses;

import com.google.gson.annotations.SerializedName;
import com.padcmyanmar.burpple.data.vo.GuidesVo;

import java.util.List;

/**
 * Created by ICE on 13-01-2018.
 */

public class GetGuidesResponse {

    private int code;
    private String message;
    private String apiVersion;
    private String page;
    @SerializedName("featured")
    private List<GuidesVo> guides;

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

    public List<GuidesVo> getGuides() {
        return guides;
    }



}
