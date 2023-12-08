// Generated automatically from io.vertx.ext.web.handler.CorsHandler for testing purposes

package io.vertx.ext.web.handler;

import io.vertx.ext.web.handler.SecurityPolicyHandler;
import java.util.List;
import java.util.Set;

public interface CorsHandler extends SecurityPolicyHandler
{
    CorsHandler addOrigin(String p0);
    CorsHandler addOrigins(List<String> p0);
    CorsHandler addRelativeOrigin(String p0);
    CorsHandler addRelativeOrigins(List<String> p0);
    CorsHandler allowCredentials(boolean p0);
    CorsHandler allowPrivateNetwork(boolean p0);
    CorsHandler allowedHeader(String p0);
    CorsHandler allowedHeaders(Set<String> p0);
    CorsHandler allowedMethod(io.vertx.core.http.HttpMethod p0);
    CorsHandler allowedMethods(Set<io.vertx.core.http.HttpMethod> p0);
    CorsHandler exposedHeader(String p0);
    CorsHandler exposedHeaders(Set<String> p0);
    CorsHandler maxAgeSeconds(int p0);
    static CorsHandler create(){ return null; }
    static CorsHandler create(String p0){ return null; }
}
