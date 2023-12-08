// Generated automatically from io.netty.handler.ssl.SslProvider for testing purposes

package io.netty.handler.ssl;

import io.netty.handler.ssl.SslContextOption;
import java.security.Provider;

public enum SslProvider
{
    JDK, OPENSSL, OPENSSL_REFCNT;
    private SslProvider() {}
    public static boolean isAlpnSupported(SslProvider p0){ return false; }
    public static boolean isOptionSupported(SslProvider p0, SslContextOption<? extends Object> p1){ return false; }
    public static boolean isTlsv13Supported(SslProvider p0){ return false; }
    public static boolean isTlsv13Supported(SslProvider p0, Provider p1){ return false; }
}
