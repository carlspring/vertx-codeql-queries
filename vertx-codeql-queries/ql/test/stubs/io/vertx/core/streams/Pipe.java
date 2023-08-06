// Generated automatically from io.vertx.core.streams.Pipe for testing purposes

package io.vertx.core.streams;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.streams.WriteStream;

public interface Pipe<T>
{
    Pipe<T> endOnComplete(boolean p0);
    Pipe<T> endOnFailure(boolean p0);
    Pipe<T> endOnSuccess(boolean p0);
    default Future<Void> to(io.vertx.core.streams.WriteStream<T> p0){ return null; }
    void close();
    void to(io.vertx.core.streams.WriteStream<T> p0, Handler<AsyncResult<Void>> p1);
}
