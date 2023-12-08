// Generated automatically from io.vertx.core.spi.cluster.NodeSelector for testing purposes

package io.vertx.core.spi.cluster;

import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.Message;
import io.vertx.core.impl.VertxBuilder;
import io.vertx.core.spi.VertxServiceProvider;
import io.vertx.core.spi.cluster.ClusterManager;
import io.vertx.core.spi.cluster.RegistrationUpdateEvent;

public interface NodeSelector extends VertxServiceProvider
{
    default boolean wantsUpdatesFor(String p0){ return false; }
    default void init(VertxBuilder p0){}
    void eventBusStarted();
    void init(Vertx p0, ClusterManager p1);
    void registrationsLost();
    void registrationsUpdated(RegistrationUpdateEvent p0);
    void selectForPublish(Message<? extends Object> p0, Promise<Iterable<String>> p1);
    void selectForSend(Message<? extends Object> p0, Promise<String> p1);
}
