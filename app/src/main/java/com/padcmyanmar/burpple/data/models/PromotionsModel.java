package com.padcmyanmar.burpple.data.models;

import com.padcmyanmar.burpple.network.OkHttpPromotionsDataAgent;
import com.padcmyanmar.burpple.network.PromotionsDataAgent;

/**
 * Created by ICE on 12-01-2018.
 */

public class PromotionsModel {



    private static PromotionsModel sObjInstance;
    private PromotionsDataAgent mpromotionsDataAgent;


    public PromotionsModel() {

        mpromotionsDataAgent= OkHttpPromotionsDataAgent.getsObjInstance();

    }

    public static PromotionsModel getsObjInstance() {

        if(sObjInstance==null)
        {
            sObjInstance= new PromotionsModel();
        }
        return sObjInstance;
    }

public void loadPromotions()
{
    mpromotionsDataAgent.loadPromotions();
}




}
