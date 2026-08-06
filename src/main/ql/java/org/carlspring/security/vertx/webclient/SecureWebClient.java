package org.carlspring.security.vertx.webclient;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.WebClientOptions;

import java.util.concurrent.TimeUnit;

/**
 * @author carlspring
 */
public class SecureWebClient
        extends AbstractVerticle
{

    @Override
    public void start()
    {
        // Create a WebClientOptions with an explicit idle timeout
        WebClientOptions options = new WebClientOptions()
                .setIdleTimeout(30)
                .setIdleTimeoutUnit(TimeUnit.SECONDS);

        // Create a WebClient with the options
        WebClient client = WebClient.create(vertx, options);

        // Use client...
    }

}
