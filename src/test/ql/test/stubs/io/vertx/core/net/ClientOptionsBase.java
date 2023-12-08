// Generated automatically from io.vertx.core.net.ClientOptionsBase for testing purposes

package io.vertx.core.net;

import io.netty.handler.logging.ByteBufFormat;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.JdkSSLEngineOptions;
import io.vertx.core.net.JksOptions;
import io.vertx.core.net.KeyCertOptions;
import io.vertx.core.net.OpenSSLEngineOptions;
import io.vertx.core.net.PemKeyCertOptions;
import io.vertx.core.net.PemTrustOptions;
import io.vertx.core.net.PfxOptions;
import io.vertx.core.net.ProxyOptions;
import io.vertx.core.net.SSLEngineOptions;
import io.vertx.core.net.TCPSSLOptions;
import io.vertx.core.net.TrustOptions;
import java.util.List;
import java.util.concurrent.TimeUnit;

abstract public class ClientOptionsBase extends TCPSSLOptions
{
    public ClientOptionsBase addCrlPath(String p0){ return null; }
    public ClientOptionsBase addCrlValue(Buffer p0){ return null; }
    public ClientOptionsBase addEnabledCipherSuite(String p0){ return null; }
    public ClientOptionsBase addEnabledSecureTransportProtocol(String p0){ return null; }
    public ClientOptionsBase addNonProxyHost(String p0){ return null; }
    public ClientOptionsBase removeEnabledCipherSuite(String p0){ return null; }
    public ClientOptionsBase removeEnabledSecureTransportProtocol(String p0){ return null; }
    public ClientOptionsBase setActivityLogDataFormat(ByteBufFormat p0){ return null; }
    public ClientOptionsBase setConnectTimeout(int p0){ return null; }
    public ClientOptionsBase setIdleTimeout(int p0){ return null; }
    public ClientOptionsBase setIdleTimeoutUnit(TimeUnit p0){ return null; }
    public ClientOptionsBase setJdkSslEngineOptions(JdkSSLEngineOptions p0){ return null; }
    public ClientOptionsBase setKeyCertOptions(KeyCertOptions p0){ return null; }
    public ClientOptionsBase setKeyStoreOptions(JksOptions p0){ return null; }
    public ClientOptionsBase setLocalAddress(String p0){ return null; }
    public ClientOptionsBase setLogActivity(boolean p0){ return null; }
    public ClientOptionsBase setMetricsName(String p0){ return null; }
    public ClientOptionsBase setNonProxyHosts(List<String> p0){ return null; }
    public ClientOptionsBase setOpenSslEngineOptions(OpenSSLEngineOptions p0){ return null; }
    public ClientOptionsBase setPemKeyCertOptions(PemKeyCertOptions p0){ return null; }
    public ClientOptionsBase setPemTrustOptions(PemTrustOptions p0){ return null; }
    public ClientOptionsBase setPfxKeyCertOptions(PfxOptions p0){ return null; }
    public ClientOptionsBase setPfxTrustOptions(PfxOptions p0){ return null; }
    public ClientOptionsBase setProxyOptions(ProxyOptions p0){ return null; }
    public ClientOptionsBase setReadIdleTimeout(int p0){ return null; }
    public ClientOptionsBase setReceiveBufferSize(int p0){ return null; }
    public ClientOptionsBase setReuseAddress(boolean p0){ return null; }
    public ClientOptionsBase setReusePort(boolean p0){ return null; }
    public ClientOptionsBase setSendBufferSize(int p0){ return null; }
    public ClientOptionsBase setSoLinger(int p0){ return null; }
    public ClientOptionsBase setSsl(boolean p0){ return null; }
    public ClientOptionsBase setSslEngineOptions(SSLEngineOptions p0){ return null; }
    public ClientOptionsBase setTcpCork(boolean p0){ return null; }
    public ClientOptionsBase setTcpFastOpen(boolean p0){ return null; }
    public ClientOptionsBase setTcpKeepAlive(boolean p0){ return null; }
    public ClientOptionsBase setTcpNoDelay(boolean p0){ return null; }
    public ClientOptionsBase setTcpQuickAck(boolean p0){ return null; }
    public ClientOptionsBase setTcpUserTimeout(int p0){ return null; }
    public ClientOptionsBase setTrafficClass(int p0){ return null; }
    public ClientOptionsBase setTrustAll(boolean p0){ return null; }
    public ClientOptionsBase setTrustOptions(TrustOptions p0){ return null; }
    public ClientOptionsBase setTrustStoreOptions(JksOptions p0){ return null; }
    public ClientOptionsBase setUseAlpn(boolean p0){ return null; }
    public ClientOptionsBase setWriteIdleTimeout(int p0){ return null; }
    public ClientOptionsBase(){}
    public ClientOptionsBase(ClientOptionsBase p0){}
    public ClientOptionsBase(JsonObject p0){}
    public JsonObject toJson(){ return null; }
    public List<String> getNonProxyHosts(){ return null; }
    public ProxyOptions getProxyOptions(){ return null; }
    public String getLocalAddress(){ return null; }
    public String getMetricsName(){ return null; }
    public boolean isTrustAll(){ return false; }
    public int getConnectTimeout(){ return 0; }
    public static String DEFAULT_METRICS_NAME = null;
    public static boolean DEFAULT_TRUST_ALL = false;
    public static int DEFAULT_CONNECT_TIMEOUT = 0;
}
