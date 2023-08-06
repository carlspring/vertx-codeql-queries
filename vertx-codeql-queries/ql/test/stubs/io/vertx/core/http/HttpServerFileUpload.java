// Generated automatically from io.vertx.core.http.HttpServerFileUpload for testing purposes

package io.vertx.core.http;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.file.AsyncFile;
import io.vertx.core.streams.ReadStream;

public interface HttpServerFileUpload extends ReadStream<Buffer>
{
    AsyncFile file();
    Future<Void> streamToFileSystem(String p0);
    HttpServerFileUpload endHandler(Handler<Void> p0);
    HttpServerFileUpload exceptionHandler(Handler<Throwable> p0);
    HttpServerFileUpload fetch(long p0);
    HttpServerFileUpload handler(Handler<Buffer> p0);
    HttpServerFileUpload pause();
    HttpServerFileUpload resume();
    String charset();
    String contentTransferEncoding();
    String contentType();
    String filename();
    String name();
    boolean cancelStreamToFileSystem();
    boolean isSizeAvailable();
    long size();
    void streamToFileSystem(String p0, Handler<AsyncResult<Void>> p1);
}
