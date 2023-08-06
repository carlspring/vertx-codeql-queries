// Generated automatically from io.vertx.core.net.PemKeyCertOptions for testing purposes

package io.vertx.core.net;

import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.KeyCertOptions;
import java.security.KeyStore;
import java.util.List;
import java.util.function.Function;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.X509KeyManager;

public class PemKeyCertOptions implements KeyCertOptions
{
    public Buffer getCertValue(){ return null; }
    public Buffer getKeyValue(){ return null; }
    public Function<String, KeyManagerFactory> keyManagerFactoryMapper(Vertx p0){ return null; }
    public Function<String, X509KeyManager> keyManagerMapper(Vertx p0){ return null; }
    public JsonObject toJson(){ return null; }
    public KeyManagerFactory getKeyManagerFactory(Vertx p0){ return null; }
    public KeyStore loadKeyStore(Vertx p0){ return null; }
    public List<Buffer> getCertValues(){ return null; }
    public List<Buffer> getKeyValues(){ return null; }
    public List<String> getCertPaths(){ return null; }
    public List<String> getKeyPaths(){ return null; }
    public PemKeyCertOptions addCertPath(String p0){ return null; }
    public PemKeyCertOptions addCertValue(Buffer p0){ return null; }
    public PemKeyCertOptions addKeyPath(String p0){ return null; }
    public PemKeyCertOptions addKeyValue(Buffer p0){ return null; }
    public PemKeyCertOptions copy(){ return null; }
    public PemKeyCertOptions setCertPath(String p0){ return null; }
    public PemKeyCertOptions setCertPaths(List<String> p0){ return null; }
    public PemKeyCertOptions setCertValue(Buffer p0){ return null; }
    public PemKeyCertOptions setCertValues(List<Buffer> p0){ return null; }
    public PemKeyCertOptions setKeyPath(String p0){ return null; }
    public PemKeyCertOptions setKeyPaths(List<String> p0){ return null; }
    public PemKeyCertOptions setKeyValue(Buffer p0){ return null; }
    public PemKeyCertOptions setKeyValues(List<Buffer> p0){ return null; }
    public PemKeyCertOptions(){}
    public PemKeyCertOptions(JsonObject p0){}
    public PemKeyCertOptions(PemKeyCertOptions p0){}
    public String getCertPath(){ return null; }
    public String getKeyPath(){ return null; }
    public boolean equals(Object p0){ return false; }
}
