package com.lukasz.retrofittttt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    Retrofit retrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        retrofit = new Retrofit.Builder()
                .baseUrl("http://194.32.40.194/android_api/")
                .build();

        RetrofitInterface retrofitInterface = retrofit.create(RetrofitInterface.class);

        Call<Model> model = retrofitInterface.getData(new Callback<Model>() {

            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                Log.d("odpowiedz", "url"+response.body().getUrl());
                Log.d("odpowiedz", "id"+response.body().getId());
            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {

            }

        });



    }


}
