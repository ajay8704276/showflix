package com.app.showflix.repository.people;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000bH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/app/showflix/repository/people/PopularPeopleListDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lcom/app/showflix/model/people/Results;", "()V", "popularPeopleLiveDataSource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/app/showflix/repository/people/PopularPeopleListDataScource;", "getPopularPeopleLiveDataSource", "()Landroidx/lifecycle/MutableLiveData;", "create", "Landroidx/paging/DataSource;", "app_debug"})
public final class PopularPeopleListDataSourceFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, com.app.showflix.model.people.Results> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.app.showflix.repository.people.PopularPeopleListDataScource> popularPeopleLiveDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.app.showflix.repository.people.PopularPeopleListDataScource> getPopularPeopleLiveDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.Integer, com.app.showflix.model.people.Results> create() {
        return null;
    }
    
    public PopularPeopleListDataSourceFactory() {
        super();
    }
}