package com.app.showflix.utils.connectivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\r"}, d2 = {"Lcom/app/showflix/utils/connectivity/ConnectivityReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "isConnectedOrConnecting", "", "context", "Landroid/content/Context;", "onReceive", "", "intent", "Landroid/content/Intent;", "Companion", "ConnectivityReceiverListener", "app_debug"})
public final class ConnectivityReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.Nullable()
    private static com.app.showflix.utils.connectivity.ConnectivityReceiver.ConnectivityReceiverListener connectivityReceiverListener;
    public static final com.app.showflix.utils.connectivity.ConnectivityReceiver.Companion Companion = null;
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final boolean isConnectedOrConnecting(android.content.Context context) {
        return false;
    }
    
    public ConnectivityReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/app/showflix/utils/connectivity/ConnectivityReceiver$ConnectivityReceiverListener;", "", "onNetworkConnectionChanged", "", "isConnected", "", "app_debug"})
    public static abstract interface ConnectivityReceiverListener {
        
        public abstract void onNetworkConnectionChanged(boolean isConnected);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/app/showflix/utils/connectivity/ConnectivityReceiver$Companion;", "", "()V", "connectivityReceiverListener", "Lcom/app/showflix/utils/connectivity/ConnectivityReceiver$ConnectivityReceiverListener;", "getConnectivityReceiverListener", "()Lcom/app/showflix/utils/connectivity/ConnectivityReceiver$ConnectivityReceiverListener;", "setConnectivityReceiverListener", "(Lcom/app/showflix/utils/connectivity/ConnectivityReceiver$ConnectivityReceiverListener;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.showflix.utils.connectivity.ConnectivityReceiver.ConnectivityReceiverListener getConnectivityReceiverListener() {
            return null;
        }
        
        public final void setConnectivityReceiverListener(@org.jetbrains.annotations.Nullable()
        com.app.showflix.utils.connectivity.ConnectivityReceiver.ConnectivityReceiverListener p0) {
        }
        
        private Companion() {
            super();
        }
    }
}