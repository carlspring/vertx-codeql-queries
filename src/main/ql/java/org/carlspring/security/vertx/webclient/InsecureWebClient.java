package org.carlspring.security.vertx.webclient;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.ext.web.client.WebClient;

/**
 * @author carlspring
 */
public class InsecureWebClient
        extends AbstractVerticle
{

    @Override
    public void start()
    {
        // Create a WebClient without any WebClientOptions (no idle timeout set)
        WebClient client = WebClient.create(vertx);

        // Use client...
    }

}
