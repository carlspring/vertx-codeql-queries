// Generated automatically from io.vertx.core.streams.WriteStream for testing purposes

package io.vertx.core.streams;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.streams.StreamBase;

public interface WriteStream<T> extends StreamBase
{
    Future<Void> write(T p0);
    WriteStream<T> drainHandler(Handler<Void> p0);
    WriteStream<T> exceptionHandler(Handler<Throwable> p0);
    WriteStream<T> setWriteQueueMaxSize(int p0);
    boolean writeQueueFull();
    default Future<Void> end(){ return null; }
    default Future<Void> end(T p0){ return null; }
    default void end(T p0, Handler<AsyncResult<Void>> p1){}
    void end(Handler<AsyncResult<Void>> p0);
    void write(T p0, Handler<AsyncResult<Void>> p1);
}
