// Generated automatically from io.vertx.core.net.PemTrustOptions for testing purposes

package io.vertx.core.net;

import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.TrustOptions;
import java.security.KeyStore;
import java.util.List;
import java.util.function.Function;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

public class PemTrustOptions implements Cloneable, TrustOptions
{
    public Function<String, TrustManager[]> trustManagerMapper(Vertx p0){ return null; }
    public JsonObject toJson(){ return null; }
    public KeyStore loadKeyStore(Vertx p0){ return null; }
    public List<Buffer> getCertValues(){ return null; }
    public List<String> getCertPaths(){ return null; }
    public PemTrustOptions addCertPath(String p0){ return null; }
    public PemTrustOptions addCertValue(Buffer p0){ return null; }
    public PemTrustOptions copy(){ return null; }
    public PemTrustOptions(){}
    public PemTrustOptions(JsonObject p0){}
    public PemTrustOptions(PemTrustOptions p0){}
    public TrustManagerFactory getTrustManagerFactory(Vertx p0){ return null; }
    public boolean equals(Object p0){ return false; }
}
