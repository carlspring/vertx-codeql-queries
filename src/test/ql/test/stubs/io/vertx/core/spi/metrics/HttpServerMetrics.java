// Generated automatically from io.vertx.core.spi.metrics.HttpServerMetrics for testing purposes

package io.vertx.core.spi.metrics;

import io.vertx.core.http.ServerWebSocket;
import io.vertx.core.spi.metrics.TCPMetrics;
import io.vertx.core.spi.observability.HttpRequest;
import io.vertx.core.spi.observability.HttpResponse;

public interface HttpServerMetrics<R, W, S> extends io.vertx.core.spi.metrics.TCPMetrics<S>
{
    default R requestBegin(S p0, HttpRequest p1){ return null; }
    default R responsePushed(S p0, io.vertx.core.http.HttpMethod p1, String p2, HttpResponse p3){ return null; }
    default W connected(S p0, R p1, ServerWebSocket p2){ return null; }
    default void disconnected(W p0){}
    default void requestEnd(R p0, HttpRequest p1, long p2){}
    default void requestReset(R p0){}
    default void requestRouted(R p0, String p1){}
    default void responseBegin(R p0, HttpResponse p1){}
    default void responseEnd(R p0, HttpResponse p1, long p2){}
}
