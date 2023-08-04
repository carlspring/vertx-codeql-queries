// Generated automatically from io.vertx.core.spi.tracing.VertxTracer for testing purposes

package io.vertx.core.spi.tracing;

import io.vertx.core.Context;
import io.vertx.core.spi.tracing.SpanKind;
import io.vertx.core.spi.tracing.TagExtractor;
import io.vertx.core.tracing.TracingPolicy;
import java.util.Map;
import java.util.function.BiConsumer;

public interface VertxTracer<I, O>
{
    default <R> I receiveRequest(Context p0, SpanKind p1, TracingPolicy p2, R p3, String p4, Iterable<Map.Entry<String, String>> p5, io.vertx.core.spi.tracing.TagExtractor<R> p6){ return null; }
    default <R> O sendRequest(Context p0, SpanKind p1, TracingPolicy p2, R p3, String p4, BiConsumer<String, String> p5, io.vertx.core.spi.tracing.TagExtractor<R> p6){ return null; }
    default <R> void receiveResponse(Context p0, R p1, O p2, Throwable p3, io.vertx.core.spi.tracing.TagExtractor<R> p4){}
    default <R> void sendResponse(Context p0, R p1, I p2, Throwable p3, io.vertx.core.spi.tracing.TagExtractor<R> p4){}
    default void close(){}
    static VertxTracer NOOP = null;
}
