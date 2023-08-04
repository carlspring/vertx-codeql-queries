// Generated automatically from io.vertx.core.shareddata.LocalMap for testing purposes

package io.vertx.core.shareddata;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface LocalMap<K, V> extends java.util.Map<K, V>
{
    V compute(K p0, java.util.function.BiFunction<? super K, ? super V, ? extends V> p1);
    V computeIfAbsent(K p0, java.util.function.Function<? super K, ? extends V> p1);
    V computeIfPresent(K p0, java.util.function.BiFunction<? super K, ? super V, ? extends V> p1);
    V get(Object p0);
    V getOrDefault(Object p0, V p1);
    V merge(K p0, V p1, java.util.function.BiFunction<? super V, ? super V, ? extends V> p2);
    V put(K p0, V p1);
    V putIfAbsent(K p0, V p1);
    V remove(Object p0);
    V replace(K p0, V p1);
    boolean containsKey(Object p0);
    boolean containsValue(Object p0);
    boolean isEmpty();
    boolean remove(Object p0, Object p1);
    boolean removeIfPresent(K p0, V p1);
    boolean replace(K p0, V p1, V p2);
    boolean replaceIfPresent(K p0, V p1, V p2);
    int size();
    java.util.Collection<V> values();
    java.util.Set<K> keySet();
    java.util.Set<Map.Entry<K, V>> entrySet();
    void clear();
    void close();
    void forEach(java.util.function.BiConsumer<? super K, ? super V> p0);
    void putAll(java.util.Map<? extends K, ? extends V> p0);
    void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> p0);
}
