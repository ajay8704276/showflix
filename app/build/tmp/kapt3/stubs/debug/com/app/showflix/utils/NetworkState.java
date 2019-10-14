package com.app.showflix.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/app/showflix/utils/NetworkState;", "", "status", "Lcom/app/showflix/utils/Status;", "msg", "", "(Lcom/app/showflix/utils/Status;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "getStatus", "()Lcom/app/showflix/utils/Status;", "Companion", "app_debug"})
public final class NetworkState {
    @org.jetbrains.annotations.NotNull()
    private final com.app.showflix.utils.Status status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String msg = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.app.showflix.utils.NetworkState LOADED = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.app.showflix.utils.NetworkState LOADING = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.app.showflix.utils.NetworkState ERROR = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.app.showflix.utils.NetworkState ENDOFLIST = null;
    public static final com.app.showflix.utils.NetworkState.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.showflix.utils.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMsg() {
        return null;
    }
    
    public NetworkState(@org.jetbrains.annotations.NotNull()
    com.app.showflix.utils.Status status, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/app/showflix/utils/NetworkState$Companion;", "", "()V", "ENDOFLIST", "Lcom/app/showflix/utils/NetworkState;", "getENDOFLIST", "()Lcom/app/showflix/utils/NetworkState;", "ERROR", "getERROR", "LOADED", "getLOADED", "LOADING", "getLOADING", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.showflix.utils.NetworkState getLOADED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.showflix.utils.NetworkState getLOADING() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.showflix.utils.NetworkState getERROR() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.showflix.utils.NetworkState getENDOFLIST() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}