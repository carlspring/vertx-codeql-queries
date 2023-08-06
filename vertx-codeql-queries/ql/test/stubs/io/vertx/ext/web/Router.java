// Generated automatically from io.vertx.ext.web.Router for testing purposes

package io.vertx.ext.web;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.ext.web.AllowForwardHeaders;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.RoutingContext;
import java.util.List;
import java.util.Map;

public interface Router extends Handler<HttpServerRequest>
{
    List<Route> getRoutes();
    Map<String, Object> metadata();
    Route connect();
    Route connect(String p0);
    Route connectWithRegex(String p0);
    Route delete();
    Route delete(String p0);
    Route deleteWithRegex(String p0);
    Route get();
    Route get(String p0);
    Route getWithRegex(String p0);
    Route head();
    Route head(String p0);
    Route headWithRegex(String p0);
    Route mountSubRouter(String p0, Router p1);
    Route options();
    Route options(String p0);
    Route optionsWithRegex(String p0);
    Route patch();
    Route patch(String p0);
    Route patchWithRegex(String p0);
    Route post();
    Route post(String p0);
    Route postWithRegex(String p0);
    Route put();
    Route put(String p0);
    Route putWithRegex(String p0);
    Route route();
    Route route(String p0);
    Route route(io.vertx.core.http.HttpMethod p0, String p1);
    Route routeWithRegex(String p0);
    Route routeWithRegex(io.vertx.core.http.HttpMethod p0, String p1);
    Route trace();
    Route trace(String p0);
    Route traceWithRegex(String p0);
    Router allowForward(AllowForwardHeaders p0);
    Router clear();
    Router errorHandler(int p0, Handler<RoutingContext> p1);
    Router modifiedHandler(Handler<Router> p0);
    Router putMetadata(String p0, Object p1);
    default <T> T getMetadata(String p0){ return null; }
    static Router router(Vertx p0){ return null; }
    void handleContext(RoutingContext p0);
    void handleFailure(RoutingContext p0);
}
