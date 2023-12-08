// Generated automatically from io.vertx.core.net.NetClient for testing purposes

package io.vertx.core.net;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.NetSocket;
import io.vertx.core.net.SSLOptions;

public interface NetClient extends Measured
{
    Future<NetSocket> connect(int p0, String p1);
    Future<NetSocket> connect(int p0, String p1, String p2);
    Future<NetSocket> connect(io.vertx.core.net.SocketAddress p0);
    Future<NetSocket> connect(io.vertx.core.net.SocketAddress p0, String p1);
    Future<Void> close();
    Future<Void> updateSSLOptions(SSLOptions p0);
    NetClient connect(int p0, String p1, Handler<AsyncResult<NetSocket>> p2);
    NetClient connect(int p0, String p1, String p2, Handler<AsyncResult<NetSocket>> p3);
    NetClient connect(io.vertx.core.net.SocketAddress p0, Handler<AsyncResult<NetSocket>> p1);
    NetClient connect(io.vertx.core.net.SocketAddress p0, String p1, Handler<AsyncResult<NetSocket>> p2);
    default void updateSSLOptions(SSLOptions p0, Handler<AsyncResult<Void>> p1){}
    void close(Handler<AsyncResult<Void>> p0);
}
