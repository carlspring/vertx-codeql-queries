// Generated automatically from io.vertx.ext.web.Route for testing purposes

package io.vertx.ext.web;

import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public interface Route
{
    Map<String, Object> metadata();
    Route blockingHandler(Handler<RoutingContext> p0);
    Route blockingHandler(Handler<RoutingContext> p0, boolean p1);
    Route consumes(String p0);
    Route disable();
    Route enable();
    Route failureHandler(Handler<RoutingContext> p0);
    Route handler(Handler<RoutingContext> p0);
    Route last();
    Route method(io.vertx.core.http.HttpMethod p0);
    Route order(int p0);
    Route path(String p0);
    Route pathRegex(String p0);
    Route produces(String p0);
    Route putMetadata(String p0, Object p1);
    Route remove();
    Route setName(String p0);
    Route setRegexGroupsNames(List<String> p0);
    Route subRouter(Router p0);
    Route useNormalizedPath(boolean p0);
    Route virtualHost(String p0);
    Set<io.vertx.core.http.HttpMethod> methods();
    String getName();
    String getPath();
    boolean isExactPath();
    boolean isRegexPath();
    default <T> Route respond(Function<RoutingContext, io.vertx.core.Future<T>> p0){ return null; }
    default <T> T getMetadata(String p0){ return null; }
    default Route useNormalisedPath(boolean p0){ return null; }
}
