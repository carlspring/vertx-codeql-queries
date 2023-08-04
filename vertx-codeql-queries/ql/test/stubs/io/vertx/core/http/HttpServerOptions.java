// Generated automatically from io.vertx.core.http.HttpServerOptions for testing purposes

package io.vertx.core.http;

import io.netty.handler.codec.compression.CompressionOptions;
import io.netty.handler.logging.ByteBufFormat;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.ClientAuth;
import io.vertx.core.http.Http2Settings;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.JdkSSLEngineOptions;
import io.vertx.core.net.JksOptions;
import io.vertx.core.net.KeyCertOptions;
import io.vertx.core.net.NetServerOptions;
import io.vertx.core.net.OpenSSLEngineOptions;
import io.vertx.core.net.PemKeyCertOptions;
import io.vertx.core.net.PemTrustOptions;
import io.vertx.core.net.PfxOptions;
import io.vertx.core.net.SSLEngineOptions;
import io.vertx.core.net.TrustOptions;
import io.vertx.core.tracing.TracingPolicy;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HttpServerOptions extends NetServerOptions
{
    public Http2Settings getInitialSettings(){ return null; }
    public HttpServerOptions addCompressor(CompressionOptions p0){ return null; }
    public HttpServerOptions addCrlPath(String p0){ return null; }
    public HttpServerOptions addCrlValue(Buffer p0){ return null; }
    public HttpServerOptions addEnabledCipherSuite(String p0){ return null; }
    public HttpServerOptions addEnabledSecureTransportProtocol(String p0){ return null; }
    public HttpServerOptions addWebSocketSubProtocol(String p0){ return null; }
    public HttpServerOptions removeEnabledCipherSuite(String p0){ return null; }
    public HttpServerOptions removeEnabledSecureTransportProtocol(String p0){ return null; }
    public HttpServerOptions setAcceptBacklog(int p0){ return null; }
    public HttpServerOptions setAcceptUnmaskedFrames(boolean p0){ return null; }
    public HttpServerOptions setActivityLogDataFormat(ByteBufFormat p0){ return null; }
    public HttpServerOptions setAlpnVersions(List<HttpVersion> p0){ return null; }
    public HttpServerOptions setClientAuth(ClientAuth p0){ return null; }
    public HttpServerOptions setCompressionLevel(int p0){ return null; }
    public HttpServerOptions setCompressionSupported(boolean p0){ return null; }
    public HttpServerOptions setCompressors(List<CompressionOptions> p0){ return null; }
    public HttpServerOptions setDecoderInitialBufferSize(int p0){ return null; }
    public HttpServerOptions setDecompressionSupported(boolean p0){ return null; }
    public HttpServerOptions setEnabledSecureTransportProtocols(Set<String> p0){ return null; }
    public HttpServerOptions setHandle100ContinueAutomatically(boolean p0){ return null; }
    public HttpServerOptions setHost(String p0){ return null; }
    public HttpServerOptions setHttp2ConnectionWindowSize(int p0){ return null; }
    public HttpServerOptions setIdleTimeout(int p0){ return null; }
    public HttpServerOptions setIdleTimeoutUnit(TimeUnit p0){ return null; }
    public HttpServerOptions setInitialSettings(Http2Settings p0){ return null; }
    public HttpServerOptions setJdkSslEngineOptions(JdkSSLEngineOptions p0){ return null; }
    public HttpServerOptions setKeyCertOptions(KeyCertOptions p0){ return null; }
    public HttpServerOptions setKeyStoreOptions(JksOptions p0){ return null; }
    public HttpServerOptions setLogActivity(boolean p0){ return null; }
    public HttpServerOptions setMaxChunkSize(int p0){ return null; }
    public HttpServerOptions setMaxFormAttributeSize(int p0){ return null; }
    public HttpServerOptions setMaxHeaderSize(int p0){ return null; }
    public HttpServerOptions setMaxInitialLineLength(int p0){ return null; }
    public HttpServerOptions setMaxWebSocketFrameSize(int p0){ return null; }
    public HttpServerOptions setMaxWebSocketMessageSize(int p0){ return null; }
    public HttpServerOptions setOpenSslEngineOptions(OpenSSLEngineOptions p0){ return null; }
    public HttpServerOptions setPemKeyCertOptions(PemKeyCertOptions p0){ return null; }
    public HttpServerOptions setPemTrustOptions(PemTrustOptions p0){ return null; }
    public HttpServerOptions setPerFrameWebSocketCompressionSupported(boolean p0){ return null; }
    public HttpServerOptions setPerMessageWebSocketCompressionSupported(boolean p0){ return null; }
    public HttpServerOptions setPfxKeyCertOptions(PfxOptions p0){ return null; }
    public HttpServerOptions setPfxTrustOptions(PfxOptions p0){ return null; }
    public HttpServerOptions setPort(int p0){ return null; }
    public HttpServerOptions setProxyProtocolTimeout(long p0){ return null; }
    public HttpServerOptions setProxyProtocolTimeoutUnit(TimeUnit p0){ return null; }
    public HttpServerOptions setReadIdleTimeout(int p0){ return null; }
    public HttpServerOptions setReceiveBufferSize(int p0){ return null; }
    public HttpServerOptions setRegisterWebSocketWriteHandlers(boolean p0){ return null; }
    public HttpServerOptions setRegisterWriteHandler(boolean p0){ return null; }
    public HttpServerOptions setReuseAddress(boolean p0){ return null; }
    public HttpServerOptions setReusePort(boolean p0){ return null; }
    public HttpServerOptions setSendBufferSize(int p0){ return null; }
    public HttpServerOptions setSni(boolean p0){ return null; }
    public HttpServerOptions setSoLinger(int p0){ return null; }
    public HttpServerOptions setSsl(boolean p0){ return null; }
    public HttpServerOptions setSslEngineOptions(SSLEngineOptions p0){ return null; }
    public HttpServerOptions setSslHandshakeTimeout(long p0){ return null; }
    public HttpServerOptions setSslHandshakeTimeoutUnit(TimeUnit p0){ return null; }
    public HttpServerOptions setTcpCork(boolean p0){ return null; }
    public HttpServerOptions setTcpFastOpen(boolean p0){ return null; }
    public HttpServerOptions setTcpKeepAlive(boolean p0){ return null; }
    public HttpServerOptions setTcpNoDelay(boolean p0){ return null; }
    public HttpServerOptions setTcpQuickAck(boolean p0){ return null; }
    public HttpServerOptions setTracingPolicy(TracingPolicy p0){ return null; }
    public HttpServerOptions setTrafficClass(int p0){ return null; }
    public HttpServerOptions setTrustOptions(TrustOptions p0){ return null; }
    public HttpServerOptions setTrustStoreOptions(JksOptions p0){ return null; }
    public HttpServerOptions setUseAlpn(boolean p0){ return null; }
    public HttpServerOptions setUseProxyProtocol(boolean p0){ return null; }
    public HttpServerOptions setWebSocketAllowServerNoContext(boolean p0){ return null; }
    public HttpServerOptions setWebSocketClosingTimeout(int p0){ return null; }
    public HttpServerOptions setWebSocketCompressionLevel(int p0){ return null; }
    public HttpServerOptions setWebSocketPreferredClientNoContext(boolean p0){ return null; }
    public HttpServerOptions setWebSocketSubProtocols(List<String> p0){ return null; }
    public HttpServerOptions setWriteIdleTimeout(int p0){ return null; }
    public HttpServerOptions(){}
    public HttpServerOptions(HttpServerOptions p0){}
    public HttpServerOptions(JsonObject p0){}
    public JsonObject toJson(){ return null; }
    public List<CompressionOptions> getCompressors(){ return null; }
    public List<HttpVersion> getAlpnVersions(){ return null; }
    public List<String> getWebSocketSubProtocols(){ return null; }
    public TracingPolicy getTracingPolicy(){ return null; }
    public boolean getPerFrameWebSocketCompressionSupported(){ return false; }
    public boolean getPerMessageWebSocketCompressionSupported(){ return false; }
    public boolean getWebSocketAllowServerNoContext(){ return false; }
    public boolean getWebSocketPreferredClientNoContext(){ return false; }
    public boolean isAcceptUnmaskedFrames(){ return false; }
    public boolean isCompressionSupported(){ return false; }
    public boolean isDecompressionSupported(){ return false; }
    public boolean isHandle100ContinueAutomatically(){ return false; }
    public boolean isRegisterWebSocketWriteHandlers(){ return false; }
    public boolean isRegisterWriteHandler(){ return false; }
    public int getCompressionLevel(){ return 0; }
    public int getDecoderInitialBufferSize(){ return 0; }
    public int getHttp2ConnectionWindowSize(){ return 0; }
    public int getMaxChunkSize(){ return 0; }
    public int getMaxFormAttributeSize(){ return 0; }
    public int getMaxHeaderSize(){ return 0; }
    public int getMaxInitialLineLength(){ return 0; }
    public int getMaxWebSocketFrameSize(){ return 0; }
    public int getMaxWebSocketMessageSize(){ return 0; }
    public int getWebSocketClosingTimeout(){ return 0; }
    public int getWebSocketCompressionLevel(){ return 0; }
    public static List<HttpVersion> DEFAULT_ALPN_VERSIONS = null;
    public static TracingPolicy DEFAULT_TRACING_POLICY = null;
    public static boolean DEFAULT_ACCEPT_UNMASKED_FRAMES = false;
    public static boolean DEFAULT_COMPRESSION_SUPPORTED = false;
    public static boolean DEFAULT_DECOMPRESSION_SUPPORTED = false;
    public static boolean DEFAULT_HANDLE_100_CONTINE_AUTOMATICALLY = false;
    public static boolean DEFAULT_PER_FRAME_WEBSOCKET_COMPRESSION_SUPPORTED = false;
    public static boolean DEFAULT_PER_MESSAGE_WEBSOCKET_COMPRESSION_SUPPORTED = false;
    public static boolean DEFAULT_REGISTER_WEBSOCKET_WRITE_HANDLERS = false;
    public static boolean DEFAULT_WEBSOCKET_ALLOW_SERVER_NO_CONTEXT = false;
    public static boolean DEFAULT_WEBSOCKET_PREFERRED_CLIENT_NO_CONTEXT = false;
    public static int DEFAULT_COMPRESSION_LEVEL = 0;
    public static int DEFAULT_DECODER_INITIAL_BUFFER_SIZE = 0;
    public static int DEFAULT_HTTP2_CONNECTION_WINDOW_SIZE = 0;
    public static int DEFAULT_MAX_CHUNK_SIZE = 0;
    public static int DEFAULT_MAX_FORM_ATTRIBUTE_SIZE = 0;
    public static int DEFAULT_MAX_HEADER_SIZE = 0;
    public static int DEFAULT_MAX_INITIAL_LINE_LENGTH = 0;
    public static int DEFAULT_MAX_WEBSOCKET_FRAME_SIZE = 0;
    public static int DEFAULT_MAX_WEBSOCKET_MESSAGE_SIZE = 0;
    public static int DEFAULT_PORT = 0;
    public static int DEFAULT_WEBSOCKET_CLOSING_TIMEOUT = 0;
    public static int DEFAULT_WEBSOCKET_COMPRESSION_LEVEL = 0;
    public static long DEFAULT_INITIAL_SETTINGS_MAX_CONCURRENT_STREAMS = 0;
}
