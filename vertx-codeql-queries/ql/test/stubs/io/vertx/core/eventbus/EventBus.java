// Generated automatically from io.vertx.core.eventbus.EventBus for testing purposes

package io.vertx.core.eventbus;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.DeliveryContext;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.eventbus.Message;
import io.vertx.core.eventbus.MessageCodec;
import io.vertx.core.eventbus.MessageConsumer;
import io.vertx.core.eventbus.MessageProducer;
import io.vertx.core.metrics.Measured;
import java.util.function.Function;

public interface EventBus extends Measured
{
    <T> EventBus addInboundInterceptor(io.vertx.core.Handler<io.vertx.core.eventbus.DeliveryContext<T>> p0);
    <T> EventBus addOutboundInterceptor(io.vertx.core.Handler<io.vertx.core.eventbus.DeliveryContext<T>> p0);
    <T> EventBus registerDefaultCodec(java.lang.Class<T> p0, MessageCodec<T, ? extends Object> p1);
    <T> EventBus removeInboundInterceptor(io.vertx.core.Handler<io.vertx.core.eventbus.DeliveryContext<T>> p0);
    <T> EventBus removeOutboundInterceptor(io.vertx.core.Handler<io.vertx.core.eventbus.DeliveryContext<T>> p0);
    <T> io.vertx.core.Future<io.vertx.core.eventbus.Message<T>> request(String p0, Object p1, DeliveryOptions p2);
    <T> io.vertx.core.eventbus.MessageConsumer<T> consumer(String p0);
    <T> io.vertx.core.eventbus.MessageConsumer<T> consumer(String p0, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> p1);
    <T> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(String p0);
    <T> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(String p0, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> p1);
    <T> io.vertx.core.eventbus.MessageProducer<T> publisher(String p0);
    <T> io.vertx.core.eventbus.MessageProducer<T> publisher(String p0, DeliveryOptions p1);
    <T> io.vertx.core.eventbus.MessageProducer<T> sender(String p0);
    <T> io.vertx.core.eventbus.MessageProducer<T> sender(String p0, DeliveryOptions p1);
    EventBus clusterSerializableChecker(Function<String, Boolean> p0);
    EventBus codecSelector(Function<Object, String> p0);
    EventBus publish(String p0, Object p1);
    EventBus publish(String p0, Object p1, DeliveryOptions p2);
    EventBus registerCodec(MessageCodec p0);
    EventBus send(String p0, Object p1);
    EventBus send(String p0, Object p1, DeliveryOptions p2);
    EventBus serializableChecker(Function<String, Boolean> p0);
    EventBus unregisterCodec(String p0);
    EventBus unregisterDefaultCodec(Class p0);
    default <T> EventBus request(String p0, Object p1, DeliveryOptions p2, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> p3){ return null; }
    default <T> EventBus request(String p0, Object p1, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> p2){ return null; }
    default <T> io.vertx.core.Future<io.vertx.core.eventbus.Message<T>> request(String p0, Object p1){ return null; }
    static Function<String, Boolean> DEFAULT_SERIALIZABLE_CHECKER = null;
}
