// Generated automatically from io.vertx.core.net.NetServerOptions for testing purposes

package io.vertx.core.net;

import io.netty.handler.logging.ByteBufFormat;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.ClientAuth;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.JdkSSLEngineOptions;
import io.vertx.core.net.JksOptions;
import io.vertx.core.net.KeyCertOptions;
import io.vertx.core.net.OpenSSLEngineOptions;
import io.vertx.core.net.PemKeyCertOptions;
import io.vertx.core.net.PemTrustOptions;
import io.vertx.core.net.PfxOptions;
import io.vertx.core.net.SSLEngineOptions;
import io.vertx.core.net.TCPSSLOptions;
import io.vertx.core.net.TrustOptions;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class NetServerOptions extends TCPSSLOptions
{
    public ClientAuth getClientAuth(){ return null; }
    public JsonObject toJson(){ return null; }
    public NetServerOptions addCrlPath(String p0){ return null; }
    public NetServerOptions addCrlValue(Buffer p0){ return null; }
    public NetServerOptions addEnabledCipherSuite(String p0){ return null; }
    public NetServerOptions addEnabledSecureTransportProtocol(String p0){ return null; }
    public NetServerOptions removeEnabledCipherSuite(String p0){ return null; }
    public NetServerOptions removeEnabledSecureTransportProtocol(String p0){ return null; }
    public NetServerOptions setAcceptBacklog(int p0){ return null; }
    public NetServerOptions setActivityLogDataFormat(ByteBufFormat p0){ return null; }
    public NetServerOptions setClientAuth(ClientAuth p0){ return null; }
    public NetServerOptions setEnabledSecureTransportProtocols(Set<String> p0){ return null; }
    public NetServerOptions setHost(String p0){ return null; }
    public NetServerOptions setIdleTimeout(int p0){ return null; }
    public NetServerOptions setIdleTimeoutUnit(TimeUnit p0){ return null; }
    public NetServerOptions setJdkSslEngineOptions(JdkSSLEngineOptions p0){ return null; }
    public NetServerOptions setKeyCertOptions(KeyCertOptions p0){ return null; }
    public NetServerOptions setKeyStoreOptions(JksOptions p0){ return null; }
    public NetServerOptions setLogActivity(boolean p0){ return null; }
    public NetServerOptions setOpenSslEngineOptions(OpenSSLEngineOptions p0){ return null; }
    public NetServerOptions setPemKeyCertOptions(PemKeyCertOptions p0){ return null; }
    public NetServerOptions setPemTrustOptions(PemTrustOptions p0){ return null; }
    public NetServerOptions setPfxKeyCertOptions(PfxOptions p0){ return null; }
    public NetServerOptions setPfxTrustOptions(PfxOptions p0){ return null; }
    public NetServerOptions setPort(int p0){ return null; }
    public NetServerOptions setProxyProtocolTimeout(long p0){ return null; }
    public NetServerOptions setProxyProtocolTimeoutUnit(TimeUnit p0){ return null; }
    public NetServerOptions setReadIdleTimeout(int p0){ return null; }
    public NetServerOptions setReceiveBufferSize(int p0){ return null; }
    public NetServerOptions setRegisterWriteHandler(boolean p0){ return null; }
    public NetServerOptions setReuseAddress(boolean p0){ return null; }
    public NetServerOptions setReusePort(boolean p0){ return null; }
    public NetServerOptions setSendBufferSize(int p0){ return null; }
    public NetServerOptions setSni(boolean p0){ return null; }
    public NetServerOptions setSoLinger(int p0){ return null; }
    public NetServerOptions setSsl(boolean p0){ return null; }
    public NetServerOptions setSslEngineOptions(SSLEngineOptions p0){ return null; }
    public NetServerOptions setSslHandshakeTimeout(long p0){ return null; }
    public NetServerOptions setSslHandshakeTimeoutUnit(TimeUnit p0){ return null; }
    public NetServerOptions setTcpCork(boolean p0){ return null; }
    public NetServerOptions setTcpFastOpen(boolean p0){ return null; }
    public NetServerOptions setTcpKeepAlive(boolean p0){ return null; }
    public NetServerOptions setTcpNoDelay(boolean p0){ return null; }
    public NetServerOptions setTcpQuickAck(boolean p0){ return null; }
    public NetServerOptions setTrafficClass(int p0){ return null; }
    public NetServerOptions setTrustOptions(TrustOptions p0){ return null; }
    public NetServerOptions setTrustStoreOptions(JksOptions p0){ return null; }
    public NetServerOptions setUseAlpn(boolean p0){ return null; }
    public NetServerOptions setUseProxyProtocol(boolean p0){ return null; }
    public NetServerOptions setWriteIdleTimeout(int p0){ return null; }
    public NetServerOptions(){}
    public NetServerOptions(JsonObject p0){}
    public NetServerOptions(NetServerOptions p0){}
    public String getHost(){ return null; }
    public TimeUnit getProxyProtocolTimeoutUnit(){ return null; }
    public boolean isRegisterWriteHandler(){ return false; }
    public boolean isSni(){ return false; }
    public boolean isUseProxyProtocol(){ return false; }
    public int getAcceptBacklog(){ return 0; }
    public int getPort(){ return 0; }
    public long getProxyProtocolTimeout(){ return 0; }
    public static ClientAuth DEFAULT_CLIENT_AUTH = null;
    public static String DEFAULT_HOST = null;
    public static TimeUnit DEFAULT_PROXY_PROTOCOL_TIMEOUT_TIME_UNIT = null;
    public static boolean DEFAULT_REGISTER_WRITE_HANDLER = false;
    public static boolean DEFAULT_SNI = false;
    public static boolean DEFAULT_USE_PROXY_PROTOCOL = false;
    public static int DEFAULT_ACCEPT_BACKLOG = 0;
    public static int DEFAULT_PORT = 0;
    public static long DEFAULT_PROXY_PROTOCOL_TIMEOUT = 0;
}
