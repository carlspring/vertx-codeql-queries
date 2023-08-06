// Generated automatically from io.vertx.core.http.HttpServer for testing purposes

package io.vertx.core.http;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.http.HttpConnection;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.ServerWebSocket;
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.SSLOptions;
import io.vertx.core.streams.ReadStream;

public interface HttpServer extends Measured
{
    Future<HttpServer> listen();
    Future<HttpServer> listen(io.vertx.core.net.SocketAddress p0);
    Future<Void> close();
    Future<Void> updateSSLOptions(SSLOptions p0);
    Handler<HttpServerRequest> requestHandler();
    Handler<ServerWebSocket> webSocketHandler();
    HttpServer connectionHandler(Handler<HttpConnection> p0);
    HttpServer exceptionHandler(Handler<Throwable> p0);
    HttpServer invalidRequestHandler(Handler<HttpServerRequest> p0);
    HttpServer requestHandler(Handler<HttpServerRequest> p0);
    HttpServer webSocketHandler(Handler<ServerWebSocket> p0);
    ReadStream<HttpServerRequest> requestStream();
    ReadStream<ServerWebSocket> webSocketStream();
    default Future<HttpServer> listen(int p0){ return null; }
    default Future<HttpServer> listen(int p0, String p1){ return null; }
    default HttpServer listen(Handler<AsyncResult<HttpServer>> p0){ return null; }
    default HttpServer listen(int p0, Handler<AsyncResult<HttpServer>> p1){ return null; }
    default HttpServer listen(int p0, String p1, Handler<AsyncResult<HttpServer>> p2){ return null; }
    default HttpServer listen(io.vertx.core.net.SocketAddress p0, Handler<AsyncResult<HttpServer>> p1){ return null; }
    default void updateSSLOptions(SSLOptions p0, Handler<AsyncResult<Void>> p1){}
    int actualPort();
    void close(Handler<AsyncResult<Void>> p0);
}
