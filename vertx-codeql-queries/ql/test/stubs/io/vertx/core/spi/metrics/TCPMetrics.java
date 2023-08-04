// Generated automatically from io.vertx.core.spi.metrics.TCPMetrics for testing purposes

package io.vertx.core.spi.metrics;

import io.vertx.core.spi.metrics.NetworkMetrics;

public interface TCPMetrics<S> extends io.vertx.core.spi.metrics.NetworkMetrics<S>
{
    default S connected(io.vertx.core.net.SocketAddress p0, String p1){ return null; }
    default void disconnected(S p0, io.vertx.core.net.SocketAddress p1){}
}
