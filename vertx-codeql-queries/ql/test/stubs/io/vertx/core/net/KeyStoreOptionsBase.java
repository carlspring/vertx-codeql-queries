// Generated automatically from io.vertx.core.net.KeyStoreOptionsBase for testing purposes

package io.vertx.core.net;

import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.net.KeyCertOptions;
import io.vertx.core.net.TrustOptions;
import java.security.KeyStore;
import java.util.function.Function;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;

abstract public class KeyStoreOptionsBase implements KeyCertOptions, TrustOptions
{
    protected KeyStoreOptionsBase setProvider(String p0){ return null; }
    protected KeyStoreOptionsBase setType(String p0){ return null; }
    protected KeyStoreOptionsBase(){}
    protected KeyStoreOptionsBase(KeyStoreOptionsBase p0){}
    protected String getProvider(){ return null; }
    protected String getType(){ return null; }
    public Buffer getValue(){ return null; }
    public Function<String, KeyManagerFactory> keyManagerFactoryMapper(Vertx p0){ return null; }
    public Function<String, TrustManager[]> trustManagerMapper(Vertx p0){ return null; }
    public Function<String, X509KeyManager> keyManagerMapper(Vertx p0){ return null; }
    public KeyManagerFactory getKeyManagerFactory(Vertx p0){ return null; }
    public KeyStore loadKeyStore(Vertx p0){ return null; }
    public KeyStoreOptionsBase setAlias(String p0){ return null; }
    public KeyStoreOptionsBase setAliasPassword(String p0){ return null; }
    public KeyStoreOptionsBase setPassword(String p0){ return null; }
    public KeyStoreOptionsBase setPath(String p0){ return null; }
    public KeyStoreOptionsBase setValue(Buffer p0){ return null; }
    public String getAlias(){ return null; }
    public String getAliasPassword(){ return null; }
    public String getPassword(){ return null; }
    public String getPath(){ return null; }
    public TrustManagerFactory getTrustManagerFactory(Vertx p0){ return null; }
    public abstract KeyStoreOptionsBase copy();
    public boolean equals(Object p0){ return false; }
}
