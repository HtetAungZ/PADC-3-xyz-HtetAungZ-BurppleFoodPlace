package com.padcmyanmar.burpple.events;

import com.padcmyanmar.burpple.data.vo.PromotionsVo;

import java.util.List;

/**
 * Created by ICE on 12-01-2018.
 */

public class LoadedPromotionsEvent {

    private List<PromotionsVo> promotionList;

    public List<PromotionsVo> getPromotionList() {
        return promotionList;
    }

    public LoadedPromotionsEvent(List<PromotionsVo> promotionList) {

        this.promotionList = promotionList;
    }
}
