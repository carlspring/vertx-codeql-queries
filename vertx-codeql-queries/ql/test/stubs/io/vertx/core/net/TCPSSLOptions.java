// Generated automatically from io.vertx.core.net.TCPSSLOptions for testing purposes

package io.vertx.core.net;

import io.netty.handler.logging.ByteBufFormat;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.JdkSSLEngineOptions;
import io.vertx.core.net.JksOptions;
import io.vertx.core.net.KeyCertOptions;
import io.vertx.core.net.NetworkOptions;
import io.vertx.core.net.OpenSSLEngineOptions;
import io.vertx.core.net.PemKeyCertOptions;
import io.vertx.core.net.PemTrustOptions;
import io.vertx.core.net.PfxOptions;
import io.vertx.core.net.SSLEngineOptions;
import io.vertx.core.net.SSLOptions;
import io.vertx.core.net.TrustOptions;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

abstract public class TCPSSLOptions extends NetworkOptions
{
    public JdkSSLEngineOptions getJdkSslEngineOptions(){ return null; }
    public JksOptions getKeyStoreOptions(){ return null; }
    public JksOptions getTrustStoreOptions(){ return null; }
    public JsonObject toJson(){ return null; }
    public KeyCertOptions getKeyCertOptions(){ return null; }
    public List<Buffer> getCrlValues(){ return null; }
    public List<String> getCrlPaths(){ return null; }
    public OpenSSLEngineOptions getOpenSslEngineOptions(){ return null; }
    public PemKeyCertOptions getPemKeyCertOptions(){ return null; }
    public PemTrustOptions getPemTrustOptions(){ return null; }
    public PfxOptions getPfxKeyCertOptions(){ return null; }
    public PfxOptions getPfxTrustOptions(){ return null; }
    public SSLEngineOptions getSslEngineOptions(){ return null; }
    public SSLOptions getSslOptions(){ return null; }
    public Set<String> getEnabledCipherSuites(){ return null; }
    public Set<String> getEnabledSecureTransportProtocols(){ return null; }
    public TCPSSLOptions addCrlPath(String p0){ return null; }
    public TCPSSLOptions addCrlValue(Buffer p0){ return null; }
    public TCPSSLOptions addEnabledCipherSuite(String p0){ return null; }
    public TCPSSLOptions addEnabledSecureTransportProtocol(String p0){ return null; }
    public TCPSSLOptions removeEnabledCipherSuite(String p0){ return null; }
    public TCPSSLOptions removeEnabledSecureTransportProtocol(String p0){ return null; }
    public TCPSSLOptions setActivityLogDataFormat(ByteBufFormat p0){ return null; }
    public TCPSSLOptions setEnabledSecureTransportProtocols(Set<String> p0){ return null; }
    public TCPSSLOptions setIdleTimeout(int p0){ return null; }
    public TCPSSLOptions setIdleTimeoutUnit(TimeUnit p0){ return null; }
    public TCPSSLOptions setJdkSslEngineOptions(JdkSSLEngineOptions p0){ return null; }
    public TCPSSLOptions setKeyCertOptions(KeyCertOptions p0){ return null; }
    public TCPSSLOptions setKeyStoreOptions(JksOptions p0){ return null; }
    public TCPSSLOptions setLogActivity(boolean p0){ return null; }
    public TCPSSLOptions setOpenSslEngineOptions(OpenSSLEngineOptions p0){ return null; }
    public TCPSSLOptions setPemKeyCertOptions(PemKeyCertOptions p0){ return null; }
    public TCPSSLOptions setPemTrustOptions(PemTrustOptions p0){ return null; }
    public TCPSSLOptions setPfxKeyCertOptions(PfxOptions p0){ return null; }
    public TCPSSLOptions setPfxTrustOptions(PfxOptions p0){ return null; }
    public TCPSSLOptions setReadIdleTimeout(int p0){ return null; }
    public TCPSSLOptions setReceiveBufferSize(int p0){ return null; }
    public TCPSSLOptions setReuseAddress(boolean p0){ return null; }
    public TCPSSLOptions setReusePort(boolean p0){ return null; }
    public TCPSSLOptions setSendBufferSize(int p0){ return null; }
    public TCPSSLOptions setSoLinger(int p0){ return null; }
    public TCPSSLOptions setSsl(boolean p0){ return null; }
    public TCPSSLOptions setSslEngineOptions(SSLEngineOptions p0){ return null; }
    public TCPSSLOptions setSslHandshakeTimeout(long p0){ return null; }
    public TCPSSLOptions setSslHandshakeTimeoutUnit(TimeUnit p0){ return null; }
    public TCPSSLOptions setTcpCork(boolean p0){ return null; }
    public TCPSSLOptions setTcpFastOpen(boolean p0){ return null; }
    public TCPSSLOptions setTcpKeepAlive(boolean p0){ return null; }
    public TCPSSLOptions setTcpNoDelay(boolean p0){ return null; }
    public TCPSSLOptions setTcpQuickAck(boolean p0){ return null; }
    public TCPSSLOptions setTcpUserTimeout(int p0){ return null; }
    public TCPSSLOptions setTrafficClass(int p0){ return null; }
    public TCPSSLOptions setTrustOptions(TrustOptions p0){ return null; }
    public TCPSSLOptions setTrustStoreOptions(JksOptions p0){ return null; }
    public TCPSSLOptions setUseAlpn(boolean p0){ return null; }
    public TCPSSLOptions setWriteIdleTimeout(int p0){ return null; }
    public TCPSSLOptions(){}
    public TCPSSLOptions(JsonObject p0){}
    public TCPSSLOptions(TCPSSLOptions p0){}
    public TimeUnit getIdleTimeoutUnit(){ return null; }
    public TimeUnit getSslHandshakeTimeoutUnit(){ return null; }
    public TrustOptions getTrustOptions(){ return null; }
    public boolean isSsl(){ return false; }
    public boolean isTcpCork(){ return false; }
    public boolean isTcpFastOpen(){ return false; }
    public boolean isTcpKeepAlive(){ return false; }
    public boolean isTcpNoDelay(){ return false; }
    public boolean isTcpQuickAck(){ return false; }
    public boolean isUseAlpn(){ return false; }
    public int getIdleTimeout(){ return 0; }
    public int getReadIdleTimeout(){ return 0; }
    public int getSoLinger(){ return 0; }
    public int getTcpUserTimeout(){ return 0; }
    public int getWriteIdleTimeout(){ return 0; }
    public long getSslHandshakeTimeout(){ return 0; }
    public static List<String> DEFAULT_ENABLED_SECURE_TRANSPORT_PROTOCOLS = null;
    public static SSLEngineOptions DEFAULT_SSL_ENGINE = null;
    public static TimeUnit DEFAULT_IDLE_TIMEOUT_TIME_UNIT = null;
    public static TimeUnit DEFAULT_SSL_HANDSHAKE_TIMEOUT_TIME_UNIT = null;
    public static boolean DEFAULT_SSL = false;
    public static boolean DEFAULT_TCP_CORK = false;
    public static boolean DEFAULT_TCP_FAST_OPEN = false;
    public static boolean DEFAULT_TCP_KEEP_ALIVE = false;
    public static boolean DEFAULT_TCP_NO_DELAY = false;
    public static boolean DEFAULT_TCP_QUICKACK = false;
    public static boolean DEFAULT_USE_ALPN = false;
    public static int DEFAULT_IDLE_TIMEOUT = 0;
    public static int DEFAULT_READ_IDLE_TIMEOUT = 0;
    public static int DEFAULT_SO_LINGER = 0;
    public static int DEFAULT_TCP_USER_TIMEOUT = 0;
    public static int DEFAULT_WRITE_IDLE_TIMEOUT = 0;
    public static long DEFAULT_SSL_HANDSHAKE_TIMEOUT = 0;
}
