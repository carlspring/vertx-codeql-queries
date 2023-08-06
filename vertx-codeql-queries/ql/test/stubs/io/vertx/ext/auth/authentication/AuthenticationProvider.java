// Generated automatically from io.vertx.ext.auth.authentication.AuthenticationProvider for testing purposes

package io.vertx.ext.auth.authentication;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.ext.auth.authentication.Credentials;

public interface AuthenticationProvider
{
    default Future<User> authenticate(Credentials p0){ return null; }
    default Future<User> authenticate(JsonObject p0){ return null; }
    default void authenticate(Credentials p0, Handler<AsyncResult<User>> p1){}
    void authenticate(JsonObject p0, Handler<AsyncResult<User>> p1);
}
