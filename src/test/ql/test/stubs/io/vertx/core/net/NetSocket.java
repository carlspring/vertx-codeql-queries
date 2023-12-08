// Generated automatically from io.vertx.core.net.NetSocket for testing purposes

package io.vertx.core.net;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.streams.WriteStream;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLSession;
import javax.security.cert.X509Certificate;

public interface NetSocket extends ReadStream<Buffer>, WriteStream<Buffer>
{
    Future<Void> close();
    Future<Void> end();
    Future<Void> sendFile(String p0, long p1, long p2);
    Future<Void> upgradeToSsl();
    Future<Void> upgradeToSsl(String p0);
    Future<Void> write(String p0);
    Future<Void> write(String p0, String p1);
    List<Certificate> peerCertificates();
    NetSocket closeHandler(Handler<Void> p0);
    NetSocket drainHandler(Handler<Void> p0);
    NetSocket endHandler(Handler<Void> p0);
    NetSocket exceptionHandler(Handler<Throwable> p0);
    NetSocket fetch(long p0);
    NetSocket handler(Handler<Buffer> p0);
    NetSocket pause();
    NetSocket resume();
    NetSocket sendFile(String p0, long p1, long p2, Handler<AsyncResult<Void>> p3);
    NetSocket setWriteQueueMaxSize(int p0);
    NetSocket upgradeToSsl(Handler<AsyncResult<Void>> p0);
    NetSocket upgradeToSsl(String p0, Handler<AsyncResult<Void>> p1);
    SSLSession sslSession();
    String applicationLayerProtocol();
    String indicatedServerName();
    String writeHandlerID();
    X509Certificate[] peerCertificateChain();
    boolean isSsl();
    default Future<Void> sendFile(String p0){ return null; }
    default Future<Void> sendFile(String p0, long p1){ return null; }
    default NetSocket sendFile(String p0, Handler<AsyncResult<Void>> p1){ return null; }
    default NetSocket sendFile(String p0, long p1, Handler<AsyncResult<Void>> p2){ return null; }
    io.vertx.core.net.SocketAddress localAddress();
    io.vertx.core.net.SocketAddress localAddress(boolean p0);
    io.vertx.core.net.SocketAddress remoteAddress();
    io.vertx.core.net.SocketAddress remoteAddress(boolean p0);
    void close(Handler<AsyncResult<Void>> p0);
    void end(Handler<AsyncResult<Void>> p0);
    void write(Buffer p0, Handler<AsyncResult<Void>> p1);
    void write(String p0, Handler<AsyncResult<Void>> p1);
    void write(String p0, String p1, Handler<AsyncResult<Void>> p2);
}
