// Generated automatically from io.vertx.ext.auth.authorization.Authorization for testing purposes

package io.vertx.ext.auth.authorization;

import io.vertx.ext.auth.User;
import io.vertx.ext.auth.authorization.AuthorizationContext;

public interface Authorization
{
    boolean match(AuthorizationContext p0);
    boolean verify(Authorization p0);
    default boolean match(User p0){ return false; }
}
