package com.padcmyanmar.burpple.network;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.padcmyanmar.burpple.BurppleFoodApp;
import com.padcmyanmar.burpple.events.LoadedFeaturedEvent;
import com.padcmyanmar.burpple.events.LoadedGuidesEvent;
import com.padcmyanmar.burpple.network.responses.GetFeaturedResponse;
import com.padcmyanmar.burpple.network.responses.GetGuidesResponse;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by ICE on 12-01-2018.
 */

public class OkHttpGuidesDataAgent implements  GuidesDataAgent{


    private static OkHttpGuidesDataAgent objectInstance;

    public OkHttpGuidesDataAgent() {
    }

    public static OkHttpGuidesDataAgent getObjectInstance() {
        if(objectInstance==null)
        {
            objectInstance= new OkHttpGuidesDataAgent();
        }

        return objectInstance;
    }


    @Override
    public void loadGuides() {

        new LoadGuidesTask().execute("http://padcmyanmar.com/padc-3/burpple-food-places/apis/v1/getGuides.php");

    }

    private static class LoadGuidesTask extends AsyncTask<String, Void, String> {

        @Override
        //        return                first parameter(String...= string array)
        protected String doInBackground(String... urls) {

            String url = urls[0];//for pass url into array
            OkHttpClient httpClient = new OkHttpClient.Builder() //1.
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .writeTimeout(15, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .build();

            RequestBody formBody = new FormBody.Builder() //2.
                    .add("access_token", "b002c7e1a528b7cb460933fc2875e916")
                    .add("page", "1")
                    .build();

            Request request = new Request.Builder() //3
                    .url(url)
                    .post(formBody)
                    .build();

            try {
                Response response = httpClient.newCall(request).execute(); //4.
                if (response.isSuccessful() && response.body() != null) {
                    String responseString = response.body().string();
                    return responseString;
                }
            } catch (IOException e) {
                Log.e(BurppleFoodApp.Log_Tag, e.getMessage());
            }

            return null;

        }

        @Override
        protected void onPostExecute(String response) {
            super.onPostExecute(response);
            Gson gson = new Gson();
            GetGuidesResponse getGuidesResponse = gson.fromJson(response, GetGuidesResponse.class);
            LoadedGuidesEvent event = new LoadedGuidesEvent(getGuidesResponse.getGuides());
            EventBus eventBus = EventBus.getDefault();
            eventBus.post(event);

        }
    }



}
