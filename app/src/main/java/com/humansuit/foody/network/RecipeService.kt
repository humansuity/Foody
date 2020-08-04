package com.humansuit.foody.network

import com.humansuit.foody.model.PopularRecipesResponse
import com.humansuit.foody.model.RecipesWrapper
import com.humansuit.foody.utils.Constants.API_KEY
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipeService {

    @GET("complexSearch?apiKey=$API_KEY")
    suspend fun getRecipesByType(
        @Query("type") type: String,
        @Query("offset") page: Int,
        @Query("number") number: Int
    ) : ApiResponse<RecipesWrapper>


    @GET("random?apiKey=$API_KEY")
    suspend fun getPopularRecipes(
        @Query("number") number: Int,
        @Query("offset") page: Int
    ) : ApiResponse<PopularRecipesResponse>


}