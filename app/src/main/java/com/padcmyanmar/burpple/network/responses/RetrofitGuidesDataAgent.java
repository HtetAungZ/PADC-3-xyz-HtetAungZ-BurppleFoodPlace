package com.padcmyanmar.burpple.network.responses;

import com.google.gson.Gson;
import com.padcmyanmar.burpple.events.LoadedGuidesEvent;
import com.padcmyanmar.burpple.events.LoadedPromotionsEvent;
import com.padcmyanmar.burpple.network.GuidesApi;
import com.padcmyanmar.burpple.network.GuidesDataAgent;
import com.padcmyanmar.burpple.network.PromotionsApi;
import com.padcmyanmar.burpple.network.PromotionsDataAgent;

import org.greenrobot.eventbus.EventBus;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ICE on 13-01-2018.
 */

public class RetrofitGuidesDataAgent implements GuidesDataAgent {

        private static RetrofitGuidesDataAgent sObjInstance;
        private GuidesApi mguidesApi;

    public static RetrofitGuidesDataAgent getsObjInstance() {
       if(sObjInstance==null)
       {
           sObjInstance= new RetrofitGuidesDataAgent();
       }

        return sObjInstance;
    }

    private RetrofitGuidesDataAgent() {

        OkHttpClient httpClient = new OkHttpClient.Builder() //1. okhttp client
                .connectTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()//2 get retrofit object
                .baseUrl("http://padcmyanmar.com/padc-3/burpple-food-places/apis/v1/")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .client(httpClient)
                .build();

        mguidesApi = retrofit.create(GuidesApi.class);//3 create api object


    }

    @Override
    public void loadGuides() {

        Call<GetGuidesResponse> getGuidesResponseCall = mguidesApi.loadGuides(1, "b002c7e1a528b7cb460933fc2875e916");

        //4 call api object
        getGuidesResponseCall.enqueue(new Callback<GetGuidesResponse>() {
            @Override
            public void onResponse(Call<GetGuidesResponse> call, Response<GetGuidesResponse> response) {
                GetGuidesResponse getGuidesResponse = response.body();
                if (getGuidesResponse != null) {
                    LoadedGuidesEvent event = new LoadedGuidesEvent(getGuidesResponse.getGuides());
                    EventBus.getDefault().post(event);
                }

            }

            @Override
            public void onFailure(Call<GetGuidesResponse> call, Throwable t) {

            }
        });

    }
}
