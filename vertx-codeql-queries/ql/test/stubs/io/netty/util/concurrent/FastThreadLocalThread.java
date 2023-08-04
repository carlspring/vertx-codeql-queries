// Generated automatically from io.netty.util.concurrent.FastThreadLocalThread for testing purposes

package io.netty.util.concurrent;

import io.netty.util.internal.InternalThreadLocalMap;

public class FastThreadLocalThread extends Thread
{
    public FastThreadLocalThread(){}
    public FastThreadLocalThread(Runnable p0){}
    public FastThreadLocalThread(Runnable p0, String p1){}
    public FastThreadLocalThread(String p0){}
    public FastThreadLocalThread(ThreadGroup p0, Runnable p1){}
    public FastThreadLocalThread(ThreadGroup p0, Runnable p1, String p2){}
    public FastThreadLocalThread(ThreadGroup p0, Runnable p1, String p2, long p3){}
    public FastThreadLocalThread(ThreadGroup p0, String p1){}
    public boolean permitBlockingCalls(){ return false; }
    public boolean willCleanupFastThreadLocals(){ return false; }
    public final InternalThreadLocalMap threadLocalMap(){ return null; }
    public final void setThreadLocalMap(InternalThreadLocalMap p0){}
    public static boolean willCleanupFastThreadLocals(Thread p0){ return false; }
}
