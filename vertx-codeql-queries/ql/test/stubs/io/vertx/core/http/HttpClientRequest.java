// Generated automatically from io.vertx.core.http.HttpClientRequest for testing purposes

package io.vertx.core.http;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpClientResponse;
import io.vertx.core.http.HttpConnection;
import io.vertx.core.http.HttpFrame;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.http.StreamPriority;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.streams.WriteStream;

public interface HttpClientRequest extends WriteStream<Buffer>
{
    Future<HttpClientResponse> connect();
    Future<HttpClientResponse> response();
    Future<Void> end();
    Future<Void> end(Buffer p0);
    Future<Void> end(String p0);
    Future<Void> end(String p0, String p1);
    Future<Void> sendHead();
    Future<Void> write(String p0);
    Future<Void> write(String p0, String p1);
    HttpClientRequest continueHandler(Handler<Void> p0);
    HttpClientRequest drainHandler(Handler<Void> p0);
    HttpClientRequest earlyHintsHandler(Handler<MultiMap> p0);
    HttpClientRequest exceptionHandler(Handler<Throwable> p0);
    HttpClientRequest pushHandler(Handler<HttpClientRequest> p0);
    HttpClientRequest putHeader(CharSequence p0, CharSequence p1);
    HttpClientRequest putHeader(CharSequence p0, Iterable<CharSequence> p1);
    HttpClientRequest putHeader(String p0, Iterable<String> p1);
    HttpClientRequest putHeader(String p0, String p1);
    HttpClientRequest response(Handler<AsyncResult<HttpClientResponse>> p0);
    HttpClientRequest sendHead(Handler<AsyncResult<Void>> p0);
    HttpClientRequest setChunked(boolean p0);
    HttpClientRequest setFollowRedirects(boolean p0);
    HttpClientRequest setHost(String p0);
    HttpClientRequest setMaxRedirects(int p0);
    HttpClientRequest setMethod(io.vertx.core.http.HttpMethod p0);
    HttpClientRequest setPort(int p0);
    HttpClientRequest setTimeout(long p0);
    HttpClientRequest setURI(String p0);
    HttpClientRequest setWriteQueueMaxSize(int p0);
    HttpClientRequest writeCustomFrame(int p0, int p1, Buffer p2);
    HttpConnection connection();
    HttpVersion version();
    MultiMap headers();
    StreamPriority getStreamPriority();
    String absoluteURI();
    String getHost();
    String getURI();
    String path();
    String query();
    boolean isChunked();
    boolean reset(long p0);
    boolean reset(long p0, Throwable p1);
    default Future<HttpClientResponse> send(){ return null; }
    default Future<HttpClientResponse> send(Buffer p0){ return null; }
    default Future<HttpClientResponse> send(ReadStream<Buffer> p0){ return null; }
    default Future<HttpClientResponse> send(String p0){ return null; }
    default HttpClientRequest setStreamPriority(StreamPriority p0){ return null; }
    default HttpClientRequest writeCustomFrame(HttpFrame p0){ return null; }
    default boolean reset(){ return false; }
    default int streamId(){ return 0; }
    default void send(Buffer p0, Handler<AsyncResult<HttpClientResponse>> p1){}
    default void send(Handler<AsyncResult<HttpClientResponse>> p0){}
    default void send(ReadStream<Buffer> p0, Handler<AsyncResult<HttpClientResponse>> p1){}
    default void send(String p0, Handler<AsyncResult<HttpClientResponse>> p1){}
    int getPort();
    io.vertx.core.http.HttpMethod getMethod();
    void connect(Handler<AsyncResult<HttpClientResponse>> p0);
    void end(Buffer p0, Handler<AsyncResult<Void>> p1);
    void end(Handler<AsyncResult<Void>> p0);
    void end(String p0, Handler<AsyncResult<Void>> p1);
    void end(String p0, String p1, Handler<AsyncResult<Void>> p2);
    void write(String p0, Handler<AsyncResult<Void>> p1);
    void write(String p0, String p1, Handler<AsyncResult<Void>> p2);
}
