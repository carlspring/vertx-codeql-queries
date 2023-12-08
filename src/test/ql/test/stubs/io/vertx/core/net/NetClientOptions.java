// Generated automatically from io.vertx.core.net.NetClientOptions for testing purposes

package io.vertx.core.net;

import io.netty.handler.logging.ByteBufFormat;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.ClientOptionsBase;
import io.vertx.core.net.JdkSSLEngineOptions;
import io.vertx.core.net.JksOptions;
import io.vertx.core.net.KeyCertOptions;
import io.vertx.core.net.OpenSSLEngineOptions;
import io.vertx.core.net.PemKeyCertOptions;
import io.vertx.core.net.PemTrustOptions;
import io.vertx.core.net.PfxOptions;
import io.vertx.core.net.ProxyOptions;
import io.vertx.core.net.SSLEngineOptions;
import io.vertx.core.net.TrustOptions;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class NetClientOptions extends ClientOptionsBase
{
    public ClientOptionsBase setOpenSslEngineOptions(OpenSSLEngineOptions p0){ return null; }
    public JsonObject toJson(){ return null; }
    public List<String> getApplicationLayerProtocols(){ return null; }
    public NetClientOptions addCrlPath(String p0){ return null; }
    public NetClientOptions addCrlValue(Buffer p0){ return null; }
    public NetClientOptions addEnabledCipherSuite(String p0){ return null; }
    public NetClientOptions addEnabledSecureTransportProtocol(String p0){ return null; }
    public NetClientOptions addNonProxyHost(String p0){ return null; }
    public NetClientOptions removeEnabledCipherSuite(String p0){ return null; }
    public NetClientOptions removeEnabledSecureTransportProtocol(String p0){ return null; }
    public NetClientOptions setActivityLogDataFormat(ByteBufFormat p0){ return null; }
    public NetClientOptions setApplicationLayerProtocols(List<String> p0){ return null; }
    public NetClientOptions setConnectTimeout(int p0){ return null; }
    public NetClientOptions setEnabledSecureTransportProtocols(Set<String> p0){ return null; }
    public NetClientOptions setHostnameVerificationAlgorithm(String p0){ return null; }
    public NetClientOptions setIdleTimeout(int p0){ return null; }
    public NetClientOptions setIdleTimeoutUnit(TimeUnit p0){ return null; }
    public NetClientOptions setJdkSslEngineOptions(JdkSSLEngineOptions p0){ return null; }
    public NetClientOptions setKeyCertOptions(KeyCertOptions p0){ return null; }
    public NetClientOptions setKeyStoreOptions(JksOptions p0){ return null; }
    public NetClientOptions setLocalAddress(String p0){ return null; }
    public NetClientOptions setLogActivity(boolean p0){ return null; }
    public NetClientOptions setMetricsName(String p0){ return null; }
    public NetClientOptions setNonProxyHosts(List<String> p0){ return null; }
    public NetClientOptions setPemKeyCertOptions(PemKeyCertOptions p0){ return null; }
    public NetClientOptions setPemTrustOptions(PemTrustOptions p0){ return null; }
    public NetClientOptions setPfxKeyCertOptions(PfxOptions p0){ return null; }
    public NetClientOptions setPfxTrustOptions(PfxOptions p0){ return null; }
    public NetClientOptions setProxyOptions(ProxyOptions p0){ return null; }
    public NetClientOptions setReadIdleTimeout(int p0){ return null; }
    public NetClientOptions setReceiveBufferSize(int p0){ return null; }
    public NetClientOptions setReconnectAttempts(int p0){ return null; }
    public NetClientOptions setReconnectInterval(long p0){ return null; }
    public NetClientOptions setRegisterWriteHandler(boolean p0){ return null; }
    public NetClientOptions setReuseAddress(boolean p0){ return null; }
    public NetClientOptions setReusePort(boolean p0){ return null; }
    public NetClientOptions setSendBufferSize(int p0){ return null; }
    public NetClientOptions setSoLinger(int p0){ return null; }
    public NetClientOptions setSsl(boolean p0){ return null; }
    public NetClientOptions setSslEngineOptions(SSLEngineOptions p0){ return null; }
    public NetClientOptions setSslHandshakeTimeout(long p0){ return null; }
    public NetClientOptions setSslHandshakeTimeoutUnit(TimeUnit p0){ return null; }
    public NetClientOptions setTcpCork(boolean p0){ return null; }
    public NetClientOptions setTcpFastOpen(boolean p0){ return null; }
    public NetClientOptions setTcpKeepAlive(boolean p0){ return null; }
    public NetClientOptions setTcpNoDelay(boolean p0){ return null; }
    public NetClientOptions setTcpQuickAck(boolean p0){ return null; }
    public NetClientOptions setTrafficClass(int p0){ return null; }
    public NetClientOptions setTrustAll(boolean p0){ return null; }
    public NetClientOptions setTrustOptions(TrustOptions p0){ return null; }
    public NetClientOptions setTrustStoreOptions(JksOptions p0){ return null; }
    public NetClientOptions setUseAlpn(boolean p0){ return null; }
    public NetClientOptions setWriteIdleTimeout(int p0){ return null; }
    public NetClientOptions(){}
    public NetClientOptions(ClientOptionsBase p0){}
    public NetClientOptions(JsonObject p0){}
    public NetClientOptions(NetClientOptions p0){}
    public String getHostnameVerificationAlgorithm(){ return null; }
    public boolean isRegisterWriteHandler(){ return false; }
    public int getReconnectAttempts(){ return 0; }
    public long getReconnectInterval(){ return 0; }
    public static String DEFAULT_HOSTNAME_VERIFICATION_ALGORITHM = null;
    public static boolean DEFAULT_REGISTER_WRITE_HANDLER = false;
    public static int DEFAULT_RECONNECT_ATTEMPTS = 0;
    public static long DEFAULT_RECONNECT_INTERVAL = 0;
}
