// Generated automatically from io.vertx.ext.web.RoutingContext for testing purposes

package io.vertx.ext.web;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.Cookie;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.ext.web.FileUpload;
import io.vertx.ext.web.LanguageHeader;
import io.vertx.ext.web.ParsedHeaderValues;
import io.vertx.ext.web.RequestBody;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Session;
import java.nio.charset.Charset;
import java.time.Instant;
import java.util.List;
import java.util.Map;

public interface RoutingContext
{
    <T> T get(String p0);
    <T> T get(String p0, T p1);
    <T> T remove(String p0);
    Cookie getCookie(String p0);
    Cookie removeCookie(String p0, boolean p1);
    HttpServerRequest request();
    HttpServerResponse response();
    List<FileUpload> fileUploads();
    List<String> queryParam(String p0);
    Map<String, Cookie> cookieMap();
    Map<String, Object> data();
    Map<String, String> pathParams();
    MultiMap queryParams();
    MultiMap queryParams(Charset p0);
    ParsedHeaderValues parsedHeaders();
    RequestBody body();
    Route currentRoute();
    RoutingContext addCookie(Cookie p0);
    RoutingContext put(String p0, Object p1);
    Session session();
    String getAcceptableContentType();
    String mountPoint();
    String normalizedPath();
    String pathParam(String p0);
    Throwable failure();
    User user();
    Vertx vertx();
    boolean failed();
    boolean isSessionAccessed();
    boolean removeBodyEndHandler(int p0);
    boolean removeEndHandler(int p0);
    boolean removeHeadersEndHandler(int p0);
    default Buffer getBody(){ return null; }
    default Cookie removeCookie(String p0){ return null; }
    default Future<Void> addEndHandler(){ return null; }
    default Future<Void> end(){ return null; }
    default Future<Void> end(Buffer p0){ return null; }
    default Future<Void> end(String p0){ return null; }
    default Future<Void> json(Object p0){ return null; }
    default Future<Void> redirect(String p0){ return null; }
    default JsonArray getBodyAsJsonArray(){ return null; }
    default JsonArray getBodyAsJsonArray(int p0){ return null; }
    default JsonObject getBodyAsJson(){ return null; }
    default JsonObject getBodyAsJson(int p0){ return null; }
    default LanguageHeader preferredLanguage(){ return null; }
    default List<LanguageHeader> acceptableLanguages(){ return null; }
    default RoutingContext attachment(String p0){ return null; }
    default RoutingContext end(Buffer p0, Handler<AsyncResult<Void>> p1){ return null; }
    default RoutingContext end(Handler<AsyncResult<Void>> p0){ return null; }
    default RoutingContext end(String p0, Handler<AsyncResult<Void>> p1){ return null; }
    default RoutingContext etag(String p0){ return null; }
    default RoutingContext json(Object p0, Handler<AsyncResult<Void>> p1){ return null; }
    default RoutingContext lastModified(Instant p0){ return null; }
    default RoutingContext lastModified(String p0){ return null; }
    default RoutingContext redirect(String p0, Handler<AsyncResult<Void>> p1){ return null; }
    default String getBodyAsString(){ return null; }
    default String getBodyAsString(String p0){ return null; }
    default String normalisedPath(){ return null; }
    default boolean is(String p0){ return false; }
    default boolean isFresh(){ return false; }
    default void reroute(String p0){}
    int addBodyEndHandler(Handler<Void> p0);
    int addEndHandler(Handler<AsyncResult<Void>> p0);
    int addHeadersEndHandler(Handler<Void> p0);
    int cookieCount();
    int statusCode();
    void clearUser();
    void fail(Throwable p0);
    void fail(int p0);
    void fail(int p0, Throwable p1);
    void next();
    void reroute(io.vertx.core.http.HttpMethod p0, String p1);
    void setAcceptableContentType(String p0);
    void setBody(Buffer p0);
    void setSession(Session p0);
    void setUser(User p0);
}
