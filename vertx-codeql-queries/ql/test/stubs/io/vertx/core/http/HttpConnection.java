// Generated automatically from io.vertx.core.http.HttpConnection for testing purposes

package io.vertx.core.http;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.GoAway;
import io.vertx.core.http.Http2Settings;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLSession;
import javax.security.cert.X509Certificate;

public interface HttpConnection
{
    Future<Buffer> ping(Buffer p0);
    Future<Void> close();
    Future<Void> shutdown(long p0);
    Future<Void> updateSettings(Http2Settings p0);
    Http2Settings remoteSettings();
    Http2Settings settings();
    HttpConnection closeHandler(Handler<Void> p0);
    HttpConnection exceptionHandler(Handler<Throwable> p0);
    HttpConnection goAway(long p0, int p1, Buffer p2);
    HttpConnection goAwayHandler(Handler<GoAway> p0);
    HttpConnection ping(Buffer p0, Handler<AsyncResult<Buffer>> p1);
    HttpConnection pingHandler(Handler<Buffer> p0);
    HttpConnection remoteSettingsHandler(Handler<Http2Settings> p0);
    HttpConnection shutdownHandler(Handler<Void> p0);
    HttpConnection updateSettings(Http2Settings p0, Handler<AsyncResult<Void>> p1);
    List<Certificate> peerCertificates();
    SSLSession sslSession();
    String indicatedServerName();
    X509Certificate[] peerCertificateChain();
    boolean isSsl();
    default Future<Void> shutdown(){ return null; }
    default HttpConnection goAway(long p0){ return null; }
    default HttpConnection goAway(long p0, int p1){ return null; }
    default HttpConnection setWindowSize(int p0){ return null; }
    default int getWindowSize(){ return 0; }
    default void close(Handler<AsyncResult<Void>> p0){}
    default void shutdown(Handler<AsyncResult<Void>> p0){}
    io.vertx.core.net.SocketAddress localAddress();
    io.vertx.core.net.SocketAddress localAddress(boolean p0);
    io.vertx.core.net.SocketAddress remoteAddress();
    io.vertx.core.net.SocketAddress remoteAddress(boolean p0);
    void shutdown(long p0, Handler<AsyncResult<Void>> p1);
}
