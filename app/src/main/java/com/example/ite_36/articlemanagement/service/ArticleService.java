package com.example.ite_36.articlemanagement.service;

import com.example.ite_36.articlemanagement.enitity.ArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ITE_36 on 01-Dec-17.
 */

public interface ArticleService {

    @GET("/v1/api/articles")
    Call<ArticleResponse> getArticles();
}
