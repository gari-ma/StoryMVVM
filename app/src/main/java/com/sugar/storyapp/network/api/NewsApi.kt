package com.sugar.storyapp.network.api

import com.sugar.storyapp.network.modal.NewsModalItem
import retrofit2.Response
import retrofit2.http.GET

interface NewsApi {
    @GET("posts")
    suspend fun getAllNews(): Response<List<NewsModalItem>>
}