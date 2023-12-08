// Generated automatically from io.vertx.core.MultiMap for testing purposes

package io.vertx.core;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public interface MultiMap extends Iterable<Map.Entry<String, String>>
{
    List<String> getAll(CharSequence p0);
    List<String> getAll(String p0);
    MultiMap add(CharSequence p0, CharSequence p1);
    MultiMap add(CharSequence p0, Iterable<CharSequence> p1);
    MultiMap add(String p0, Iterable<String> p1);
    MultiMap add(String p0, String p1);
    MultiMap addAll(Map<String, String> p0);
    MultiMap addAll(MultiMap p0);
    MultiMap clear();
    MultiMap remove(CharSequence p0);
    MultiMap remove(String p0);
    MultiMap set(CharSequence p0, CharSequence p1);
    MultiMap set(CharSequence p0, Iterable<CharSequence> p1);
    MultiMap set(String p0, Iterable<String> p1);
    MultiMap set(String p0, String p1);
    MultiMap setAll(Map<String, String> p0);
    MultiMap setAll(MultiMap p0);
    Set<String> names();
    String get(CharSequence p0);
    String get(String p0);
    boolean contains(CharSequence p0);
    boolean contains(String p0);
    boolean isEmpty();
    default List<Map.Entry<String, String>> entries(){ return null; }
    default boolean contains(CharSequence p0, CharSequence p1, boolean p2){ return false; }
    default boolean contains(String p0, String p1, boolean p2){ return false; }
    default void forEach(BiConsumer<String, String> p0){}
    int size();
    static MultiMap caseInsensitiveMultiMap(){ return null; }
}
