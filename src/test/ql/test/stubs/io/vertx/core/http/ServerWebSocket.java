// Generated automatically from io.vertx.core.http.ServerWebSocket for testing purposes

package io.vertx.core.http;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.WebSocketBase;
import io.vertx.core.http.WebSocketFrame;
import javax.net.ssl.SSLSession;

public interface ServerWebSocket extends WebSocketBase
{
    Future<Integer> setHandshake(Future<Integer> p0);
    Future<Void> close();
    SSLSession sslSession();
    ServerWebSocket closeHandler(Handler<Void> p0);
    ServerWebSocket drainHandler(Handler<Void> p0);
    ServerWebSocket endHandler(Handler<Void> p0);
    ServerWebSocket exceptionHandler(Handler<Throwable> p0);
    ServerWebSocket fetch(long p0);
    ServerWebSocket frameHandler(Handler<WebSocketFrame> p0);
    ServerWebSocket handler(Handler<Buffer> p0);
    ServerWebSocket pause();
    ServerWebSocket resume();
    ServerWebSocket setWriteQueueMaxSize(int p0);
    ServerWebSocket writeBinaryMessage(Buffer p0, Handler<AsyncResult<Void>> p1);
    ServerWebSocket writeFinalBinaryFrame(Buffer p0, Handler<AsyncResult<Void>> p1);
    ServerWebSocket writeFinalTextFrame(String p0, Handler<AsyncResult<Void>> p1);
    ServerWebSocket writeFrame(WebSocketFrame p0, Handler<AsyncResult<Void>> p1);
    ServerWebSocket writeTextMessage(String p0, Handler<AsyncResult<Void>> p1);
    String host();
    String path();
    String query();
    String scheme();
    String uri();
    void accept();
    void reject();
    void reject(int p0);
    void setHandshake(Future<Integer> p0, Handler<AsyncResult<Integer>> p1);
}
