// Generated automatically from io.vertx.core.net.SocketAddress for testing purposes

package io.vertx.core.net;

import java.net.InetSocketAddress;

public interface SocketAddress
{
    String host();
    String hostAddress();
    String hostName();
    String path();
    boolean isDomainSocket();
    boolean isInetSocket();
    int port();
    static io.vertx.core.net.SocketAddress domainSocketAddress(String p0){ return null; }
    static io.vertx.core.net.SocketAddress inetSocketAddress(InetSocketAddress p0){ return null; }
    static io.vertx.core.net.SocketAddress inetSocketAddress(int p0, String p1){ return null; }
    static io.vertx.core.net.SocketAddress sharedRandomPort(int p0, String p1){ return null; }
}
