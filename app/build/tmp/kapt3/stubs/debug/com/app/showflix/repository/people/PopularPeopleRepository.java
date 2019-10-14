package com.app.showflix.repository.people;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\fJ\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0016"}, d2 = {"Lcom/app/showflix/repository/people/PopularPeopleRepository;", "Lcom/app/showflix/repository/BaseRepository;", "()V", "POST_PER_PAGE", "", "popularPeopleListDataSourceFactory", "Lcom/app/showflix/repository/people/PopularPeopleListDataSourceFactory;", "getPopularPeopleListDataSourceFactory", "()Lcom/app/showflix/repository/people/PopularPeopleListDataSourceFactory;", "setPopularPeopleListDataSourceFactory", "(Lcom/app/showflix/repository/people/PopularPeopleListDataSourceFactory;)V", "popularPeoplePagedList", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/app/showflix/model/people/Results;", "getPopularPeoplePagedList", "()Landroidx/lifecycle/LiveData;", "setPopularPeoplePagedList", "(Landroidx/lifecycle/LiveData;)V", "getNetworkState", "Lcom/app/showflix/utils/NetworkState;", "getPopularPeople", "app_debug"})
public final class PopularPeopleRepository extends com.app.showflix.repository.BaseRepository {
    @org.jetbrains.annotations.NotNull()
    public static androidx.lifecycle.LiveData<androidx.paging.PagedList<com.app.showflix.model.people.Results>> popularPeoplePagedList;
    @org.jetbrains.annotations.NotNull()
    public static com.app.showflix.repository.people.PopularPeopleListDataSourceFactory popularPeopleListDataSourceFactory;
    public static final int POST_PER_PAGE = 10;
    public static final com.app.showflix.repository.people.PopularPeopleRepository INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.app.showflix.model.people.Results>> getPopularPeoplePagedList() {
        return null;
    }
    
    public final void setPopularPeoplePagedList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<androidx.paging.PagedList<com.app.showflix.model.people.Results>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.showflix.repository.people.PopularPeopleListDataSourceFactory getPopularPeopleListDataSourceFactory() {
        return null;
    }
    
    public final void setPopularPeopleListDataSourceFactory(@org.jetbrains.annotations.NotNull()
    com.app.showflix.repository.people.PopularPeopleListDataSourceFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.app.showflix.model.people.Results>> getPopularPeople() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.app.showflix.utils.NetworkState> getNetworkState() {
        return null;
    }
    
    private PopularPeopleRepository() {
        super();
    }
}