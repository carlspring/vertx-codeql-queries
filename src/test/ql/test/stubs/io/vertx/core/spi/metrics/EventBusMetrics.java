// Generated automatically from io.vertx.core.spi.metrics.EventBusMetrics for testing purposes

package io.vertx.core.spi.metrics;

import io.vertx.core.eventbus.Message;
import io.vertx.core.eventbus.ReplyFailure;
import io.vertx.core.spi.metrics.Metrics;

public interface EventBusMetrics<H> extends Metrics
{
    default H handlerRegistered(String p0, String p1){ return null; }
    default void discardMessage(H p0, boolean p1, Message<? extends Object> p2){}
    default void handlerUnregistered(H p0){}
    default void messageDelivered(H p0, boolean p1){}
    default void messageRead(String p0, int p1){}
    default void messageReceived(String p0, boolean p1, boolean p2, int p3){}
    default void messageSent(String p0, boolean p1, boolean p2, boolean p3){}
    default void messageWritten(String p0, int p1){}
    default void replyFailure(String p0, ReplyFailure p1){}
    default void scheduleMessage(H p0, boolean p1){}
}
