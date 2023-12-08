// Generated automatically from io.vertx.core.shareddata.Counter for testing purposes

package io.vertx.core.shareddata;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;

public interface Counter
{
    Future<Boolean> compareAndSet(long p0, long p1);
    Future<Long> addAndGet(long p0);
    Future<Long> decrementAndGet();
    Future<Long> get();
    Future<Long> getAndAdd(long p0);
    Future<Long> getAndIncrement();
    Future<Long> incrementAndGet();
    default void addAndGet(long p0, Handler<AsyncResult<Long>> p1){}
    default void compareAndSet(long p0, long p1, Handler<AsyncResult<Boolean>> p2){}
    default void decrementAndGet(Handler<AsyncResult<Long>> p0){}
    default void get(Handler<AsyncResult<Long>> p0){}
    default void getAndAdd(long p0, Handler<AsyncResult<Long>> p1){}
    default void getAndIncrement(Handler<AsyncResult<Long>> p0){}
    default void incrementAndGet(Handler<AsyncResult<Long>> p0){}
}
