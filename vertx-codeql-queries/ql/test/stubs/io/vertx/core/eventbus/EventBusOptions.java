// Generated automatically from io.vertx.core.eventbus.EventBusOptions for testing purposes

package io.vertx.core.eventbus;

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

public class EventBusOptions extends TCPSSLOptions
{
    public ClientAuth getClientAuth(){ return null; }
    public EventBusOptions addCrlPath(String p0){ return null; }
    public EventBusOptions addCrlValue(Buffer p0){ return null; }
    public EventBusOptions addEnabledCipherSuite(String p0){ return null; }
    public EventBusOptions addEnabledSecureTransportProtocol(String p0){ return null; }
    public EventBusOptions removeEnabledCipherSuite(String p0){ return null; }
    public EventBusOptions removeEnabledSecureTransportProtocol(String p0){ return null; }
    public EventBusOptions setAcceptBacklog(int p0){ return null; }
    public EventBusOptions setClientAuth(ClientAuth p0){ return null; }
    public EventBusOptions setClusterNodeMetadata(JsonObject p0){ return null; }
    public EventBusOptions setClusterPingInterval(long p0){ return null; }
    public EventBusOptions setClusterPingReplyInterval(long p0){ return null; }
    public EventBusOptions setClusterPublicHost(String p0){ return null; }
    public EventBusOptions setClusterPublicPort(int p0){ return null; }
    public EventBusOptions setConnectTimeout(int p0){ return null; }
    public EventBusOptions setEnabledSecureTransportProtocols(Set<String> p0){ return null; }
    public EventBusOptions setHost(String p0){ return null; }
    public EventBusOptions setIdleTimeout(int p0){ return null; }
    public EventBusOptions setIdleTimeoutUnit(TimeUnit p0){ return null; }
    public EventBusOptions setJdkSslEngineOptions(JdkSSLEngineOptions p0){ return null; }
    public EventBusOptions setKeyCertOptions(KeyCertOptions p0){ return null; }
    public EventBusOptions setKeyStoreOptions(JksOptions p0){ return null; }
    public EventBusOptions setLogActivity(boolean p0){ return null; }
    public EventBusOptions setOpenSslEngineOptions(OpenSSLEngineOptions p0){ return null; }
    public EventBusOptions setPemKeyCertOptions(PemKeyCertOptions p0){ return null; }
    public EventBusOptions setPemTrustOptions(PemTrustOptions p0){ return null; }
    public EventBusOptions setPfxKeyCertOptions(PfxOptions p0){ return null; }
    public EventBusOptions setPfxTrustOptions(PfxOptions p0){ return null; }
    public EventBusOptions setPort(int p0){ return null; }
    public EventBusOptions setReadIdleTimeout(int p0){ return null; }
    public EventBusOptions setReceiveBufferSize(int p0){ return null; }
    public EventBusOptions setReconnectAttempts(int p0){ return null; }
    public EventBusOptions setReconnectInterval(long p0){ return null; }
    public EventBusOptions setReuseAddress(boolean p0){ return null; }
    public EventBusOptions setReusePort(boolean p0){ return null; }
    public EventBusOptions setSendBufferSize(int p0){ return null; }
    public EventBusOptions setSoLinger(int p0){ return null; }
    public EventBusOptions setSsl(boolean p0){ return null; }
    public EventBusOptions setSslEngineOptions(SSLEngineOptions p0){ return null; }
    public EventBusOptions setSslHandshakeTimeout(long p0){ return null; }
    public EventBusOptions setSslHandshakeTimeoutUnit(TimeUnit p0){ return null; }
    public EventBusOptions setTcpCork(boolean p0){ return null; }
    public EventBusOptions setTcpFastOpen(boolean p0){ return null; }
    public EventBusOptions setTcpKeepAlive(boolean p0){ return null; }
    public EventBusOptions setTcpNoDelay(boolean p0){ return null; }
    public EventBusOptions setTcpQuickAck(boolean p0){ return null; }
    public EventBusOptions setTcpUserTimeout(int p0){ return null; }
    public EventBusOptions setTrafficClass(int p0){ return null; }
    public EventBusOptions setTrustAll(boolean p0){ return null; }
    public EventBusOptions setTrustOptions(TrustOptions p0){ return null; }
    public EventBusOptions setTrustStoreOptions(JksOptions p0){ return null; }
    public EventBusOptions setUseAlpn(boolean p0){ return null; }
    public EventBusOptions setWriteIdleTimeout(int p0){ return null; }
    public EventBusOptions(){}
    public EventBusOptions(EventBusOptions p0){}
    public EventBusOptions(JsonObject p0){}
    public JsonObject getClusterNodeMetadata(){ return null; }
    public JsonObject toJson(){ return null; }
    public String getClusterPublicHost(){ return null; }
    public String getHost(){ return null; }
    public boolean isTrustAll(){ return false; }
    public int getAcceptBacklog(){ return 0; }
    public int getClusterPublicPort(){ return 0; }
    public int getConnectTimeout(){ return 0; }
    public int getPort(){ return 0; }
    public int getReconnectAttempts(){ return 0; }
    public long getClusterPingInterval(){ return 0; }
    public long getClusterPingReplyInterval(){ return 0; }
    public long getReconnectInterval(){ return 0; }
    public static ClientAuth DEFAULT_CLIENT_AUTH = null;
    public static String DEFAULT_CLUSTER_HOST = null;
    public static String DEFAULT_CLUSTER_PUBLIC_HOST = null;
    public static boolean DEFAULT_TRUST_ALL = false;
    public static int DEFAULT_ACCEPT_BACKLOG = 0;
    public static int DEFAULT_CLUSTER_PORT = 0;
    public static int DEFAULT_CLUSTER_PUBLIC_PORT = 0;
    public static int DEFAULT_CONNECT_TIMEOUT = 0;
    public static int DEFAULT_RECONNECT_ATTEMPTS = 0;
    public static long DEFAULT_CLUSTER_PING_INTERVAL = 0;
    public static long DEFAULT_CLUSTER_PING_REPLY_INTERVAL = 0;
    public static long DEFAULT_RECONNECT_INTERVAL = 0;
}
