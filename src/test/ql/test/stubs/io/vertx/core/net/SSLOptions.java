// Generated automatically from io.vertx.core.net.SSLOptions for testing purposes

package io.vertx.core.net;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.KeyCertOptions;
import io.vertx.core.net.TrustOptions;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SSLOptions
{
    public JsonObject toJson(){ return null; }
    public KeyCertOptions getKeyCertOptions(){ return null; }
    public List<Buffer> getCrlValues(){ return null; }
    public List<String> getCrlPaths(){ return null; }
    public SSLOptions addCrlPath(String p0){ return null; }
    public SSLOptions addCrlValue(Buffer p0){ return null; }
    public SSLOptions addEnabledCipherSuite(String p0){ return null; }
    public SSLOptions addEnabledSecureTransportProtocol(String p0){ return null; }
    public SSLOptions removeEnabledCipherSuite(String p0){ return null; }
    public SSLOptions removeEnabledSecureTransportProtocol(String p0){ return null; }
    public SSLOptions setEnabledSecureTransportProtocols(Set<String> p0){ return null; }
    public SSLOptions setKeyCertOptions(KeyCertOptions p0){ return null; }
    public SSLOptions setSslHandshakeTimeout(long p0){ return null; }
    public SSLOptions setSslHandshakeTimeoutUnit(TimeUnit p0){ return null; }
    public SSLOptions setTrustOptions(TrustOptions p0){ return null; }
    public SSLOptions setUseAlpn(boolean p0){ return null; }
    public SSLOptions(){}
    public SSLOptions(JsonObject p0){}
    public SSLOptions(SSLOptions p0){}
    public Set<String> getEnabledCipherSuites(){ return null; }
    public Set<String> getEnabledSecureTransportProtocols(){ return null; }
    public TimeUnit getSslHandshakeTimeoutUnit(){ return null; }
    public TrustOptions getTrustOptions(){ return null; }
    public boolean equals(Object p0){ return false; }
    public boolean isUseAlpn(){ return false; }
    public long getSslHandshakeTimeout(){ return 0; }
    public static List<String> DEFAULT_ENABLED_SECURE_TRANSPORT_PROTOCOLS = null;
    public static TimeUnit DEFAULT_SSL_HANDSHAKE_TIMEOUT_TIME_UNIT = null;
    public static boolean DEFAULT_USE_ALPN = false;
    public static long DEFAULT_SSL_HANDSHAKE_TIMEOUT = 0;
}
