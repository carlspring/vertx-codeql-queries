// Generated automatically from io.vertx.core.CompositeFuture for testing purposes

package io.vertx.core;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import java.util.List;

public interface CompositeFuture extends Future<CompositeFuture>
{
    <T> T resultAt(int p0);
    CompositeFuture onComplete(Handler<AsyncResult<CompositeFuture>> p0);
    Throwable cause(int p0);
    boolean failed(int p0);
    boolean isComplete(int p0);
    boolean succeeded(int p0);
    default <T> java.util.List<T> list(){ return null; }
    default CompositeFuture onFailure(Handler<Throwable> p0){ return null; }
    default CompositeFuture onSuccess(Handler<CompositeFuture> p0){ return null; }
    default List<Throwable> causes(){ return null; }
    int size();
    static <T1, T2, T3, T4, T5, T6> CompositeFuture all(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1, io.vertx.core.Future<T3> p2, io.vertx.core.Future<T4> p3, io.vertx.core.Future<T5> p4, io.vertx.core.Future<T6> p5){ return null; }
    static <T1, T2, T3, T4, T5, T6> CompositeFuture any(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1, io.vertx.core.Future<T3> p2, io.vertx.core.Future<T4> p3, io.vertx.core.Future<T5> p4, io.vertx.core.Future<T6> p5){ return null; }
    static <T1, T2, T3, T4, T5, T6> CompositeFuture join(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1, io.vertx.core.Future<T3> p2, io.vertx.core.Future<T4> p3, io.vertx.core.Future<T5> p4, io.vertx.core.Future<T6> p5){ return null; }
    static <T1, T2, T3, T4, T5> CompositeFuture all(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1, io.vertx.core.Future<T3> p2, io.vertx.core.Future<T4> p3, io.vertx.core.Future<T5> p4){ return null; }
    static <T1, T2, T3, T4, T5> CompositeFuture any(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1, io.vertx.core.Future<T3> p2, io.vertx.core.Future<T4> p3, io.vertx.core.Future<T5> p4){ return null; }
    static <T1, T2, T3, T4, T5> CompositeFuture join(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1, io.vertx.core.Future<T3> p2, io.vertx.core.Future<T4> p3, io.vertx.core.Future<T5> p4){ return null; }
    static <T1, T2, T3, T4> CompositeFuture all(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1, io.vertx.core.Future<T3> p2, io.vertx.core.Future<T4> p3){ return null; }
    static <T1, T2, T3, T4> CompositeFuture any(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1, io.vertx.core.Future<T3> p2, io.vertx.core.Future<T4> p3){ return null; }
    static <T1, T2, T3, T4> CompositeFuture join(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1, io.vertx.core.Future<T3> p2, io.vertx.core.Future<T4> p3){ return null; }
    static <T1, T2, T3> CompositeFuture all(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1, io.vertx.core.Future<T3> p2){ return null; }
    static <T1, T2, T3> CompositeFuture any(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1, io.vertx.core.Future<T3> p2){ return null; }
    static <T1, T2, T3> CompositeFuture join(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1, io.vertx.core.Future<T3> p2){ return null; }
    static <T1, T2> CompositeFuture all(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1){ return null; }
    static <T1, T2> CompositeFuture any(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1){ return null; }
    static <T1, T2> CompositeFuture join(io.vertx.core.Future<T1> p0, io.vertx.core.Future<T2> p1){ return null; }
    static CompositeFuture all(List<Future> p0){ return null; }
    static CompositeFuture any(List<Future> p0){ return null; }
    static CompositeFuture join(List<Future> p0){ return null; }
}
