package com.padcmyanmar.burpple.network;

import com.padcmyanmar.burpple.network.responses.GetFeaturedResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by ICE on 13-01-2018.
 */

public interface FeaturedApi {

    @FormUrlEncoded
    @POST("getFeatured.php")//used to call api
    Call<GetFeaturedResponse> loadFeatured(@Field("page") int page,
                                             @Field("access_token") String accessToken);

}
