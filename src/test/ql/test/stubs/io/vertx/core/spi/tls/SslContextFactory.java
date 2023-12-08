// Generated automatically from io.vertx.core.spi.tls.SslContextFactory for testing purposes

package io.vertx.core.spi.tls;

import io.netty.handler.ssl.ClientAuth;
import io.netty.handler.ssl.SslContext;
import java.util.List;
import java.util.Set;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;

public interface SslContextFactory
{
    SslContext create();
    default SslContextFactory applicationProtocols(List<String> p0){ return null; }
    default SslContextFactory clientAuth(ClientAuth p0){ return null; }
    default SslContextFactory enabledCipherSuites(Set<String> p0){ return null; }
    default SslContextFactory forClient(boolean p0){ return null; }
    default SslContextFactory keyMananagerFactory(KeyManagerFactory p0){ return null; }
    default SslContextFactory serverName(String p0){ return null; }
    default SslContextFactory trustManagerFactory(TrustManagerFactory p0){ return null; }
    default SslContextFactory useAlpn(boolean p0){ return null; }
}
