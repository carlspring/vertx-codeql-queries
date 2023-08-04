// Generated automatically from io.vertx.core.net.TrustOptions for testing purposes

package io.vertx.core.net;

import io.vertx.core.Vertx;
import java.util.function.Function;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

public interface TrustOptions
{
    Function<String, TrustManager[]> trustManagerMapper(Vertx p0);
    TrustManagerFactory getTrustManagerFactory(Vertx p0);
    TrustOptions copy();
    static TrustOptions wrap(TrustManager p0){ return null; }
    static TrustOptions wrap(TrustManagerFactory p0){ return null; }
}
