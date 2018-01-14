package com.padcmyanmar.burpple.data.models;

import com.padcmyanmar.burpple.network.GuidesDataAgent;
import com.padcmyanmar.burpple.network.OkHttpGuidesDataAgent;
import com.padcmyanmar.burpple.network.responses.RetrofitGuidesDataAgent;

/**
 * Created by ICE on 13-01-2018.
 */

public class GuidesModel {

    private static GuidesModel sObjInstance;
    private GuidesDataAgent mguidesDataAgent;

    public GuidesModel() {
      //  mguidesDataAgent = OkHttpGuidesDataAgent.getObjectInstance();
        mguidesDataAgent= RetrofitGuidesDataAgent.getsObjInstance();
    }

    public static GuidesModel getsObjInstance() {
        if (sObjInstance == null) {
            sObjInstance = new GuidesModel();
        }
        return sObjInstance;
    }

    public void loadGuides() {
        mguidesDataAgent.loadGuides();
    }

}
