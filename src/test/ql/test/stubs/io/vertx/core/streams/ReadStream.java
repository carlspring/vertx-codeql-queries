// Generated automatically from io.vertx.core.streams.ReadStream for testing purposes

package io.vertx.core.streams;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.streams.Pipe;
import io.vertx.core.streams.StreamBase;
import io.vertx.core.streams.WriteStream;

public interface ReadStream<T> extends StreamBase
{
    ReadStream<T> endHandler(Handler<Void> p0);
    ReadStream<T> exceptionHandler(Handler<Throwable> p0);
    ReadStream<T> fetch(long p0);
    ReadStream<T> handler(io.vertx.core.Handler<T> p0);
    ReadStream<T> pause();
    ReadStream<T> resume();
    default Future<Void> pipeTo(io.vertx.core.streams.WriteStream<T> p0){ return null; }
    default Pipe<T> pipe(){ return null; }
    default void pipeTo(io.vertx.core.streams.WriteStream<T> p0, Handler<AsyncResult<Void>> p1){}
}
