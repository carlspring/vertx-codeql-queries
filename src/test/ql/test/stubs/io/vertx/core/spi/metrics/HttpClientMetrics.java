// Generated automatically from io.vertx.core.spi.metrics.HttpClientMetrics for testing purposes

package io.vertx.core.spi.metrics;

import io.vertx.core.http.WebSocket;
import io.vertx.core.spi.metrics.ClientMetrics;
import io.vertx.core.spi.metrics.TCPMetrics;
import io.vertx.core.spi.observability.HttpRequest;
import io.vertx.core.spi.observability.HttpResponse;

public interface HttpClientMetrics<R, W, S, T> extends io.vertx.core.spi.metrics.TCPMetrics<S>
{
    default ClientMetrics<R, T, HttpRequest, HttpResponse> createEndpointMetrics(io.vertx.core.net.SocketAddress p0, int p1){ return null; }
    default W connected(WebSocket p0){ return null; }
    default void disconnected(W p0){}
    default void endpointConnected(ClientMetrics<R, T, ? extends Object, ? extends Object> p0){}
    default void endpointDisconnected(ClientMetrics<R, T, ? extends Object, ? extends Object> p0){}
}
