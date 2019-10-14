package com.app.showflix.model.tv

import com.google.gson.annotations.SerializedName


data class PopularTvDetailResponse(

    @SerializedName("backdrop_path") val backdrop_path: String,
    @SerializedName("created_by") val created_by: List<Created_by>,
    @SerializedName("episode_run_time") val episode_run_time: List<Int>,
    @SerializedName("first_air_date") val first_air_date: String,
    @SerializedName("genres") val genres: List<Genres>,
    @SerializedName("homepage") val homepage: String,
    @SerializedName("id") val id: Int,
    @SerializedName("in_production") val in_production: Boolean,
    @SerializedName("languages") val languages: List<String>,
    @SerializedName("last_air_date") val last_air_date: String,
    @SerializedName("last_episode_to_air") val last_episode_to_air: Last_episode_to_air,
    @SerializedName("name") val name: String,
    @SerializedName("next_episode_to_air") val next_episode_to_air: Next_episode_to_air,
    @SerializedName("networks") val networks: List<Networks>,
    @SerializedName("number_of_episodes") val number_of_episodes: Int,
    @SerializedName("number_of_seasons") val number_of_seasons: Int,
    @SerializedName("origin_country") val origin_country: List<String>,
    @SerializedName("original_language") val original_language: String,
    @SerializedName("original_name") val original_name: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("popularity") val popularity: Double,
    @SerializedName("poster_path") val poster_path: String,
    @SerializedName("production_companies") val production_companies: List<Production_companies>,
    @SerializedName("seasons") val seasons: List<Seasons>,
    @SerializedName("status") val status: String,
    @SerializedName("type") val type: String,
    @SerializedName("vote_average") val vote_average: Double,
    @SerializedName("vote_count") val vote_count: Int
)


data class Created_by(

    @SerializedName("id") val id: Int,
    @SerializedName("credit_id") val credit_id: String,
    @SerializedName("name") val name: String,
    @SerializedName("gender") val gender: Int,
    @SerializedName("profile_path") val profile_path: String
)

data class Genres(

    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String
)


data class Last_episode_to_air(

    @SerializedName("air_date") val air_date: String,
    @SerializedName("episode_number") val episode_number: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("production_code") val production_code: String,
    @SerializedName("season_number") val season_number: Int,
    @SerializedName("show_id") val show_id: Int,
    @SerializedName("still_path") val still_path: String,
   /* @SerializedName("vote_average") val vote_average: Int,*/
    @SerializedName("vote_count") val vote_count: Int
)

data class Networks(

    @SerializedName("name") val name: String,
    @SerializedName("id") val id: Int,
    @SerializedName("logo_path") val logo_path: String,
    @SerializedName("origin_country") val origin_country: String
)

data class Next_episode_to_air(

    @SerializedName("air_date") val air_date: String,
    @SerializedName("episode_number") val episode_number: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("production_code") val production_code: String,
    @SerializedName("season_number") val season_number: Int,
    @SerializedName("show_id") val show_id: Int,
    @SerializedName("still_path") val still_path: String,
    @SerializedName("vote_average") val vote_average: Int,
    @SerializedName("vote_count") val vote_count: Int
)

data class Production_companies(

    @SerializedName("id") val id: Int,
    @SerializedName("logo_path") val logo_path: String,
    @SerializedName("name") val name: String,
    @SerializedName("origin_country") val origin_country: String
)

data class Seasons(

    @SerializedName("air_date") val air_date: String,
    @SerializedName("episode_count") val episode_count: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("poster_path") val poster_path: String,
    @SerializedName("season_number") val season_number: Int
)