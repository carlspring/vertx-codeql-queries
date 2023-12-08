// Generated automatically from io.vertx.core.http.HttpServerRequest for testing purposes

package io.vertx.core.http;

import io.netty.handler.codec.DecoderResult;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.Cookie;
import io.vertx.core.http.HttpConnection;
import io.vertx.core.http.HttpFrame;
import io.vertx.core.http.HttpServerFileUpload;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.http.ServerWebSocket;
import io.vertx.core.http.StreamPriority;
import io.vertx.core.net.NetSocket;
import io.vertx.core.streams.ReadStream;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSession;
import javax.security.cert.X509Certificate;

public interface HttpServerRequest extends ReadStream<Buffer>
{
    Cookie getCookie(String p0);
    Cookie getCookie(String p0, String p1, String p2);
    DecoderResult decoderResult();
    Future<Buffer> body();
    Future<NetSocket> toNetSocket();
    Future<ServerWebSocket> toWebSocket();
    Future<Void> end();
    HttpConnection connection();
    HttpServerRequest customFrameHandler(Handler<HttpFrame> p0);
    HttpServerRequest endHandler(Handler<Void> p0);
    HttpServerRequest exceptionHandler(Handler<Throwable> p0);
    HttpServerRequest fetch(long p0);
    HttpServerRequest handler(Handler<Buffer> p0);
    HttpServerRequest pause();
    HttpServerRequest resume();
    HttpServerRequest setExpectMultipart(boolean p0);
    HttpServerRequest setParamsCharset(String p0);
    HttpServerRequest streamPriorityHandler(Handler<StreamPriority> p0);
    HttpServerRequest uploadHandler(Handler<HttpServerFileUpload> p0);
    HttpServerResponse response();
    HttpVersion version();
    MultiMap formAttributes();
    MultiMap headers();
    MultiMap params();
    Set<Cookie> cookies();
    Set<Cookie> cookies(String p0);
    String absoluteURI();
    String getFormAttribute(String p0);
    String getParamsCharset();
    String host();
    String path();
    String query();
    String scheme();
    String uri();
    X509Certificate[] peerCertificateChain();
    boolean isEnded();
    boolean isExpectMultipart();
    default HttpServerRequest body(Handler<AsyncResult<Buffer>> p0){ return null; }
    default HttpServerRequest bodyHandler(Handler<Buffer> p0){ return null; }
    default HttpServerRequest routed(String p0){ return null; }
    default Map<String, Cookie> cookieMap(){ return null; }
    default SSLSession sslSession(){ return null; }
    default StreamPriority streamPriority(){ return null; }
    default String getHeader(CharSequence p0){ return null; }
    default String getHeader(String p0){ return null; }
    default String getParam(String p0){ return null; }
    default String getParam(String p0, String p1){ return null; }
    default boolean isSSL(){ return false; }
    default int cookieCount(){ return 0; }
    default int streamId(){ return 0; }
    default io.vertx.core.net.SocketAddress localAddress(){ return null; }
    default io.vertx.core.net.SocketAddress remoteAddress(){ return null; }
    default void end(Handler<AsyncResult<Void>> p0){}
    default void toNetSocket(Handler<AsyncResult<NetSocket>> p0){}
    default void toWebSocket(Handler<AsyncResult<ServerWebSocket>> p0){}
    io.vertx.core.http.HttpMethod method();
    long bytesRead();
    static Handler<HttpServerRequest> DEFAULT_INVALID_REQUEST_HANDLER = null;
}
