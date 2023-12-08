// Generated automatically from io.vertx.ext.auth.authorization.Authorizations for testing purposes

package io.vertx.ext.auth.authorization;

import io.vertx.ext.auth.authorization.Authorization;
import java.util.Set;

public interface Authorizations
{
    Authorizations add(String p0, Authorization p1);
    Authorizations add(String p0, Set<Authorization> p1);
    Authorizations clear();
    Authorizations clear(String p0);
    Set<Authorization> get(String p0);
    Set<String> getProviderIds();
}
