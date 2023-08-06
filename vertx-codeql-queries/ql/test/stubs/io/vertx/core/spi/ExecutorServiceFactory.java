// Generated automatically from io.vertx.core.spi.ExecutorServiceFactory for testing purposes

package io.vertx.core.spi;

import io.vertx.core.impl.VertxBuilder;
import io.vertx.core.spi.VertxServiceProvider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public interface ExecutorServiceFactory extends VertxServiceProvider
{
    ExecutorService createExecutor(ThreadFactory p0, Integer p1, Integer p2);
    default void init(VertxBuilder p0){}
    static ExecutorServiceFactory INSTANCE = null;
}
