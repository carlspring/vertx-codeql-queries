// Generated automatically from io.vertx.core.Verticle for testing purposes

package io.vertx.core;

import io.vertx.core.Context;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;

public interface Verticle
{
    Vertx getVertx();
    void init(Vertx p0, Context p1);
    void start(Promise<Void> p0);
    void stop(Promise<Void> p0);
}
