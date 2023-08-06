// Generated automatically from io.vertx.ext.web.RequestBody for testing purposes

package io.vertx.ext.web;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

public interface RequestBody
{
    <R> R asPojo(java.lang.Class<R> p0, int p1);
    Buffer buffer();
    JsonArray asJsonArray(int p0);
    JsonObject asJsonObject(int p0);
    String asString();
    String asString(String p0);
    boolean available();
    default <R> R asPojo(java.lang.Class<R> p0){ return null; }
    default JsonArray asJsonArray(){ return null; }
    default JsonObject asJsonObject(){ return null; }
    default boolean isEmpty(){ return false; }
    int length();
}
