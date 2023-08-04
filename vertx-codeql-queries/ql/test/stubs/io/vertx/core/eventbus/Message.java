// Generated automatically from io.vertx.core.eventbus.Message for testing purposes

package io.vertx.core.eventbus;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.eventbus.DeliveryOptions;

public interface Message<T>
{
    <R> io.vertx.core.Future<io.vertx.core.eventbus.Message<R>> replyAndRequest(Object p0, DeliveryOptions p1);
    MultiMap headers();
    String address();
    String replyAddress();
    T body();
    boolean isSend();
    default <R> io.vertx.core.Future<io.vertx.core.eventbus.Message<R>> replyAndRequest(Object p0){ return null; }
    default <R> void replyAndRequest(Object p0, DeliveryOptions p1, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> p2){}
    default <R> void replyAndRequest(Object p0, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> p1){}
    default void fail(int p0, String p1){}
    default void reply(Object p0){}
    void reply(Object p0, DeliveryOptions p1);
}
