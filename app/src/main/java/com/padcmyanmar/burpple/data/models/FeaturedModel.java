package com.padcmyanmar.burpple.data.models;

import com.padcmyanmar.burpple.network.FeaturedDataAgent;
import com.padcmyanmar.burpple.network.OkHttpFeaturedDataAgent;
import com.padcmyanmar.burpple.network.responses.RetrofitFeaturedDataAgent;

/**
 * Created by ICE on 12-01-2018.
 */

public class FeaturedModel {

    private static FeaturedModel sObjInstance;
private FeaturedDataAgent mfeaturedDataAgent;

    private FeaturedModel() {

    //   mfeaturedDataAgent= OkHttpFeaturedDataAgent.getObjectInstance();
        mfeaturedDataAgent= RetrofitFeaturedDataAgent.getsObjInstance();
    }

    public static FeaturedModel getsObjInstance()
    {
        if(sObjInstance==null)
        {
            sObjInstance=new FeaturedModel();
        }
        return sObjInstance;
    }

    public void loadFeatures(){

        mfeaturedDataAgent.loadFeatured();
    }




}
