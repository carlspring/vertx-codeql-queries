// Generated automatically from io.vertx.ext.auth.authentication.Credentials for testing purposes

package io.vertx.ext.auth.authentication;

import io.vertx.core.json.JsonObject;

public interface Credentials
{
    JsonObject toJson();
    default <V> void checkValid(V p0){}
    default Credentials applyHttpChallenge(String p0){ return null; }
    default Credentials applyHttpChallenge(String p0, io.vertx.core.http.HttpMethod p1, String p2){ return null; }
    default Credentials applyHttpChallenge(String p0, io.vertx.core.http.HttpMethod p1, String p2, Integer p3, String p4){ return null; }
    default String toHttpAuthorization(){ return null; }
}
