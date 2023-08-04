// Generated automatically from io.vertx.core.Future for testing purposes

package io.vertx.core;

import io.vertx.core.AsyncResult;
import io.vertx.core.CompositeFuture;
import io.vertx.core.Context;
import io.vertx.core.Handler;
import io.vertx.core.Promise;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;

public interface Future<T> extends io.vertx.core.AsyncResult<T>
{
    <U> Future<T> eventually(Function<Void, io.vertx.core.Future<U>> p0);
    <U> io.vertx.core.Future<U> compose(java.util.function.Function<T, io.vertx.core.Future<U>> p0, Function<Throwable, io.vertx.core.Future<U>> p1);
    <U> io.vertx.core.Future<U> map(java.util.function.Function<T, U> p0);
    <U> io.vertx.core.Future<U> transform(java.util.function.Function<io.vertx.core.AsyncResult<T>, io.vertx.core.Future<U>> p0);
    <V> io.vertx.core.Future<V> map(V p0);
    Future<T> onComplete(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> p0);
    Future<T> otherwise(T p0);
    Future<T> otherwise(java.util.function.Function<Throwable, T> p0);
    T result();
    Throwable cause();
    boolean failed();
    boolean isComplete();
    boolean succeeded();
    default <U> io.vertx.core.Future<U> compose(java.util.function.Function<T, io.vertx.core.Future<U>> p0){ return null; }
    default <U> io.vertx.core.Future<U> flatMap(java.util.function.Function<T, io.vertx.core.Future<U>> p0){ return null; }
    default <V> io.vertx.core.Future<V> mapEmpty(){ return null; }
    default Future<T> andThen(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> p0){ return null; }
    default Future<T> onFailure(Handler<Throwable> p0){ return null; }
    default Future<T> onSuccess(io.vertx.core.Handler<T> p0){ return null; }
    default Future<T> otherwiseEmpty(){ return null; }
    default Future<T> recover(Function<Throwable, Future<T>> p0){ return null; }
    default java.util.concurrent.CompletionStage<T> toCompletionStage(){ return null; }
    static <T> io.vertx.core.Future<T> failedFuture(String p0){ return null; }
    static <T> io.vertx.core.Future<T> failedFuture(Throwable p0){ return null; }
    static <T> io.vertx.core.Future<T> fromCompletionStage(java.util.concurrent.CompletionStage<T> p0){ return null; }
    static <T> io.vertx.core.Future<T> fromCompletionStage(java.util.concurrent.CompletionStage<T> p0, Context p1){ return null; }
    static <T> io.vertx.core.Future<T> future(io.vertx.core.Handler<io.vertx.core.Promise<T>> p0){ return null; }
    static <T> io.vertx.core.Future<T> succeededFuture(){ return null; }
    static <T> io.vertx.core.Future<T> succeededFuture(T p0){ return null; }
    static CompositeFuture all(Future<? extends Object> p0, Future<? extends Object> p1){ return null; }
    static CompositeFuture all(Future<? extends Object> p0, Future<? extends Object> p1, Future<? extends Object> p2){ return null; }
    static CompositeFuture all(Future<? extends Object> p0, Future<? extends Object> p1, Future<? extends Object> p2, Future<? extends Object> p3){ return null; }
    static CompositeFuture all(Future<? extends Object> p0, Future<? extends Object> p1, Future<? extends Object> p2, Future<? extends Object> p3, Future<? extends Object> p4){ return null; }
    static CompositeFuture all(Future<? extends Object> p0, Future<? extends Object> p1, Future<? extends Object> p2, Future<? extends Object> p3, Future<? extends Object> p4, Future<? extends Object> p5){ return null; }
    static CompositeFuture all(List<? extends Future<? extends Object>> p0){ return null; }
    static CompositeFuture any(Future<? extends Object> p0, Future<? extends Object> p1){ return null; }
    static CompositeFuture any(Future<? extends Object> p0, Future<? extends Object> p1, Future<? extends Object> p2){ return null; }
    static CompositeFuture any(Future<? extends Object> p0, Future<? extends Object> p1, Future<? extends Object> p2, Future<? extends Object> p3){ return null; }
    static CompositeFuture any(Future<? extends Object> p0, Future<? extends Object> p1, Future<? extends Object> p2, Future<? extends Object> p3, Future<? extends Object> p4){ return null; }
    static CompositeFuture any(Future<? extends Object> p0, Future<? extends Object> p1, Future<? extends Object> p2, Future<? extends Object> p3, Future<? extends Object> p4, Future<? extends Object> p5){ return null; }
    static CompositeFuture any(List<? extends Future<? extends Object>> p0){ return null; }
    static CompositeFuture join(Future<? extends Object> p0, Future<? extends Object> p1){ return null; }
    static CompositeFuture join(Future<? extends Object> p0, Future<? extends Object> p1, Future<? extends Object> p2){ return null; }
    static CompositeFuture join(Future<? extends Object> p0, Future<? extends Object> p1, Future<? extends Object> p2, Future<? extends Object> p3){ return null; }
    static CompositeFuture join(Future<? extends Object> p0, Future<? extends Object> p1, Future<? extends Object> p2, Future<? extends Object> p3, Future<? extends Object> p4){ return null; }
    static CompositeFuture join(Future<? extends Object> p0, Future<? extends Object> p1, Future<? extends Object> p2, Future<? extends Object> p3, Future<? extends Object> p4, Future<? extends Object> p5){ return null; }
    static CompositeFuture join(List<? extends Future<? extends Object>> p0){ return null; }
}
