// Generated automatically from io.vertx.core.spi.observability.HttpRequest for testing purposes

package io.vertx.core.spi.observability;

import io.vertx.core.MultiMap;

public interface HttpRequest
{
    MultiMap headers();
    String absoluteURI();
    String uri();
    int id();
    io.vertx.core.http.HttpMethod method();
    io.vertx.core.net.SocketAddress remoteAddress();
}
