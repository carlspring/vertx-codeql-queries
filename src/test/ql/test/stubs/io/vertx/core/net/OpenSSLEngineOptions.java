// Generated automatically from io.vertx.core.net.OpenSSLEngineOptions for testing purposes

package io.vertx.core.net;

import io.vertx.core.json.JsonObject;
import io.vertx.core.net.SSLEngineOptions;
import io.vertx.core.spi.tls.SslContextFactory;

public class OpenSSLEngineOptions extends SSLEngineOptions
{
    public JsonObject toJson(){ return null; }
    public OpenSSLEngineOptions copy(){ return null; }
    public OpenSSLEngineOptions setSessionCacheEnabled(boolean p0){ return null; }
    public OpenSSLEngineOptions setUseWorkerThread(boolean p0){ return null; }
    public OpenSSLEngineOptions(){}
    public OpenSSLEngineOptions(JsonObject p0){}
    public OpenSSLEngineOptions(OpenSSLEngineOptions p0){}
    public SslContextFactory sslContextFactory(){ return null; }
    public boolean isSessionCacheEnabled(){ return false; }
    public static boolean DEFAULT_SESSION_CACHE_ENABLED = false;
    public static boolean isAlpnAvailable(){ return false; }
    public static boolean isAvailable(){ return false; }
}
