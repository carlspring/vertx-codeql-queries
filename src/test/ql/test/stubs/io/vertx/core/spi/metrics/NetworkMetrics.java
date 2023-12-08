// Generated automatically from io.vertx.core.spi.metrics.NetworkMetrics for testing purposes

package io.vertx.core.spi.metrics;

import io.vertx.core.spi.metrics.Metrics;

public interface NetworkMetrics<S> extends Metrics
{
    default void bytesRead(S p0, io.vertx.core.net.SocketAddress p1, long p2){}
    default void bytesWritten(S p0, io.vertx.core.net.SocketAddress p1, long p2){}
    default void exceptionOccurred(S p0, io.vertx.core.net.SocketAddress p1, Throwable p2){}
}
