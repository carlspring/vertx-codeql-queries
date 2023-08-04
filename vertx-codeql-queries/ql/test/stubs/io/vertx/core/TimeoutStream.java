// Generated automatically from io.vertx.core.TimeoutStream for testing purposes

package io.vertx.core;

import io.vertx.core.Handler;
import io.vertx.core.streams.ReadStream;

public interface TimeoutStream extends ReadStream<Long>
{
    TimeoutStream endHandler(Handler<Void> p0);
    TimeoutStream exceptionHandler(Handler<Throwable> p0);
    TimeoutStream fetch(long p0);
    TimeoutStream handler(Handler<Long> p0);
    TimeoutStream pause();
    TimeoutStream resume();
    void cancel();
}
