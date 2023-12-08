// Generated automatically from io.vertx.core.Context for testing purposes

package io.vertx.core;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import java.util.List;

public interface Context
{
    <T> T get(Object p0);
    <T> T getLocal(Object p0);
    <T> io.vertx.core.Future<T> executeBlocking(io.vertx.core.Handler<io.vertx.core.Promise<T>> p0, boolean p1);
    <T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Promise<T>> p0, boolean p1, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> p2);
    Context exceptionHandler(Handler<Throwable> p0);
    Handler<Throwable> exceptionHandler();
    JsonObject config();
    String deploymentID();
    Vertx owner();
    boolean isEventLoopContext();
    boolean isWorkerContext();
    boolean remove(Object p0);
    boolean removeLocal(Object p0);
    default <T> io.vertx.core.Future<T> executeBlocking(io.vertx.core.Handler<io.vertx.core.Promise<T>> p0){ return null; }
    default <T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Promise<T>> p0, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> p1){}
    default List<String> processArgs(){ return null; }
    int getInstanceCount();
    static boolean isOnEventLoopThread(){ return false; }
    static boolean isOnVertxThread(){ return false; }
    static boolean isOnWorkerThread(){ return false; }
    void put(Object p0, Object p1);
    void putLocal(Object p0, Object p1);
    void runOnContext(Handler<Void> p0);
}
