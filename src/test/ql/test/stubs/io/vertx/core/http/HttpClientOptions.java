// Generated automatically from io.vertx.core.http.HttpClientOptions for testing purposes

package io.vertx.core.http;

import io.netty.handler.logging.ByteBufFormat;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.Http2Settings;
import io.vertx.core.http.HttpVersion;
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
import io.vertx.core.tracing.TracingPolicy;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HttpClientOptions extends ClientOptionsBase
{
    public Http2Settings getInitialSettings(){ return null; }
    public HttpClientOptions addCrlPath(String p0){ return null; }
    public HttpClientOptions addCrlValue(Buffer p0){ return null; }
    public HttpClientOptions addEnabledCipherSuite(String p0){ return null; }
    public HttpClientOptions addEnabledSecureTransportProtocol(String p0){ return null; }
    public HttpClientOptions addNonProxyHost(String p0){ return null; }
    public HttpClientOptions removeEnabledCipherSuite(String p0){ return null; }
    public HttpClientOptions removeEnabledSecureTransportProtocol(String p0){ return null; }
    public HttpClientOptions setActivityLogDataFormat(ByteBufFormat p0){ return null; }
    public HttpClientOptions setAlpnVersions(List<HttpVersion> p0){ return null; }
    public HttpClientOptions setConnectTimeout(int p0){ return null; }
    public HttpClientOptions setDecoderInitialBufferSize(int p0){ return null; }
    public HttpClientOptions setDefaultHost(String p0){ return null; }
    public HttpClientOptions setDefaultPort(int p0){ return null; }
    public HttpClientOptions setEnabledSecureTransportProtocols(Set<String> p0){ return null; }
    public HttpClientOptions setForceSni(boolean p0){ return null; }
    public HttpClientOptions setHttp2ClearTextUpgrade(boolean p0){ return null; }
    public HttpClientOptions setHttp2ClearTextUpgradeWithPreflightRequest(boolean p0){ return null; }
    public HttpClientOptions setHttp2ConnectionWindowSize(int p0){ return null; }
    public HttpClientOptions setHttp2KeepAliveTimeout(int p0){ return null; }
    public HttpClientOptions setHttp2MaxPoolSize(int p0){ return null; }
    public HttpClientOptions setHttp2MultiplexingLimit(int p0){ return null; }
    public HttpClientOptions setIdleTimeout(int p0){ return null; }
    public HttpClientOptions setIdleTimeoutUnit(TimeUnit p0){ return null; }
    public HttpClientOptions setInitialSettings(Http2Settings p0){ return null; }
    public HttpClientOptions setJdkSslEngineOptions(JdkSSLEngineOptions p0){ return null; }
    public HttpClientOptions setKeepAlive(boolean p0){ return null; }
    public HttpClientOptions setKeepAliveTimeout(int p0){ return null; }
    public HttpClientOptions setKeyCertOptions(KeyCertOptions p0){ return null; }
    public HttpClientOptions setKeyStoreOptions(JksOptions p0){ return null; }
    public HttpClientOptions setLocalAddress(String p0){ return null; }
    public HttpClientOptions setLogActivity(boolean p0){ return null; }
    public HttpClientOptions setMaxChunkSize(int p0){ return null; }
    public HttpClientOptions setMaxHeaderSize(int p0){ return null; }
    public HttpClientOptions setMaxInitialLineLength(int p0){ return null; }
    public HttpClientOptions setMaxPoolSize(int p0){ return null; }
    public HttpClientOptions setMaxRedirects(int p0){ return null; }
    public HttpClientOptions setMaxWaitQueueSize(int p0){ return null; }
    public HttpClientOptions setMaxWebSocketFrameSize(int p0){ return null; }
    public HttpClientOptions setMaxWebSocketMessageSize(int p0){ return null; }
    public HttpClientOptions setMaxWebSockets(int p0){ return null; }
    public HttpClientOptions setMetricsName(String p0){ return null; }
    public HttpClientOptions setName(String p0){ return null; }
    public HttpClientOptions setNonProxyHosts(List<String> p0){ return null; }
    public HttpClientOptions setOpenSslEngineOptions(OpenSSLEngineOptions p0){ return null; }
    public HttpClientOptions setPemKeyCertOptions(PemKeyCertOptions p0){ return null; }
    public HttpClientOptions setPemTrustOptions(PemTrustOptions p0){ return null; }
    public HttpClientOptions setPfxKeyCertOptions(PfxOptions p0){ return null; }
    public HttpClientOptions setPfxTrustOptions(PfxOptions p0){ return null; }
    public HttpClientOptions setPipelining(boolean p0){ return null; }
    public HttpClientOptions setPipeliningLimit(int p0){ return null; }
    public HttpClientOptions setPoolCleanerPeriod(int p0){ return null; }
    public HttpClientOptions setPoolEventLoopSize(int p0){ return null; }
    public HttpClientOptions setProtocolVersion(HttpVersion p0){ return null; }
    public HttpClientOptions setProxyOptions(ProxyOptions p0){ return null; }
    public HttpClientOptions setReadIdleTimeout(int p0){ return null; }
    public HttpClientOptions setReceiveBufferSize(int p0){ return null; }
    public HttpClientOptions setReuseAddress(boolean p0){ return null; }
    public HttpClientOptions setReusePort(boolean p0){ return null; }
    public HttpClientOptions setSendBufferSize(int p0){ return null; }
    public HttpClientOptions setSendUnmaskedFrames(boolean p0){ return null; }
    public HttpClientOptions setShared(boolean p0){ return null; }
    public HttpClientOptions setSoLinger(int p0){ return null; }
    public HttpClientOptions setSsl(boolean p0){ return null; }
    public HttpClientOptions setSslEngineOptions(SSLEngineOptions p0){ return null; }
    public HttpClientOptions setSslHandshakeTimeout(long p0){ return null; }
    public HttpClientOptions setSslHandshakeTimeoutUnit(TimeUnit p0){ return null; }
    public HttpClientOptions setTcpCork(boolean p0){ return null; }
    public HttpClientOptions setTcpFastOpen(boolean p0){ return null; }
    public HttpClientOptions setTcpKeepAlive(boolean p0){ return null; }
    public HttpClientOptions setTcpNoDelay(boolean p0){ return null; }
    public HttpClientOptions setTcpQuickAck(boolean p0){ return null; }
    public HttpClientOptions setTcpUserTimeout(int p0){ return null; }
    public HttpClientOptions setTracingPolicy(TracingPolicy p0){ return null; }
    public HttpClientOptions setTrafficClass(int p0){ return null; }
    public HttpClientOptions setTrustAll(boolean p0){ return null; }
    public HttpClientOptions setTrustOptions(TrustOptions p0){ return null; }
    public HttpClientOptions setTrustStoreOptions(JksOptions p0){ return null; }
    public HttpClientOptions setTryUseCompression(boolean p0){ return null; }
    public HttpClientOptions setTryUsePerFrameWebSocketCompression(boolean p0){ return null; }
    public HttpClientOptions setTryUsePerMessageWebSocketCompression(boolean p0){ return null; }
    public HttpClientOptions setUseAlpn(boolean p0){ return null; }
    public HttpClientOptions setVerifyHost(boolean p0){ return null; }
    public HttpClientOptions setWebSocketClosingTimeout(int p0){ return null; }
    public HttpClientOptions setWebSocketCompressionAllowClientNoContext(boolean p0){ return null; }
    public HttpClientOptions setWebSocketCompressionLevel(int p0){ return null; }
    public HttpClientOptions setWebSocketCompressionRequestServerNoContext(boolean p0){ return null; }
    public HttpClientOptions setWriteIdleTimeout(int p0){ return null; }
    public HttpClientOptions(){}
    public HttpClientOptions(HttpClientOptions p0){}
    public HttpClientOptions(JsonObject p0){}
    public HttpVersion getProtocolVersion(){ return null; }
    public JsonObject toJson(){ return null; }
    public List<HttpVersion> getAlpnVersions(){ return null; }
    public String getDefaultHost(){ return null; }
    public String getName(){ return null; }
    public TracingPolicy getTracingPolicy(){ return null; }
    public boolean getTryUsePerMessageWebSocketCompression(){ return false; }
    public boolean getTryWebSocketDeflateFrameCompression(){ return false; }
    public boolean getWebSocketCompressionAllowClientNoContext(){ return false; }
    public boolean getWebSocketCompressionRequestServerNoContext(){ return false; }
    public boolean isForceSni(){ return false; }
    public boolean isHttp2ClearTextUpgrade(){ return false; }
    public boolean isHttp2ClearTextUpgradeWithPreflightRequest(){ return false; }
    public boolean isKeepAlive(){ return false; }
    public boolean isPipelining(){ return false; }
    public boolean isSendUnmaskedFrames(){ return false; }
    public boolean isShared(){ return false; }
    public boolean isTryUseCompression(){ return false; }
    public boolean isVerifyHost(){ return false; }
    public int getDecoderInitialBufferSize(){ return 0; }
    public int getDefaultPort(){ return 0; }
    public int getHttp2ConnectionWindowSize(){ return 0; }
    public int getHttp2KeepAliveTimeout(){ return 0; }
    public int getHttp2MaxPoolSize(){ return 0; }
    public int getHttp2MultiplexingLimit(){ return 0; }
    public int getKeepAliveTimeout(){ return 0; }
    public int getMaxChunkSize(){ return 0; }
    public int getMaxHeaderSize(){ return 0; }
    public int getMaxInitialLineLength(){ return 0; }
    public int getMaxPoolSize(){ return 0; }
    public int getMaxRedirects(){ return 0; }
    public int getMaxWaitQueueSize(){ return 0; }
    public int getMaxWebSocketFrameSize(){ return 0; }
    public int getMaxWebSocketMessageSize(){ return 0; }
    public int getMaxWebSockets(){ return 0; }
    public int getPipeliningLimit(){ return 0; }
    public int getPoolCleanerPeriod(){ return 0; }
    public int getPoolEventLoopSize(){ return 0; }
    public int getWebSocketClosingTimeout(){ return 0; }
    public int getWebSocketCompressionLevel(){ return 0; }
    public static HttpVersion DEFAULT_PROTOCOL_VERSION = null;
    public static List<HttpVersion> DEFAULT_ALPN_VERSIONS = null;
    public static String DEFAULT_DEFAULT_HOST = null;
    public static String DEFAULT_NAME = null;
    public static TracingPolicy DEFAULT_TRACING_POLICY = null;
    public static boolean DEFAULT_FORCE_SNI = false;
    public static boolean DEFAULT_HTTP2_CLEAR_TEXT_UPGRADE = false;
    public static boolean DEFAULT_HTTP2_CLEAR_TEXT_UPGRADE_WITH_PREFLIGHT_REQUEST = false;
    public static boolean DEFAULT_KEEP_ALIVE = false;
    public static boolean DEFAULT_PIPELINING = false;
    public static boolean DEFAULT_SEND_UNMASKED_FRAMES = false;
    public static boolean DEFAULT_SHARED = false;
    public static boolean DEFAULT_TRY_USE_COMPRESSION = false;
    public static boolean DEFAULT_TRY_USE_PER_FRAME_WEBSOCKET_COMPRESSION = false;
    public static boolean DEFAULT_TRY_USE_PER_MESSAGE_WEBSOCKET_COMPRESSION = false;
    public static boolean DEFAULT_VERIFY_HOST = false;
    public static boolean DEFAULT_WEBSOCKET_ALLOW_CLIENT_NO_CONTEXT = false;
    public static boolean DEFAULT_WEBSOCKET_REQUEST_SERVER_NO_CONTEXT = false;
    public static int DEFAULT_DECODER_INITIAL_BUFFER_SIZE = 0;
    public static int DEFAULT_DEFAULT_PORT = 0;
    public static int DEFAULT_HTTP2_CONNECTION_WINDOW_SIZE = 0;
    public static int DEFAULT_HTTP2_KEEP_ALIVE_TIMEOUT = 0;
    public static int DEFAULT_HTTP2_MAX_POOL_SIZE = 0;
    public static int DEFAULT_HTTP2_MULTIPLEXING_LIMIT = 0;
    public static int DEFAULT_KEEP_ALIVE_TIMEOUT = 0;
    public static int DEFAULT_MAX_CHUNK_SIZE = 0;
    public static int DEFAULT_MAX_HEADER_SIZE = 0;
    public static int DEFAULT_MAX_INITIAL_LINE_LENGTH = 0;
    public static int DEFAULT_MAX_POOL_SIZE = 0;
    public static int DEFAULT_MAX_REDIRECTS = 0;
    public static int DEFAULT_MAX_WAIT_QUEUE_SIZE = 0;
    public static int DEFAULT_MAX_WEBSOCKETS = 0;
    public static int DEFAULT_MAX_WEBSOCKET_FRAME_SIZE = 0;
    public static int DEFAULT_MAX_WEBSOCKET_MESSAGE_SIZE = 0;
    public static int DEFAULT_PIPELINING_LIMIT = 0;
    public static int DEFAULT_POOL_CLEANER_PERIOD = 0;
    public static int DEFAULT_POOL_EVENT_LOOP_SIZE = 0;
    public static int DEFAULT_WEBSOCKET_CLOSING_TIMEOUT = 0;
    public static int DEFAULT_WEBSOCKET_COMPRESSION_LEVEL = 0;
}
