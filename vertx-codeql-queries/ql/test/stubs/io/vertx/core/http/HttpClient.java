// Generated automatically from io.vertx.core.http.HttpClient for testing purposes

package io.vertx.core.http;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.http.HttpClientRequest;
import io.vertx.core.http.HttpClientResponse;
import io.vertx.core.http.HttpConnection;
import io.vertx.core.http.RequestOptions;
import io.vertx.core.http.WebSocket;
import io.vertx.core.http.WebSocketConnectOptions;
import io.vertx.core.http.WebsocketVersion;
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.SSLOptions;
import java.util.List;
import java.util.function.Function;

public interface HttpClient extends Measured
{
    Function<HttpClientResponse, Future<RequestOptions>> redirectHandler();
    Future<HttpClientRequest> request(RequestOptions p0);
    Future<HttpClientRequest> request(io.vertx.core.http.HttpMethod p0, String p1);
    Future<HttpClientRequest> request(io.vertx.core.http.HttpMethod p0, String p1, String p2);
    Future<HttpClientRequest> request(io.vertx.core.http.HttpMethod p0, int p1, String p2, String p3);
    Future<Void> close();
    Future<Void> updateSSLOptions(SSLOptions p0);
    Future<WebSocket> webSocket(String p0);
    Future<WebSocket> webSocket(String p0, String p1);
    Future<WebSocket> webSocket(WebSocketConnectOptions p0);
    Future<WebSocket> webSocket(int p0, String p1, String p2);
    Future<WebSocket> webSocketAbs(String p0, MultiMap p1, WebsocketVersion p2, List<String> p3);
    HttpClient connectionHandler(Handler<HttpConnection> p0);
    HttpClient redirectHandler(Function<HttpClientResponse, Future<RequestOptions>> p0);
    default void updateSSLOptions(SSLOptions p0, Handler<AsyncResult<Void>> p1){}
    void close(Handler<AsyncResult<Void>> p0);
    void request(RequestOptions p0, Handler<AsyncResult<HttpClientRequest>> p1);
    void request(io.vertx.core.http.HttpMethod p0, String p1, Handler<AsyncResult<HttpClientRequest>> p2);
    void request(io.vertx.core.http.HttpMethod p0, String p1, String p2, Handler<AsyncResult<HttpClientRequest>> p3);
    void request(io.vertx.core.http.HttpMethod p0, int p1, String p2, String p3, Handler<AsyncResult<HttpClientRequest>> p4);
    void webSocket(String p0, Handler<AsyncResult<WebSocket>> p1);
    void webSocket(String p0, String p1, Handler<AsyncResult<WebSocket>> p2);
    void webSocket(WebSocketConnectOptions p0, Handler<AsyncResult<WebSocket>> p1);
    void webSocket(int p0, String p1, String p2, Handler<AsyncResult<WebSocket>> p3);
    void webSocketAbs(String p0, MultiMap p1, WebsocketVersion p2, List<String> p3, Handler<AsyncResult<WebSocket>> p4);
}
