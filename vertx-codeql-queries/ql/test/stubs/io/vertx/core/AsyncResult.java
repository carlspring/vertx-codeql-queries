// Generated automatically from io.vertx.core.AsyncResult for testing purposes

package io.vertx.core;

import java.util.function.Function;

public interface AsyncResult<T>
{
    T result();
    Throwable cause();
    boolean failed();
    boolean succeeded();
    default <U> io.vertx.core.AsyncResult<U> map(java.util.function.Function<T, U> p0){ return null; }
    default <V> io.vertx.core.AsyncResult<V> map(V p0){ return null; }
    default <V> io.vertx.core.AsyncResult<V> mapEmpty(){ return null; }
    default AsyncResult<T> otherwise(T p0){ return null; }
    default AsyncResult<T> otherwise(java.util.function.Function<Throwable, T> p0){ return null; }
    default AsyncResult<T> otherwiseEmpty(){ return null; }
}
