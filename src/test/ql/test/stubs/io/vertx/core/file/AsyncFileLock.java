// Generated automatically from io.vertx.core.file.AsyncFileLock for testing purposes

package io.vertx.core.file;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;

public interface AsyncFileLock
{
    Future<Boolean> isValid();
    Future<Void> release();
    boolean isShared();
    boolean isValidBlocking();
    boolean overlaps(long p0, long p1);
    long position();
    long size();
    void isValid(Handler<AsyncResult<Boolean>> p0);
    void release(Handler<AsyncResult<Void>> p0);
    void releaseBlocking();
}
