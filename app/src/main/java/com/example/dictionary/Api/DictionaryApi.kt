package com.example.dictionary.Api

import com.example.dictionary.WordResult
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("en/{word}")
    suspend fun getMeaning(@Path("word") word : String) : Response<List<WordResult>>

}