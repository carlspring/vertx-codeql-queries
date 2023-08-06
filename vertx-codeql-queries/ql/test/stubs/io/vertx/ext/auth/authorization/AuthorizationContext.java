// Generated automatically from io.vertx.ext.auth.authorization.AuthorizationContext for testing purposes

package io.vertx.ext.auth.authorization;

import io.vertx.core.MultiMap;
import io.vertx.ext.auth.User;

public interface AuthorizationContext
{
    MultiMap variables();
    User user();
    static AuthorizationContext create(User p0){ return null; }
}
