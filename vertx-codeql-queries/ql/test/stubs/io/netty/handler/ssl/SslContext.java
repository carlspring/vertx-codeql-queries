// Generated automatically from io.netty.handler.ssl.SslContext for testing purposes

package io.netty.handler.ssl;

import io.netty.buffer.ByteBufAllocator;
import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.ApplicationProtocolNegotiator;
import io.netty.handler.ssl.CipherSuiteFilter;
import io.netty.handler.ssl.SslHandler;
import io.netty.handler.ssl.SslProvider;
import io.netty.util.AttributeMap;
import java.io.File;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.TrustManagerFactory;

abstract public class SslContext
{
    protected SslContext(){}
    protected SslContext(boolean p0){}
    protected SslHandler newHandler(ByteBufAllocator p0, String p1, int p2, boolean p3){ return null; }
    protected SslHandler newHandler(ByteBufAllocator p0, String p1, int p2, boolean p3, Executor p4){ return null; }
    protected SslHandler newHandler(ByteBufAllocator p0, boolean p1){ return null; }
    protected SslHandler newHandler(ByteBufAllocator p0, boolean p1, Executor p2){ return null; }
    protected static KeyManagerFactory buildKeyManagerFactory(X509Certificate[] p0, String p1, PrivateKey p2, String p3, KeyManagerFactory p4, String p5){ return null; }
    protected static KeyStore buildKeyStore(X509Certificate[] p0, PrivateKey p1, char[] p2, String p3){ return null; }
    protected static PKCS8EncodedKeySpec generateKeySpec(char[] p0, byte[] p1){ return null; }
    protected static PrivateKey toPrivateKey(File p0, String p1){ return null; }
    protected static PrivateKey toPrivateKey(InputStream p0, String p1){ return null; }
    protected static TrustManagerFactory buildTrustManagerFactory(File p0, TrustManagerFactory p1){ return null; }
    protected static TrustManagerFactory buildTrustManagerFactory(File p0, TrustManagerFactory p1, String p2){ return null; }
    protected static TrustManagerFactory buildTrustManagerFactory(X509Certificate[] p0, TrustManagerFactory p1, String p2){ return null; }
    protected static X509Certificate[] toX509Certificates(File p0){ return null; }
    protected static X509Certificate[] toX509Certificates(InputStream p0){ return null; }
    public SslHandler newHandler(ByteBufAllocator p0, Executor p1){ return null; }
    public SslHandler newHandler(ByteBufAllocator p0, String p1, int p2, Executor p3){ return null; }
    public abstract ApplicationProtocolNegotiator applicationProtocolNegotiator();
    public abstract List<String> cipherSuites();
    public abstract SSLEngine newEngine(ByteBufAllocator p0);
    public abstract SSLEngine newEngine(ByteBufAllocator p0, String p1, int p2);
    public abstract SSLSessionContext sessionContext();
    public abstract boolean isClient();
    public final AttributeMap attributes(){ return null; }
    public final List<String> nextProtocols(){ return null; }
    public final SslHandler newHandler(ByteBufAllocator p0){ return null; }
    public final SslHandler newHandler(ByteBufAllocator p0, String p1, int p2){ return null; }
    public final boolean isServer(){ return false; }
    public long sessionCacheSize(){ return 0; }
    public long sessionTimeout(){ return 0; }
    public static SslContext newClientContext(){ return null; }
    public static SslContext newClientContext(File p0){ return null; }
    public static SslContext newClientContext(File p0, TrustManagerFactory p1){ return null; }
    public static SslContext newClientContext(File p0, TrustManagerFactory p1, Iterable<String> p2, CipherSuiteFilter p3, ApplicationProtocolConfig p4, long p5, long p6){ return null; }
    public static SslContext newClientContext(File p0, TrustManagerFactory p1, Iterable<String> p2, Iterable<String> p3, long p4, long p5){ return null; }
    public static SslContext newClientContext(SslProvider p0){ return null; }
    public static SslContext newClientContext(SslProvider p0, File p1){ return null; }
    public static SslContext newClientContext(SslProvider p0, File p1, TrustManagerFactory p2){ return null; }
    public static SslContext newClientContext(SslProvider p0, File p1, TrustManagerFactory p2, File p3, File p4, String p5, KeyManagerFactory p6, Iterable<String> p7, CipherSuiteFilter p8, ApplicationProtocolConfig p9, long p10, long p11){ return null; }
    public static SslContext newClientContext(SslProvider p0, File p1, TrustManagerFactory p2, Iterable<String> p3, CipherSuiteFilter p4, ApplicationProtocolConfig p5, long p6, long p7){ return null; }
    public static SslContext newClientContext(SslProvider p0, File p1, TrustManagerFactory p2, Iterable<String> p3, Iterable<String> p4, long p5, long p6){ return null; }
    public static SslContext newClientContext(SslProvider p0, TrustManagerFactory p1){ return null; }
    public static SslContext newClientContext(TrustManagerFactory p0){ return null; }
    public static SslContext newServerContext(File p0, File p1){ return null; }
    public static SslContext newServerContext(File p0, File p1, String p2){ return null; }
    public static SslContext newServerContext(File p0, File p1, String p2, Iterable<String> p3, CipherSuiteFilter p4, ApplicationProtocolConfig p5, long p6, long p7){ return null; }
    public static SslContext newServerContext(File p0, File p1, String p2, Iterable<String> p3, Iterable<String> p4, long p5, long p6){ return null; }
    public static SslContext newServerContext(SslProvider p0, File p1, File p2){ return null; }
    public static SslContext newServerContext(SslProvider p0, File p1, File p2, String p3){ return null; }
    public static SslContext newServerContext(SslProvider p0, File p1, File p2, String p3, Iterable<String> p4, CipherSuiteFilter p5, ApplicationProtocolConfig p6, long p7, long p8){ return null; }
    public static SslContext newServerContext(SslProvider p0, File p1, File p2, String p3, Iterable<String> p4, Iterable<String> p5, long p6, long p7){ return null; }
    public static SslContext newServerContext(SslProvider p0, File p1, File p2, String p3, TrustManagerFactory p4, Iterable<String> p5, Iterable<String> p6, long p7, long p8){ return null; }
    public static SslContext newServerContext(SslProvider p0, File p1, TrustManagerFactory p2, File p3, File p4, String p5, KeyManagerFactory p6, Iterable<String> p7, CipherSuiteFilter p8, ApplicationProtocolConfig p9, long p10, long p11){ return null; }
    public static SslProvider defaultClientProvider(){ return null; }
    public static SslProvider defaultServerProvider(){ return null; }
}
