// Generated automatically from io.vertx.core.spi.VerticleFactory for testing purposes

package io.vertx.core.spi;

import io.vertx.core.Promise;
import io.vertx.core.Verticle;
import io.vertx.core.Vertx;
import java.util.concurrent.Callable;

public interface VerticleFactory
{
    String prefix();
    default int order(){ return 0; }
    default void close(){}
    default void init(Vertx p0){}
    static String removePrefix(String p0){ return null; }
    void createVerticle(String p0, ClassLoader p1, Promise<Callable<Verticle>> p2);
}
