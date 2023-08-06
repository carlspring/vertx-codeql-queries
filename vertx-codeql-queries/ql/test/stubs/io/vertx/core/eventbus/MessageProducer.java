// Generated automatically from io.vertx.core.eventbus.MessageProducer for testing purposes

package io.vertx.core.eventbus;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.DeliveryOptions;

public interface MessageProducer<T>
{
    Future<Void> close();
    Future<Void> write(T p0);
    MessageProducer<T> deliveryOptions(DeliveryOptions p0);
    String address();
    void close(Handler<AsyncResult<Void>> p0);
    void write(T p0, Handler<AsyncResult<Void>> p1);
}
