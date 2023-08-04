// Generated automatically from io.vertx.core.Promise for testing purposes

package io.vertx.core;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;

public interface Promise<T> extends io.vertx.core.Handler<io.vertx.core.AsyncResult<T>>
{
    boolean tryComplete(T p0);
    boolean tryFail(Throwable p0);
    default boolean tryComplete(){ return false; }
    default boolean tryFail(String p0){ return false; }
    default void complete(){}
    default void complete(T p0){}
    default void fail(String p0){}
    default void fail(Throwable p0){}
    default void handle(io.vertx.core.AsyncResult<T> p0){}
    io.vertx.core.Future<T> future();
    static <T> io.vertx.core.Promise<T> promise(){ return null; }
}
