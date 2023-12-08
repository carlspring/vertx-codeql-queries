// Generated automatically from io.vertx.core.spi.metrics.ClientMetrics for testing purposes

package io.vertx.core.spi.metrics;

import io.vertx.core.spi.metrics.Metrics;

public interface ClientMetrics<M, T, Req, Resp> extends Metrics
{
    default M requestBegin(String p0, Req p1){ return null; }
    default T enqueueRequest(){ return null; }
    default void dequeueRequest(T p0){}
    default void requestEnd(M p0){}
    default void requestEnd(M p0, long p1){}
    default void requestReset(M p0){}
    default void responseBegin(M p0, Resp p1){}
    default void responseEnd(M p0){}
    default void responseEnd(M p0, long p1){}
}
