// Generated automatically from io.vertx.core.net.KeyCertOptions for testing purposes

package io.vertx.core.net;

import io.vertx.core.Vertx;
import java.util.function.Function;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.X509KeyManager;

public interface KeyCertOptions
{
    KeyCertOptions copy();
    KeyManagerFactory getKeyManagerFactory(Vertx p0);
    default Function<String, KeyManagerFactory> keyManagerFactoryMapper(Vertx p0){ return null; }
    default Function<String, X509KeyManager> keyManagerMapper(Vertx p0){ return null; }
    static KeyCertOptions wrap(KeyManagerFactory p0){ return null; }
    static KeyCertOptions wrap(X509KeyManager p0){ return null; }
}
