package com.app.showflix.model.tv;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bJ\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\u0003\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0005\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0005\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020 \u0012\u0006\u0010)\u001a\u00020\b\u00a2\u0006\u0002\u0010*J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0013H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0016H\u00c6\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005H\u00c6\u0003J\t\u0010T\u001a\u00020\bH\u00c6\u0003J\t\u0010U\u001a\u00020\bH\u00c6\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020 H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010]\u001a\b\u0012\u0004\u0012\u00020#0\u0005H\u00c6\u0003J\u000f\u0010^\u001a\b\u0012\u0004\u0012\u00020%0\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\u0003H\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020 H\u00c6\u0003J\t\u0010b\u001a\u00020\bH\u00c6\u0003J\u000f\u0010c\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\bH\u00c6\u0003J\t\u0010h\u001a\u00020\u000fH\u00c6\u0003J\u000f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u00d1\u0002\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00032\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00052\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00052\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020 2\b\b\u0002\u0010)\u001a\u00020\bH\u00c6\u0001J\u0013\u0010k\u001a\u00020\u000f2\b\u0010l\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010m\u001a\u00020\bH\u00d6\u0001J\t\u0010n\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010,R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010.R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00104R\u0016\u0010\u001a\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00104R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010,R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010,R\u0016\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010,R\u0016\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0016\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010,R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010.R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0016\u0010&\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010,R\u0016\u0010\'\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010,R\u0016\u0010(\u001a\u00020 8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010FR\u0016\u0010)\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00104\u00a8\u0006o"}, d2 = {"Lcom/app/showflix/model/tv/PopularTvDetailResponse;", "", "backdrop_path", "", "created_by", "", "Lcom/app/showflix/model/tv/Created_by;", "episode_run_time", "", "first_air_date", "genres", "Lcom/app/showflix/model/tv/Genres;", "homepage", "id", "in_production", "", "languages", "last_air_date", "last_episode_to_air", "Lcom/app/showflix/model/tv/Last_episode_to_air;", "name", "next_episode_to_air", "Lcom/app/showflix/model/tv/Next_episode_to_air;", "networks", "Lcom/app/showflix/model/tv/Networks;", "number_of_episodes", "number_of_seasons", "origin_country", "original_language", "original_name", "overview", "popularity", "", "poster_path", "production_companies", "Lcom/app/showflix/model/tv/Production_companies;", "seasons", "Lcom/app/showflix/model/tv/Seasons;", "status", "type", "vote_average", "vote_count", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;IZLjava/util/List;Ljava/lang/String;Lcom/app/showflix/model/tv/Last_episode_to_air;Ljava/lang/String;Lcom/app/showflix/model/tv/Next_episode_to_air;Ljava/util/List;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;DI)V", "getBackdrop_path", "()Ljava/lang/String;", "getCreated_by", "()Ljava/util/List;", "getEpisode_run_time", "getFirst_air_date", "getGenres", "getHomepage", "getId", "()I", "getIn_production", "()Z", "getLanguages", "getLast_air_date", "getLast_episode_to_air", "()Lcom/app/showflix/model/tv/Last_episode_to_air;", "getName", "getNetworks", "getNext_episode_to_air", "()Lcom/app/showflix/model/tv/Next_episode_to_air;", "getNumber_of_episodes", "getNumber_of_seasons", "getOrigin_country", "getOriginal_language", "getOriginal_name", "getOverview", "getPopularity", "()D", "getPoster_path", "getProduction_companies", "getSeasons", "getStatus", "getType", "getVote_average", "getVote_count", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class PopularTvDetailResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "backdrop_path")
    private final java.lang.String backdrop_path = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "created_by")
    private final java.util.List<com.app.showflix.model.tv.Created_by> created_by = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "episode_run_time")
    private final java.util.List<java.lang.Integer> episode_run_time = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "first_air_date")
    private final java.lang.String first_air_date = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "genres")
    private final java.util.List<com.app.showflix.model.tv.Genres> genres = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "homepage")
    private final java.lang.String homepage = null;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @com.google.gson.annotations.SerializedName(value = "in_production")
    private final boolean in_production = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "languages")
    private final java.util.List<java.lang.String> languages = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "last_air_date")
    private final java.lang.String last_air_date = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "last_episode_to_air")
    private final com.app.showflix.model.tv.Last_episode_to_air last_episode_to_air = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "next_episode_to_air")
    private final com.app.showflix.model.tv.Next_episode_to_air next_episode_to_air = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "networks")
    private final java.util.List<com.app.showflix.model.tv.Networks> networks = null;
    @com.google.gson.annotations.SerializedName(value = "number_of_episodes")
    private final int number_of_episodes = 0;
    @com.google.gson.annotations.SerializedName(value = "number_of_seasons")
    private final int number_of_seasons = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "origin_country")
    private final java.util.List<java.lang.String> origin_country = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "original_language")
    private final java.lang.String original_language = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "original_name")
    private final java.lang.String original_name = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "overview")
    private final java.lang.String overview = null;
    @com.google.gson.annotations.SerializedName(value = "popularity")
    private final double popularity = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    private final java.lang.String poster_path = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "production_companies")
    private final java.util.List<com.app.showflix.model.tv.Production_companies> production_companies = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "seasons")
    private final java.util.List<com.app.showflix.model.tv.Seasons> seasons = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "type")
    private final java.lang.String type = null;
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private final double vote_average = 0.0;
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    private final int vote_count = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBackdrop_path() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.tv.Created_by> getCreated_by() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getEpisode_run_time() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirst_air_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.tv.Genres> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final boolean getIn_production() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getLanguages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLast_air_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.showflix.model.tv.Last_episode_to_air getLast_episode_to_air() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.showflix.model.tv.Next_episode_to_air getNext_episode_to_air() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.tv.Networks> getNetworks() {
        return null;
    }
    
    public final int getNumber_of_episodes() {
        return 0;
    }
    
    public final int getNumber_of_seasons() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getOrigin_country() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_language() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final double getPopularity() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoster_path() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.tv.Production_companies> getProduction_companies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.tv.Seasons> getSeasons() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final double getVote_average() {
        return 0.0;
    }
    
    public final int getVote_count() {
        return 0;
    }
    
    public PopularTvDetailResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String backdrop_path, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.tv.Created_by> created_by, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> episode_run_time, @org.jetbrains.annotations.NotNull()
    java.lang.String first_air_date, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.tv.Genres> genres, @org.jetbrains.annotations.NotNull()
    java.lang.String homepage, int id, boolean in_production, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> languages, @org.jetbrains.annotations.NotNull()
    java.lang.String last_air_date, @org.jetbrains.annotations.NotNull()
    com.app.showflix.model.tv.Last_episode_to_air last_episode_to_air, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.app.showflix.model.tv.Next_episode_to_air next_episode_to_air, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.tv.Networks> networks, int number_of_episodes, int number_of_seasons, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> origin_country, @org.jetbrains.annotations.NotNull()
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    java.lang.String original_name, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, double popularity, @org.jetbrains.annotations.NotNull()
    java.lang.String poster_path, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.tv.Production_companies> production_companies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.tv.Seasons> seasons, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String type, double vote_average, int vote_count) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.tv.Created_by> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.tv.Genres> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.showflix.model.tv.Last_episode_to_air component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.showflix.model.tv.Next_episode_to_air component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.tv.Networks> component14() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    public final double component21() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.tv.Production_companies> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.tv.Seasons> component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    public final double component27() {
        return 0.0;
    }
    
    public final int component28() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.showflix.model.tv.PopularTvDetailResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String backdrop_path, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.tv.Created_by> created_by, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> episode_run_time, @org.jetbrains.annotations.NotNull()
    java.lang.String first_air_date, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.tv.Genres> genres, @org.jetbrains.annotations.NotNull()
    java.lang.String homepage, int id, boolean in_production, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> languages, @org.jetbrains.annotations.NotNull()
    java.lang.String last_air_date, @org.jetbrains.annotations.NotNull()
    com.app.showflix.model.tv.Last_episode_to_air last_episode_to_air, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.app.showflix.model.tv.Next_episode_to_air next_episode_to_air, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.tv.Networks> networks, int number_of_episodes, int number_of_seasons, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> origin_country, @org.jetbrains.annotations.NotNull()
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    java.lang.String original_name, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, double popularity, @org.jetbrains.annotations.NotNull()
    java.lang.String poster_path, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.tv.Production_companies> production_companies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.tv.Seasons> seasons, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String type, double vote_average, int vote_count) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}