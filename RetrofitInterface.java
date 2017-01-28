package com.lukasz.retrofittttt;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Lukasz on 2017-01-28.
 */

public interface RetrofitInterface {

    @GET("products/getBestProductOfWeek") // deklarujemy endpoint oraz metodę
    Call<Model> getData();


}
