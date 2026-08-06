# Insecure CORS Wildcard Origin

## Overview

An HTTP server with a CORS configuration that allows wildcard origins is insecure, as it allows
connections from any host.

## Recommendation

Add explicit origins when configuring the `CorsHandler`.

## Example

Instead of adding a wildcard origin, such as in the example below:

```java
package org.carlspring.security.vertx.http;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpHeaders;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.CorsHandler;

public class InsecureCorsWildcardOrigin extends AbstractVerticle {

    @Override
    public void start() {
        // Create a router
        Router router = Router.router(vertx);

        // Allow all origins, headers, and methods (insecure configuration)
        CorsHandler corsHandler = CorsHandler.create()
                                             .addOrigin("*")
                                             .allowedHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS.toString())
                                             .allowedMethod(HttpMethod.GET)
                                             .allowedMethod(HttpMethod.POST);

        // Mount the CORS handler
        router.route().handler(corsHandler);

        // Set up routes
        router.get("/api/data").handler(routingContext -> {
            routingContext.response()
                          .putHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                          .end("{\"message\":\"Hello, CORS!\"}");
        });

        // Start the server
        vertx.createHttpServer().requestHandler(router).listen(8080, ar -> {
            if (ar.succeeded()) {
                System.out.println("Server started on port 8080");
            } else {
                System.err.println("Server failed to start: " + ar.cause());
            }
        });
    }

}
```

Define the origins explicitly like this:

```java
package org.carlspring.security.vertx.http;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpHeaders;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.net.JksOptions;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.CorsHandler;

public class SecureCorsServer extends AbstractVerticle {

    @Override
    public void start() {
        // Create a router
        Router router = Router.router(vertx);

        // Configure CORS handling with allowed origins, headers, and methods
        CorsHandler corsHandler = CorsHandler.create()
                                             // 1) Use HTTPS
                                             // 2) Use an explicitly defined origin
                                             .addOrigin("https://example.com")
                                             // 3) Define allowed headers
                                             .allowedHeader(HttpHeaders.CONTENT_TYPE.toString())
                                             // 4) Define allowed methods
                                             .allowedMethod(HttpMethod.GET)
                                             .allowedMethod(HttpMethod.POST);

        // Mount the CORS handler
        router.route().handler(corsHandler);

        // Set up routes
        router.get("/api/data").handler(routingContext -> {
            routingContext.response()
                          .putHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                          .end("{\"message\":\"Hello, CORS!\"}");
        });

        // Set up SSL
        HttpServerOptions options = new HttpServerOptions()
                                            .setSsl(true)
                                            .setKeyStoreOptions(new JksOptions().setPath("keystore.jks")
                                                                                .setPassword("keystore_password"));

        // Start the server
        vertx.createHttpServer(options)
             .requestHandler(router)
             .listen(8080, ar -> {
                 if (ar.succeeded()) {
                     System.out.println("Server started on port 8080");
                 } else {
                     System.err.println("Server failed to start: " + ar.cause());
                 }
             });
    }

}
```

## References

- [Vert.x documentation](https://vertx.io/docs/vertx-core/java/#_writing_http_servers_and_clients)
- [Exploiting CORS – How to Pentest Cross-Origin Resource Sharing Vulnerabilities](https://www.freecodecamp.org/news/exploiting-cors-guide-to-pentesting/)
