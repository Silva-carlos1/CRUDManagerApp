package com.example.crudmanagerapp

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path

interface WebService {

    @POST("products")
    suspend fun createProduct(@Body product: Product): Response<Product>

    @GET("products")
    suspend fun getProducts(): Response<ProductsResponse>

    @GET("products/{id}")
    suspend fun getProduct(@Path("id") id: Int): Response<ProductsResponse>

    @PATCH("products/{id}")
    suspend fun updateProduct(@Path("id") id: Int, @Body product: Product): Response<ProductsResponse>

    @DELETE("products/{id}")
    suspend fun deleteProduct(@Path("id") id: Int): Response<Void>
}
