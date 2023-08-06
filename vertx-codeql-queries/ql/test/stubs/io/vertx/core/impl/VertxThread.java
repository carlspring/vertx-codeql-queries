// Generated automatically from io.vertx.core.impl.VertxThread for testing purposes

package io.vertx.core.impl;

import io.netty.util.concurrent.FastThreadLocalThread;
import java.util.concurrent.TimeUnit;

public class VertxThread extends FastThreadLocalThread
{
    protected VertxThread() {}
    public TimeUnit maxExecTimeUnit(){ return null; }
    public VertxThread(Runnable p0, String p1, boolean p2, long p3, TimeUnit p4){}
    public boolean isWorker(){ return false; }
    public long maxExecTime(){ return 0; }
    public long startTime(){ return 0; }
}
