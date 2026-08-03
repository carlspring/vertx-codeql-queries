package org.carlspring.security.vertx.http;

import io.vertx.core.Vertx;

/**
 * @author carlspring
 */
public class SecureInvocationOfVertxVertx
{

    public void start(Vertx vertx)
    {
        vertx.deployVerticle("example");
    }

}
