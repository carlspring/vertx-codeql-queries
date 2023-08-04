// Generated automatically from io.vertx.core.net.NetServer for testing purposes

package io.vertx.core.net;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.NetSocket;
import io.vertx.core.net.SSLOptions;
import io.vertx.core.streams.ReadStream;

public interface NetServer extends Measured
{
    Future<NetServer> listen();
    Future<NetServer> listen(io.vertx.core.net.SocketAddress p0);
    Future<Void> close();
    Future<Void> updateSSLOptions(SSLOptions p0);
    Handler<NetSocket> connectHandler();
    NetServer connectHandler(Handler<NetSocket> p0);
    NetServer exceptionHandler(Handler<Throwable> p0);
    ReadStream<NetSocket> connectStream();
    default Future<NetServer> listen(int p0){ return null; }
    default Future<NetServer> listen(int p0, String p1){ return null; }
    default NetServer listen(Handler<AsyncResult<NetServer>> p0){ return null; }
    default NetServer listen(int p0, Handler<AsyncResult<NetServer>> p1){ return null; }
    default NetServer listen(int p0, String p1, Handler<AsyncResult<NetServer>> p2){ return null; }
    default NetServer listen(io.vertx.core.net.SocketAddress p0, Handler<AsyncResult<NetServer>> p1){ return null; }
    default void updateSSLOptions(SSLOptions p0, Handler<AsyncResult<Void>> p1){}
    int actualPort();
    void close(Handler<AsyncResult<Void>> p0);
}
