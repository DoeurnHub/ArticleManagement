package com.example.ite_36.articlemanagement.service;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ITE_36 on 01-Dec-17.
 */

public class ServiceGenerator {
    private static final String BASE_URL="http://api-ams.me/";
    private static OkHttpClient.Builder client=new OkHttpClient.Builder();

    private static Retrofit.Builder builder=new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> service){

        Retrofit retrofit= builder
                .client(client.build())
                .build();

        return retrofit.create(service);
    }
}
