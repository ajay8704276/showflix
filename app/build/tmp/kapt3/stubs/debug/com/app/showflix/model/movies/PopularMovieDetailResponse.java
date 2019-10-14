package com.app.showflix.model.movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bB\b\u0086\b\u0018\u00002\u00020\u0001B\u00dd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\t\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\t\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0012\u0012\u0006\u0010\"\u001a\u00020\u0007\u00a2\u0006\u0002\u0010#J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0012H\u00c6\u0003J\t\u0010D\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00150\tH\u00c6\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u00c6\u0003J\t\u0010G\u001a\u00020\u0005H\u00c6\u0003J\t\u0010H\u001a\u00020\u0007H\u00c6\u0003J\t\u0010I\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001c0\tH\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0012H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0007H\u00c6\u0003J\t\u0010R\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010T\u001a\u00020\u0005H\u00c6\u0003J\t\u0010U\u001a\u00020\u0007H\u00c6\u0003J\t\u0010V\u001a\u00020\u0005H\u00c6\u0003J\t\u0010W\u001a\u00020\u0005H\u00c6\u0003J\t\u0010X\u001a\u00020\u0005H\u00c6\u0003J\u0091\u0002\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\t2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010Z\u001a\u00020\u00032\b\u0010[\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\\\u001a\u00020\u0007H\u00d6\u0001J\t\u0010]\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\'R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\'R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\'R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\'R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\'R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\'R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0016\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\'R\u0016\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0016\u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u0016\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\'R\u0016\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\'R\u0016\u0010\u001f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\'R\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0016\u0010!\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00103R\u0016\u0010\"\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010)\u00a8\u0006^"}, d2 = {"Lcom/app/showflix/model/movies/PopularMovieDetailResponse;", "", "adult", "", "backdrop_path", "", "budget", "", "genres", "", "Lcom/app/showflix/model/movies/Genres;", "homepage", "id", "imdb_id", "original_language", "original_title", "overview", "popularity", "", "poster_path", "production_companies", "Lcom/app/showflix/model/movies/Production_companies;", "production_countries", "Lcom/app/showflix/model/movies/Production_countries;", "release_date", "revenue", "runtime", "spoken_languages", "Lcom/app/showflix/model/movies/Spoken_languages;", "status", "tagline", "title", "video", "vote_average", "vote_count", "(ZLjava/lang/String;ILjava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZDI)V", "getAdult", "()Z", "getBackdrop_path", "()Ljava/lang/String;", "getBudget", "()I", "getGenres", "()Ljava/util/List;", "getHomepage", "getId", "getImdb_id", "getOriginal_language", "getOriginal_title", "getOverview", "getPopularity", "()D", "getPoster_path", "getProduction_companies", "getProduction_countries", "getRelease_date", "getRevenue", "getRuntime", "getSpoken_languages", "getStatus", "getTagline", "getTitle", "getVideo", "getVote_average", "getVote_count", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class PopularMovieDetailResponse {
    @com.google.gson.annotations.SerializedName(value = "adult")
    private final boolean adult = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "backdrop_path")
    private final java.lang.String backdrop_path = null;
    @com.google.gson.annotations.SerializedName(value = "budget")
    private final int budget = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "genres")
    private final java.util.List<com.app.showflix.model.movies.Genres> genres = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "homepage")
    private final java.lang.String homepage = null;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "imdb_id")
    private final java.lang.String imdb_id = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "original_language")
    private final java.lang.String original_language = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "original_title")
    private final java.lang.String original_title = null;
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
    private final java.util.List<com.app.showflix.model.movies.Production_companies> production_companies = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "production_countries")
    private final java.util.List<com.app.showflix.model.movies.Production_countries> production_countries = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "release_date")
    private final java.lang.String release_date = null;
    @com.google.gson.annotations.SerializedName(value = "revenue")
    private final int revenue = 0;
    @com.google.gson.annotations.SerializedName(value = "runtime")
    private final int runtime = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "spoken_languages")
    private final java.util.List<com.app.showflix.model.movies.Spoken_languages> spoken_languages = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "tagline")
    private final java.lang.String tagline = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "title")
    private final java.lang.String title = null;
    @com.google.gson.annotations.SerializedName(value = "video")
    private final boolean video = false;
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private final double vote_average = 0.0;
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    private final int vote_count = 0;
    
    public final boolean getAdult() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBackdrop_path() {
        return null;
    }
    
    public final int getBudget() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.movies.Genres> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImdb_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_language() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_title() {
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
    public final java.util.List<com.app.showflix.model.movies.Production_companies> getProduction_companies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.movies.Production_countries> getProduction_countries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRelease_date() {
        return null;
    }
    
    public final int getRevenue() {
        return 0;
    }
    
    public final int getRuntime() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.movies.Spoken_languages> getSpoken_languages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTagline() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final boolean getVideo() {
        return false;
    }
    
    public final double getVote_average() {
        return 0.0;
    }
    
    public final int getVote_count() {
        return 0;
    }
    
    public PopularMovieDetailResponse(boolean adult, @org.jetbrains.annotations.NotNull()
    java.lang.String backdrop_path, int budget, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.movies.Genres> genres, @org.jetbrains.annotations.NotNull()
    java.lang.String homepage, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String imdb_id, @org.jetbrains.annotations.NotNull()
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    java.lang.String original_title, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, double popularity, @org.jetbrains.annotations.NotNull()
    java.lang.String poster_path, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.movies.Production_companies> production_companies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.movies.Production_countries> production_countries, @org.jetbrains.annotations.NotNull()
    java.lang.String release_date, int revenue, int runtime, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.movies.Spoken_languages> spoken_languages, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String tagline, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean video, double vote_average, int vote_count) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.movies.Genres> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.movies.Production_companies> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.movies.Production_countries> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int component17() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.showflix.model.movies.Spoken_languages> component18() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    public final boolean component22() {
        return false;
    }
    
    public final double component23() {
        return 0.0;
    }
    
    public final int component24() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.showflix.model.movies.PopularMovieDetailResponse copy(boolean adult, @org.jetbrains.annotations.NotNull()
    java.lang.String backdrop_path, int budget, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.movies.Genres> genres, @org.jetbrains.annotations.NotNull()
    java.lang.String homepage, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String imdb_id, @org.jetbrains.annotations.NotNull()
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    java.lang.String original_title, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, double popularity, @org.jetbrains.annotations.NotNull()
    java.lang.String poster_path, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.movies.Production_companies> production_companies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.movies.Production_countries> production_countries, @org.jetbrains.annotations.NotNull()
    java.lang.String release_date, int revenue, int runtime, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.showflix.model.movies.Spoken_languages> spoken_languages, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String tagline, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean video, double vote_average, int vote_count) {
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