// Generated automatically from io.vertx.core.WorkerExecutor for testing purposes

package io.vertx.core;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Promise;
import io.vertx.core.metrics.Measured;

public interface WorkerExecutor extends Measured
{
    <T> io.vertx.core.Future<T> executeBlocking(io.vertx.core.Handler<io.vertx.core.Promise<T>> p0, boolean p1);
    <T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Promise<T>> p0, boolean p1, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> p2);
    Future<Void> close();
    default <T> io.vertx.core.Future<T> executeBlocking(io.vertx.core.Handler<io.vertx.core.Promise<T>> p0){ return null; }
    default <T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Promise<T>> p0, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> p1){}
    void close(Handler<AsyncResult<Void>> p0);
}
