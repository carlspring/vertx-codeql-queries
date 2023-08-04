// Generated automatically from io.vertx.core.eventbus.MessageConsumer for testing purposes

package io.vertx.core.eventbus;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.Message;
import io.vertx.core.streams.ReadStream;

public interface MessageConsumer<T> extends io.vertx.core.streams.ReadStream<io.vertx.core.eventbus.Message<T>>
{
    Future<Void> unregister();
    MessageConsumer<T> endHandler(Handler<Void> p0);
    MessageConsumer<T> exceptionHandler(Handler<Throwable> p0);
    MessageConsumer<T> fetch(long p0);
    MessageConsumer<T> handler(io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> p0);
    MessageConsumer<T> pause();
    MessageConsumer<T> resume();
    MessageConsumer<T> setMaxBufferedMessages(int p0);
    ReadStream<T> bodyStream();
    String address();
    boolean isRegistered();
    int getMaxBufferedMessages();
    void completionHandler(Handler<AsyncResult<Void>> p0);
    void unregister(Handler<AsyncResult<Void>> p0);
}
