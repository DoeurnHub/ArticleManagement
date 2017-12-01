 package com.example.ite_36.articlemanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.ite_36.articlemanagement.enitity.ArticleResponse;
import com.example.ite_36.articlemanagement.service.ArticleService;
import com.example.ite_36.articlemanagement.service.ServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArticleService articleService = ServiceGenerator.createService(ArticleService.class);
        Call<ArticleResponse> call = articleService.getArticles();
        call.enqueue(new Callback<ArticleResponse>() {
            @Override
            public void onResponse(Call<ArticleResponse> call, Response<ArticleResponse> response) {
                ArticleResponse articleResponse = response.body();
                Log.e("success" , articleResponse.toString());
            }

            @Override
            public void onFailure(Call<ArticleResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
