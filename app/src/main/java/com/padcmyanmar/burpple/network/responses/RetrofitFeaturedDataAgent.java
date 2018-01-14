package com.padcmyanmar.burpple.network.responses;

import com.google.gson.Gson;
import com.padcmyanmar.burpple.events.LoadedFeaturedEvent;
import com.padcmyanmar.burpple.network.FeaturedApi;
import com.padcmyanmar.burpple.network.FeaturedDataAgent;

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

public class RetrofitFeaturedDataAgent implements FeaturedDataAgent {


    private static RetrofitFeaturedDataAgent sObjInstance;
    private FeaturedApi mfeaturedApi;

    public static RetrofitFeaturedDataAgent getsObjInstance() {
        if (sObjInstance == null) {
            sObjInstance = new RetrofitFeaturedDataAgent();
        }
        return sObjInstance;
    }


    private RetrofitFeaturedDataAgent() {

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

        mfeaturedApi = retrofit.create(FeaturedApi.class);//3 create api object


    }


    @Override
    public void loadFeatured() {

        Call<GetFeaturedResponse> getFeaturedResponseCall = mfeaturedApi.loadFeatured(1, "b002c7e1a528b7cb460933fc2875e916");
        //4 call api object
        getFeaturedResponseCall.enqueue(new Callback<GetFeaturedResponse>() {
            @Override
            public void onResponse(Call<GetFeaturedResponse> call, Response<GetFeaturedResponse> response) {
                GetFeaturedResponse getFeaturedResponse = response.body();
                if (getFeaturedResponse != null) {
                    LoadedFeaturedEvent event = new LoadedFeaturedEvent(getFeaturedResponse.getFeatured());
                    EventBus.getDefault().post(event);
                }

            }

            @Override
            public void onFailure(Call<GetFeaturedResponse> call, Throwable t) {

            }
        });


    }
}
