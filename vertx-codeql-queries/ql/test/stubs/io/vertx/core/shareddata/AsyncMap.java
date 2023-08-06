// Generated automatically from io.vertx.core.shareddata.AsyncMap for testing purposes

package io.vertx.core.shareddata;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface AsyncMap<K, V>
{
    Future<Boolean> removeIfPresent(K p0, V p1);
    Future<Boolean> replaceIfPresent(K p0, V p1, V p2);
    Future<Integer> size();
    Future<List<V>> values();
    Future<Void> clear();
    Future<Void> put(K p0, V p1);
    Future<Void> put(K p0, V p1, long p2);
    Future<java.util.Map<K, V>> entries();
    Future<java.util.Set<K>> keys();
    default Future<Boolean> replaceIfPresent(K p0, V p1, V p2, long p3){ return null; }
    default io.vertx.core.Future<V> replace(K p0, V p1, long p2){ return null; }
    default void clear(Handler<AsyncResult<Void>> p0){}
    default void entries(Handler<AsyncResult<java.util.Map<K, V>>> p0){}
    default void get(K p0, Handler<io.vertx.core.AsyncResult<V>> p1){}
    default void keys(Handler<AsyncResult<java.util.Set<K>>> p0){}
    default void put(K p0, V p1, Handler<AsyncResult<Void>> p2){}
    default void put(K p0, V p1, long p2, Handler<AsyncResult<Void>> p3){}
    default void putIfAbsent(K p0, V p1, Handler<io.vertx.core.AsyncResult<V>> p2){}
    default void putIfAbsent(K p0, V p1, long p2, Handler<io.vertx.core.AsyncResult<V>> p3){}
    default void remove(K p0, Handler<io.vertx.core.AsyncResult<V>> p1){}
    default void removeIfPresent(K p0, V p1, Handler<AsyncResult<Boolean>> p2){}
    default void replace(K p0, V p1, Handler<io.vertx.core.AsyncResult<V>> p2){}
    default void replace(K p0, V p1, long p2, Handler<io.vertx.core.AsyncResult<V>> p3){}
    default void replaceIfPresent(K p0, V p1, V p2, Handler<AsyncResult<Boolean>> p3){}
    default void replaceIfPresent(K p0, V p1, V p2, long p3, Handler<AsyncResult<Boolean>> p4){}
    default void size(Handler<AsyncResult<Integer>> p0){}
    default void values(Handler<AsyncResult<List<V>>> p0){}
    io.vertx.core.Future<V> get(K p0);
    io.vertx.core.Future<V> putIfAbsent(K p0, V p1);
    io.vertx.core.Future<V> putIfAbsent(K p0, V p1, long p2);
    io.vertx.core.Future<V> remove(K p0);
    io.vertx.core.Future<V> replace(K p0, V p1);
}
