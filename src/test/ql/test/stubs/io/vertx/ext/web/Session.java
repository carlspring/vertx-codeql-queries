// Generated automatically from io.vertx.ext.web.Session for testing purposes

package io.vertx.ext.web;

import java.util.Map;
import java.util.function.Function;

public interface Session
{
    <T> T get(String p0);
    <T> T remove(String p0);
    Map<String, Object> data();
    Session computeIfAbsent(String p0, Function<String, Object> p1);
    Session put(String p0, Object p1);
    Session putIfAbsent(String p0, Object p1);
    Session regenerateId();
    String id();
    String oldId();
    boolean isDestroyed();
    boolean isEmpty();
    boolean isRegenerated();
    default String value(){ return null; }
    long lastAccessed();
    long timeout();
    void destroy();
    void setAccessed();
}
