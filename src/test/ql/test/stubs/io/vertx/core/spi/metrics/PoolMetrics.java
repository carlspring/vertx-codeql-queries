// Generated automatically from io.vertx.core.spi.metrics.PoolMetrics for testing purposes

package io.vertx.core.spi.metrics;

import io.vertx.core.spi.metrics.Metrics;

public interface PoolMetrics<T> extends Metrics
{
    default T begin(T p0){ return null; }
    default T submitted(){ return null; }
    default void end(T p0, boolean p1){}
    default void rejected(T p0){}
}
