// Generated automatically from io.vertx.core.spi.metrics.VertxMetrics for testing purposes

package io.vertx.core.spi.metrics;

import io.vertx.core.Vertx;
import io.vertx.core.datagram.DatagramSocketOptions;
import io.vertx.core.http.HttpClientOptions;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.NetClientOptions;
import io.vertx.core.net.NetServerOptions;
import io.vertx.core.spi.metrics.ClientMetrics;
import io.vertx.core.spi.metrics.DatagramSocketMetrics;
import io.vertx.core.spi.metrics.EventBusMetrics;
import io.vertx.core.spi.metrics.HttpClientMetrics;
import io.vertx.core.spi.metrics.HttpServerMetrics;
import io.vertx.core.spi.metrics.Metrics;
import io.vertx.core.spi.metrics.PoolMetrics;
import io.vertx.core.spi.metrics.TCPMetrics;

public interface VertxMetrics extends Measured, Metrics
{
    default ClientMetrics<? extends Object, ? extends Object, ? extends Object, ? extends Object> createClientMetrics(io.vertx.core.net.SocketAddress p0, String p1, String p2){ return null; }
    default DatagramSocketMetrics createDatagramSocketMetrics(DatagramSocketOptions p0){ return null; }
    default EventBusMetrics createEventBusMetrics(){ return null; }
    default HttpClientMetrics<? extends Object, ? extends Object, ? extends Object, ? extends Object> createHttpClientMetrics(HttpClientOptions p0){ return null; }
    default HttpServerMetrics<? extends Object, ? extends Object, ? extends Object> createHttpServerMetrics(HttpServerOptions p0, io.vertx.core.net.SocketAddress p1){ return null; }
    default PoolMetrics<? extends Object> createPoolMetrics(String p0, String p1, int p2){ return null; }
    default TCPMetrics<? extends Object> createNetClientMetrics(NetClientOptions p0){ return null; }
    default TCPMetrics<? extends Object> createNetServerMetrics(NetServerOptions p0, io.vertx.core.net.SocketAddress p1){ return null; }
    default void vertxCreated(Vertx p0){}
}
