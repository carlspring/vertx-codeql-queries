// Generated automatically from io.vertx.core.http.HttpServerResponse for testing purposes

package io.vertx.core.http;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.Cookie;
import io.vertx.core.http.HttpFrame;
import io.vertx.core.http.StreamPriority;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.streams.WriteStream;
import java.util.Set;

public interface HttpServerResponse extends WriteStream<Buffer>
{
    Cookie removeCookie(String p0, String p1, String p2, boolean p3);
    Cookie removeCookie(String p0, boolean p1);
    Future<HttpServerResponse> push(io.vertx.core.http.HttpMethod p0, String p1, String p2, MultiMap p3);
    Future<Void> end();
    Future<Void> end(Buffer p0);
    Future<Void> end(String p0);
    Future<Void> end(String p0, String p1);
    Future<Void> sendFile(String p0, long p1, long p2);
    Future<Void> write(String p0);
    Future<Void> write(String p0, String p1);
    Future<Void> writeEarlyHints(MultiMap p0);
    HttpServerResponse addCookie(Cookie p0);
    HttpServerResponse bodyEndHandler(Handler<Void> p0);
    HttpServerResponse closeHandler(Handler<Void> p0);
    HttpServerResponse drainHandler(Handler<Void> p0);
    HttpServerResponse endHandler(Handler<Void> p0);
    HttpServerResponse exceptionHandler(Handler<Throwable> p0);
    HttpServerResponse headersEndHandler(Handler<Void> p0);
    HttpServerResponse putHeader(CharSequence p0, CharSequence p1);
    HttpServerResponse putHeader(CharSequence p0, Iterable<CharSequence> p1);
    HttpServerResponse putHeader(String p0, Iterable<String> p1);
    HttpServerResponse putHeader(String p0, String p1);
    HttpServerResponse putTrailer(CharSequence p0, CharSequence p1);
    HttpServerResponse putTrailer(CharSequence p0, Iterable<CharSequence> p1);
    HttpServerResponse putTrailer(String p0, Iterable<String> p1);
    HttpServerResponse putTrailer(String p0, String p1);
    HttpServerResponse sendFile(String p0, long p1, long p2, Handler<AsyncResult<Void>> p3);
    HttpServerResponse setChunked(boolean p0);
    HttpServerResponse setStatusCode(int p0);
    HttpServerResponse setStatusMessage(String p0);
    HttpServerResponse setWriteQueueMaxSize(int p0);
    HttpServerResponse writeContinue();
    HttpServerResponse writeCustomFrame(int p0, int p1, Buffer p2);
    MultiMap headers();
    MultiMap trailers();
    Set<Cookie> removeCookies(String p0, boolean p1);
    String getStatusMessage();
    boolean closed();
    boolean ended();
    boolean headWritten();
    boolean isChunked();
    boolean reset(long p0);
    default Cookie removeCookie(String p0){ return null; }
    default Cookie removeCookie(String p0, String p1, String p2){ return null; }
    default Future<HttpServerResponse> push(io.vertx.core.http.HttpMethod p0, String p1){ return null; }
    default Future<HttpServerResponse> push(io.vertx.core.http.HttpMethod p0, String p1, MultiMap p2){ return null; }
    default Future<HttpServerResponse> push(io.vertx.core.http.HttpMethod p0, String p1, String p2){ return null; }
    default Future<Void> send(){ return null; }
    default Future<Void> send(Buffer p0){ return null; }
    default Future<Void> send(ReadStream<Buffer> p0){ return null; }
    default Future<Void> send(String p0){ return null; }
    default Future<Void> sendFile(String p0){ return null; }
    default Future<Void> sendFile(String p0, long p1){ return null; }
    default HttpServerResponse push(io.vertx.core.http.HttpMethod p0, String p1, Handler<AsyncResult<HttpServerResponse>> p2){ return null; }
    default HttpServerResponse push(io.vertx.core.http.HttpMethod p0, String p1, MultiMap p2, Handler<AsyncResult<HttpServerResponse>> p3){ return null; }
    default HttpServerResponse push(io.vertx.core.http.HttpMethod p0, String p1, String p2, Handler<AsyncResult<HttpServerResponse>> p3){ return null; }
    default HttpServerResponse push(io.vertx.core.http.HttpMethod p0, String p1, String p2, MultiMap p3, Handler<AsyncResult<HttpServerResponse>> p4){ return null; }
    default HttpServerResponse sendFile(String p0, Handler<AsyncResult<Void>> p1){ return null; }
    default HttpServerResponse sendFile(String p0, long p1, Handler<AsyncResult<Void>> p2){ return null; }
    default HttpServerResponse setStreamPriority(StreamPriority p0){ return null; }
    default HttpServerResponse writeCustomFrame(HttpFrame p0){ return null; }
    default Set<Cookie> removeCookies(String p0){ return null; }
    default boolean reset(){ return false; }
    default void send(Buffer p0, Handler<AsyncResult<Void>> p1){}
    default void send(Handler<AsyncResult<Void>> p0){}
    default void send(ReadStream<Buffer> p0, Handler<AsyncResult<Void>> p1){}
    default void send(String p0, Handler<AsyncResult<Void>> p1){}
    int getStatusCode();
    int streamId();
    long bytesWritten();
    void close();
    void end(Buffer p0, Handler<AsyncResult<Void>> p1);
    void end(String p0, Handler<AsyncResult<Void>> p1);
    void end(String p0, String p1, Handler<AsyncResult<Void>> p2);
    void write(String p0, Handler<AsyncResult<Void>> p1);
    void write(String p0, String p1, Handler<AsyncResult<Void>> p2);
    void writeEarlyHints(MultiMap p0, Handler<AsyncResult<Void>> p1);
}
