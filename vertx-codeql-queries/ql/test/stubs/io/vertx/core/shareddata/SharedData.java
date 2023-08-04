// Generated automatically from io.vertx.core.shareddata.SharedData for testing purposes

package io.vertx.core.shareddata;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.shareddata.AsyncMap;
import io.vertx.core.shareddata.Counter;
import io.vertx.core.shareddata.LocalMap;
import io.vertx.core.shareddata.Lock;

public interface SharedData
{
    <K, V> LocalMap<K, V> getLocalMap(String p0);
    <K, V> io.vertx.core.Future<io.vertx.core.shareddata.AsyncMap<K, V>> getAsyncMap(String p0);
    <K, V> io.vertx.core.Future<io.vertx.core.shareddata.AsyncMap<K, V>> getClusterWideMap(String p0);
    <K, V> io.vertx.core.Future<io.vertx.core.shareddata.AsyncMap<K, V>> getLocalAsyncMap(String p0);
    <K, V> void getAsyncMap(String p0, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.AsyncMap<K, V>>> p1);
    <K, V> void getClusterWideMap(String p0, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.AsyncMap<K, V>>> p1);
    <K, V> void getLocalAsyncMap(String p0, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.AsyncMap<K, V>>> p1);
    Future<Counter> getCounter(String p0);
    Future<Counter> getLocalCounter(String p0);
    Future<Lock> getLocalLock(String p0);
    Future<Lock> getLocalLockWithTimeout(String p0, long p1);
    Future<Lock> getLock(String p0);
    Future<Lock> getLockWithTimeout(String p0, long p1);
    void getCounter(String p0, Handler<AsyncResult<Counter>> p1);
    void getLocalCounter(String p0, Handler<AsyncResult<Counter>> p1);
    void getLocalLock(String p0, Handler<AsyncResult<Lock>> p1);
    void getLocalLockWithTimeout(String p0, long p1, Handler<AsyncResult<Lock>> p2);
    void getLock(String p0, Handler<AsyncResult<Lock>> p1);
    void getLockWithTimeout(String p0, long p1, Handler<AsyncResult<Lock>> p2);
}
