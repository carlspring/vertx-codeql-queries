// Generated automatically from io.vertx.core.spi.tracing.TagExtractor for testing purposes

package io.vertx.core.spi.tracing;

import java.util.Map;
import java.util.function.BiConsumer;

public interface TagExtractor<T>
{
    default Map<String, String> extract(T p0){ return null; }
    default String name(T p0, int p1){ return null; }
    default String value(T p0, int p1){ return null; }
    default int len(T p0){ return 0; }
    default void extractTo(T p0, BiConsumer<String, String> p1){}
    default void extractTo(T p0, Map<String, String> p1){}
    static <T> TagExtractor<T> empty(){ return null; }
}
