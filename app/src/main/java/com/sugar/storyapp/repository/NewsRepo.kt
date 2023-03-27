package com.sugar.storyapp.repository

import com.sugar.storyapp.network.api.NewsApi
import com.sugar.storyapp.network.modal.NewsModalItem
import retrofit2.Response
import javax.inject.Inject

class NewsRepo @Inject constructor(private var newsApi: NewsApi) {

    suspend fun getAllNews(): Response<List<NewsModalItem>> {
        return newsApi.getAllNews()
    }

}
