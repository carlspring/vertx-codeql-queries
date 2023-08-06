// Generated automatically from io.vertx.core.http.WebSocketBase for testing purposes

package io.vertx.core.http;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.WebSocketFrame;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.streams.WriteStream;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLSession;
import javax.security.cert.X509Certificate;

public interface WebSocketBase extends ReadStream<Buffer>, WriteStream<Buffer>
{
    Future<Void> close();
    Future<Void> close(short p0);
    Future<Void> close(short p0, String p1);
    Future<Void> end();
    Future<Void> writeBinaryMessage(Buffer p0);
    Future<Void> writeFinalBinaryFrame(Buffer p0);
    Future<Void> writeFinalTextFrame(String p0);
    Future<Void> writeFrame(WebSocketFrame p0);
    Future<Void> writePing(Buffer p0);
    Future<Void> writePong(Buffer p0);
    Future<Void> writeTextMessage(String p0);
    List<Certificate> peerCertificates();
    MultiMap headers();
    SSLSession sslSession();
    Short closeStatusCode();
    String binaryHandlerID();
    String closeReason();
    String subProtocol();
    String textHandlerID();
    WebSocketBase binaryMessageHandler(Handler<Buffer> p0);
    WebSocketBase closeHandler(Handler<Void> p0);
    WebSocketBase drainHandler(Handler<Void> p0);
    WebSocketBase endHandler(Handler<Void> p0);
    WebSocketBase exceptionHandler(Handler<Throwable> p0);
    WebSocketBase fetch(long p0);
    WebSocketBase frameHandler(Handler<WebSocketFrame> p0);
    WebSocketBase handler(Handler<Buffer> p0);
    WebSocketBase pause();
    WebSocketBase pongHandler(Handler<Buffer> p0);
    WebSocketBase resume();
    WebSocketBase setWriteQueueMaxSize(int p0);
    WebSocketBase textMessageHandler(Handler<String> p0);
    WebSocketBase writeBinaryMessage(Buffer p0, Handler<AsyncResult<Void>> p1);
    WebSocketBase writeFinalBinaryFrame(Buffer p0, Handler<AsyncResult<Void>> p1);
    WebSocketBase writeFinalTextFrame(String p0, Handler<AsyncResult<Void>> p1);
    WebSocketBase writeFrame(WebSocketFrame p0, Handler<AsyncResult<Void>> p1);
    WebSocketBase writePing(Buffer p0, Handler<AsyncResult<Void>> p1);
    WebSocketBase writePong(Buffer p0, Handler<AsyncResult<Void>> p1);
    WebSocketBase writeTextMessage(String p0, Handler<AsyncResult<Void>> p1);
    X509Certificate[] peerCertificateChain();
    boolean isClosed();
    boolean isSsl();
    io.vertx.core.net.SocketAddress localAddress();
    io.vertx.core.net.SocketAddress remoteAddress();
    void close(Handler<AsyncResult<Void>> p0);
    void close(short p0, Handler<AsyncResult<Void>> p1);
    void close(short p0, String p1, Handler<AsyncResult<Void>> p2);
    void end(Handler<AsyncResult<Void>> p0);
}
