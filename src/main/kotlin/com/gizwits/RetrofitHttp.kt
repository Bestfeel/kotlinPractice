package com.gizwits

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * Created by feel on 2016/12/14.
 * https://api.github.com/repos/Bestfeel/spring-cloud-project/stargazers
 */
interface IContent {

    @GET("/repos/Bestfeel/spring-cloud-project/stargazers")
    fun getFiles(): Call<List<FileDonwload>>
}

data class FileDonwload(val login: String, val id: Int, val url: String)


object Service {
    val getContent: IContent by lazy {
        Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com")
                .build().create(IContent::class.java)
    }
}

fun main(args: Array<String>) {

    val body = Service.getContent.getFiles().execute().body()

    print(body)

    body.map(::println)


}