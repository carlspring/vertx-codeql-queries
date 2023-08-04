// Generated automatically from io.vertx.core.spi.VertxTracerFactory for testing purposes

package io.vertx.core.spi;

import io.vertx.core.impl.VertxBuilder;
import io.vertx.core.json.JsonObject;
import io.vertx.core.spi.VertxServiceProvider;
import io.vertx.core.spi.tracing.VertxTracer;
import io.vertx.core.tracing.TracingOptions;

public interface VertxTracerFactory extends VertxServiceProvider
{
    VertxTracer tracer(TracingOptions p0);
    default TracingOptions newOptions(){ return null; }
    default TracingOptions newOptions(JsonObject p0){ return null; }
    default void init(VertxBuilder p0){}
    static VertxTracerFactory NOOP = null;
}
