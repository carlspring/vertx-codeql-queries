// Generated automatically from io.vertx.core.eventbus.DeliveryContext for testing purposes

package io.vertx.core.eventbus;

import io.vertx.core.eventbus.Message;

public interface DeliveryContext<T>
{
    Object body();
    boolean send();
    io.vertx.core.eventbus.Message<T> message();
    void next();
}
