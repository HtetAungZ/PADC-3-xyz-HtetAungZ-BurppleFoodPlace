package com.padcmyanmar.burpple.events;

import com.padcmyanmar.burpple.data.vo.GuidesVo;

import java.util.List;

/**
 * Created by ICE on 13-01-2018.
 */

public class LoadedGuidesEvent {

    private List<GuidesVo> guidesList;

    public List<GuidesVo> getGuidesList() {
        return guidesList;
    }

    public LoadedGuidesEvent(List<GuidesVo> guidesList) {
        this.guidesList = guidesList;
    }

}
