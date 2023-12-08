// Generated automatically from io.vertx.core.spi.VertxThreadFactory for testing purposes

package io.vertx.core.spi;

import io.vertx.core.impl.VertxBuilder;
import io.vertx.core.impl.VertxThread;
import io.vertx.core.spi.VertxServiceProvider;
import java.util.concurrent.TimeUnit;

public interface VertxThreadFactory extends VertxServiceProvider
{
    default VertxThread newVertxThread(Runnable p0, String p1, boolean p2, long p3, TimeUnit p4){ return null; }
    default void init(VertxBuilder p0){}
    static VertxThreadFactory INSTANCE = null;
}
