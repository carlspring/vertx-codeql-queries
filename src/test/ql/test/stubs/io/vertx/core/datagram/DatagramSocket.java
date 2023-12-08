// Generated automatically from io.vertx.core.datagram.DatagramSocket for testing purposes

package io.vertx.core.datagram;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.datagram.DatagramPacket;
import io.vertx.core.metrics.Measured;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.streams.WriteStream;

public interface DatagramSocket extends Measured, ReadStream<DatagramPacket>
{
    DatagramSocket blockMulticastGroup(String p0, String p1, Handler<AsyncResult<Void>> p2);
    DatagramSocket blockMulticastGroup(String p0, String p1, String p2, Handler<AsyncResult<Void>> p3);
    DatagramSocket endHandler(Handler<Void> p0);
    DatagramSocket exceptionHandler(Handler<Throwable> p0);
    DatagramSocket fetch(long p0);
    DatagramSocket handler(Handler<DatagramPacket> p0);
    DatagramSocket listen(int p0, String p1, Handler<AsyncResult<DatagramSocket>> p2);
    DatagramSocket listenMulticastGroup(String p0, Handler<AsyncResult<Void>> p1);
    DatagramSocket listenMulticastGroup(String p0, String p1, String p2, Handler<AsyncResult<Void>> p3);
    DatagramSocket pause();
    DatagramSocket resume();
    DatagramSocket send(Buffer p0, int p1, String p2, Handler<AsyncResult<Void>> p3);
    DatagramSocket send(String p0, String p1, int p2, String p3, Handler<AsyncResult<Void>> p4);
    DatagramSocket send(String p0, int p1, String p2, Handler<AsyncResult<Void>> p3);
    DatagramSocket unlistenMulticastGroup(String p0, Handler<AsyncResult<Void>> p1);
    DatagramSocket unlistenMulticastGroup(String p0, String p1, String p2, Handler<AsyncResult<Void>> p3);
    Future<DatagramSocket> listen(int p0, String p1);
    Future<Void> blockMulticastGroup(String p0, String p1);
    Future<Void> blockMulticastGroup(String p0, String p1, String p2);
    Future<Void> close();
    Future<Void> listenMulticastGroup(String p0);
    Future<Void> listenMulticastGroup(String p0, String p1, String p2);
    Future<Void> send(Buffer p0, int p1, String p2);
    Future<Void> send(String p0, String p1, int p2, String p3);
    Future<Void> send(String p0, int p1, String p2);
    Future<Void> unlistenMulticastGroup(String p0);
    Future<Void> unlistenMulticastGroup(String p0, String p1, String p2);
    WriteStream<Buffer> sender(int p0, String p1);
    io.vertx.core.net.SocketAddress localAddress();
    void close(Handler<AsyncResult<Void>> p0);
}
