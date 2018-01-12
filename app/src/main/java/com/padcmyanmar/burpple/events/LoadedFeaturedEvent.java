package com.padcmyanmar.burpple.events;

import com.padcmyanmar.burpple.data.vo.FeaturedVo;

import java.util.List;

/**
 * Created by ICE on 12-01-2018.
 */

public class LoadedFeaturedEvent {

    private List<FeaturedVo> featuredList;

    public LoadedFeaturedEvent(List<FeaturedVo> featuredList) {
        this.featuredList = featuredList;
    }

    public List<FeaturedVo> getFeaturedList() {

        return featuredList;
    }
}
