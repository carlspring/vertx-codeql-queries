// Generated automatically from io.vertx.core.http.WebSocket for testing purposes

package io.vertx.core.http;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.WebSocketBase;
import io.vertx.core.http.WebSocketFrame;

public interface WebSocket extends WebSocketBase
{
    WebSocket closeHandler(Handler<Void> p0);
    WebSocket drainHandler(Handler<Void> p0);
    WebSocket endHandler(Handler<Void> p0);
    WebSocket exceptionHandler(Handler<Throwable> p0);
    WebSocket fetch(long p0);
    WebSocket frameHandler(Handler<WebSocketFrame> p0);
    WebSocket handler(Handler<Buffer> p0);
    WebSocket pause();
    WebSocket resume();
    WebSocket setWriteQueueMaxSize(int p0);
    WebSocket writeBinaryMessage(Buffer p0, Handler<AsyncResult<Void>> p1);
    WebSocket writeFinalBinaryFrame(Buffer p0, Handler<AsyncResult<Void>> p1);
    WebSocket writeFinalTextFrame(String p0, Handler<AsyncResult<Void>> p1);
    WebSocket writeFrame(WebSocketFrame p0, Handler<AsyncResult<Void>> p1);
    WebSocket writeTextMessage(String p0, Handler<AsyncResult<Void>> p1);
}
