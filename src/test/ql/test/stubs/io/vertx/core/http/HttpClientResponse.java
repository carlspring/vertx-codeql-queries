// Generated automatically from io.vertx.core.http.HttpClientResponse for testing purposes

package io.vertx.core.http;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpClientRequest;
import io.vertx.core.http.HttpFrame;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.http.StreamPriority;
import io.vertx.core.net.NetSocket;
import io.vertx.core.streams.ReadStream;
import java.util.List;

public interface HttpClientResponse extends ReadStream<Buffer>
{
    Future<Buffer> body();
    Future<Void> end();
    HttpClientRequest request();
    HttpClientResponse customFrameHandler(Handler<HttpFrame> p0);
    HttpClientResponse endHandler(Handler<Void> p0);
    HttpClientResponse exceptionHandler(Handler<Throwable> p0);
    HttpClientResponse fetch(long p0);
    HttpClientResponse handler(Handler<Buffer> p0);
    HttpClientResponse pause();
    HttpClientResponse resume();
    HttpClientResponse streamPriorityHandler(Handler<StreamPriority> p0);
    HttpVersion version();
    List<String> cookies();
    MultiMap headers();
    MultiMap trailers();
    NetSocket netSocket();
    String getHeader(CharSequence p0);
    String getHeader(String p0);
    String getTrailer(String p0);
    String statusMessage();
    default HttpClientResponse body(Handler<AsyncResult<Buffer>> p0){ return null; }
    default HttpClientResponse bodyHandler(Handler<Buffer> p0){ return null; }
    default void end(Handler<AsyncResult<Void>> p0){}
    int statusCode();
}
