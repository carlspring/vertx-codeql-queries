// Generated automatically from io.vertx.ext.auth.User for testing purposes

package io.vertx.ext.auth;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.AuthProvider;
import io.vertx.ext.auth.authorization.Authorization;
import io.vertx.ext.auth.authorization.Authorizations;

public interface User
{
    JsonObject attributes();
    JsonObject principal();
    User isAuthorized(Authorization p0, Handler<AsyncResult<Boolean>> p1);
    User merge(User p0);
    default <T> T get(String p0){ return null; }
    default <T> T getOrDefault(String p0, T p1){ return null; }
    default Authorizations authorizations(){ return null; }
    default Future<Boolean> isAuthorized(Authorization p0){ return null; }
    default Future<Boolean> isAuthorized(String p0){ return null; }
    default String subject(){ return null; }
    default User clearCache(){ return null; }
    default User isAuthorized(String p0, Handler<AsyncResult<Boolean>> p1){ return null; }
    default boolean containsKey(String p0){ return false; }
    default boolean expired(){ return false; }
    default boolean expired(int p0){ return false; }
    default boolean hasAmr(String p0){ return false; }
    static User create(JsonObject p0){ return null; }
    static User create(JsonObject p0, JsonObject p1){ return null; }
    static User fromName(String p0){ return null; }
    static User fromToken(String p0){ return null; }
    void setAuthProvider(AuthProvider p0);
}
