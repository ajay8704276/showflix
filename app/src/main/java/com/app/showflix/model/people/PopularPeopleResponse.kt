package com.app.showflix.model.people

import com.google.gson.annotations.SerializedName

data class PopularPeopleResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("total_results") val total_results: Int,
    @SerializedName("total_pages") val total_pages: Int,
    @SerializedName("results") val results: List<Results>
)

data class Results(
    @SerializedName("popularity") val popularity: Double,
    @SerializedName("known_for_department") val known_for_department: String,
    @SerializedName("gender") val gender: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("profile_path") val profile_path: String,
    @SerializedName("adult") val adult: Boolean,
    @SerializedName("known_for") val known_for: List<Known_for>,
    @SerializedName("name") val name: String
)


data class Known_for(
    @SerializedName("poster_path") val poster_path: String,
    @SerializedName("id") val id: Int,
    @SerializedName("vote_count") val vote_count: Int,
    @SerializedName("video") val video: Boolean,
    @SerializedName("media_type") val media_type: String,
    @SerializedName("adult") val adult: Boolean,
    @SerializedName("backdrop_path") val backdrop_path: String,
    @SerializedName("genre_ids") val genre_ids: List<Int>,
    @SerializedName("original_title") val original_title: String,
    @SerializedName("original_language") val original_language: String,
    @SerializedName("title") val title: String,
    @SerializedName("vote_average") val vote_average: Double,
    @SerializedName("overview") val overview: String,
    @SerializedName("release_date") val release_date: String
)