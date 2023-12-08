// Generated automatically from io.vertx.core.spi.VertxMetricsFactory for testing purposes

package io.vertx.core.spi;

import io.vertx.core.VertxOptions;
import io.vertx.core.impl.VertxBuilder;
import io.vertx.core.json.JsonObject;
import io.vertx.core.metrics.MetricsOptions;
import io.vertx.core.spi.VertxServiceProvider;
import io.vertx.core.spi.metrics.VertxMetrics;

public interface VertxMetricsFactory extends VertxServiceProvider
{
    VertxMetrics metrics(VertxOptions p0);
    default MetricsOptions newOptions(){ return null; }
    default MetricsOptions newOptions(JsonObject p0){ return null; }
    default MetricsOptions newOptions(MetricsOptions p0){ return null; }
    default void init(VertxBuilder p0){}
}
