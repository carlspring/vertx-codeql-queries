// Generated automatically from io.vertx.core.file.AsyncFile for testing purposes

package io.vertx.core.file;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.file.AsyncFileLock;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.streams.WriteStream;

public interface AsyncFile extends ReadStream<Buffer>, WriteStream<Buffer>
{
    AsyncFile drainHandler(Handler<Void> p0);
    AsyncFile endHandler(Handler<Void> p0);
    AsyncFile exceptionHandler(Handler<Throwable> p0);
    AsyncFile fetch(long p0);
    AsyncFile flush(Handler<AsyncResult<Void>> p0);
    AsyncFile handler(Handler<Buffer> p0);
    AsyncFile pause();
    AsyncFile read(Buffer p0, int p1, long p2, int p3, Handler<AsyncResult<Buffer>> p4);
    AsyncFile resume();
    AsyncFile setReadBufferSize(int p0);
    AsyncFile setReadLength(long p0);
    AsyncFile setReadPos(long p0);
    AsyncFile setWritePos(long p0);
    AsyncFile setWriteQueueMaxSize(int p0);
    AsyncFileLock tryLock();
    AsyncFileLock tryLock(long p0, long p1, boolean p2);
    Future<AsyncFileLock> lock();
    Future<AsyncFileLock> lock(long p0, long p1, boolean p2);
    Future<Buffer> read(Buffer p0, int p1, long p2, int p3);
    Future<Long> size();
    Future<Void> close();
    Future<Void> flush();
    Future<Void> write(Buffer p0, long p1);
    default void size(Handler<AsyncResult<Long>> p0){}
    long getReadLength();
    long getWritePos();
    long sizeBlocking();
    void close(Handler<AsyncResult<Void>> p0);
    void lock(Handler<AsyncResult<AsyncFileLock>> p0);
    void lock(long p0, long p1, boolean p2, Handler<AsyncResult<AsyncFileLock>> p3);
    void write(Buffer p0, long p1, Handler<AsyncResult<Void>> p2);
}
