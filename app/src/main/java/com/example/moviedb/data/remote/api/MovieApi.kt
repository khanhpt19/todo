package com.example.moviedb.data.remote.api

import com.example.moviedb.data.model.Movie
import com.example.moviedb.data.remote.response.MovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface MovieApi {
    @GET("movie/popular")
    fun getMoviesPopular(@QueryMap hashMap: HashMap<String, String> = HashMap()): Single<MovieResponse>

    @GET("movie/{id}")
    fun getMovieDetail(@QueryMap hashMap: HashMap<String, String> = HashMap()): Single<Movie>

}
