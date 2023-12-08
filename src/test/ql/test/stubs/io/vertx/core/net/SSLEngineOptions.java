// Generated automatically from io.vertx.core.net.SSLEngineOptions for testing purposes

package io.vertx.core.net;

import io.vertx.core.json.JsonObject;
import io.vertx.core.spi.tls.SslContextFactory;

abstract public class SSLEngineOptions
{
    public SSLEngineOptions setUseWorkerThread(boolean p0){ return null; }
    public SSLEngineOptions(){}
    public SSLEngineOptions(JsonObject p0){}
    public SSLEngineOptions(SSLEngineOptions p0){}
    public abstract SSLEngineOptions copy();
    public abstract SslContextFactory sslContextFactory();
    public boolean getUseWorkerThread(){ return false; }
    public static boolean DEFAULT_USE_WORKER_POOL = false;
}
