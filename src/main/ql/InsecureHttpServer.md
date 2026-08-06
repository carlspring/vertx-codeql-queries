# Insecure HTTP Server

## Overview

An HTTP server which does not use SSL/TLS is vulnerable to man-in-the-middle attacks.

Please, note that it may be safe to ignore this, only if you intend your application to be placed
behind a loadbalancer, which is itself securing the connections with the appropriate certificates.

## Recommendation

Use SSL/TLS to encrypt the communication between the client and the server.

## Example

Instead of setting up a plain HTTP server that doesn't use SSL, such as this one:

```java
package org.carlspring.security.vertx.http;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;

public class InsecureHttpServer extends AbstractVerticle {

    @Override
    public void start() {
        // Create an insecure HTTP server
        HttpServer server = vertx.createHttpServer();

        // Configure server settings
        server.requestHandler(request -> {
            request.response().end("Hello, World!");
        });

        // Start the server
        server.listen(8080);
    }

}
```

When creating an HTTP server, the `setSsl` method should be called on the `HttpServerOptions` object,
and the `setKeyStoreOptions` method should be called on the `HttpServerOptions` object with a
`KeyStoreOptions` object as an argument.

For example, code such as the one illustrated below should be used to create an HTTP server and secure
it with SSL:

```java
package org.carlspring.security.vertx.http;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.net.JksOptions;

public class SecureHttpServer extends AbstractVerticle {

    @Override
    public void start() {
        HttpServerOptions options = new HttpServerOptions()
                                            // Set up SSL
                                            .setSsl(true)
                                            // Set up keystore
                                            .setKeyStoreOptions(new JksOptions().setPath("keystore.jks")
                                                                                .setPassword("keystore_password"));

        HttpServer server = vertx.createHttpServer(options);

        server.requestHandler(request -> {
            HttpServerResponse response = request.response();
            response.putHeader("Content-Type", "text/plain");
            response.end("Hello, World! This is a secure connection.");
        });

        server.listen(8443, "localhost", result -> {
            if (result.succeeded()) {
                System.out.println("Server started on port 8443 with SSL/TLS");
            } else {
                System.err.println("Server failed to start: " + result.cause());
            }
        });
    }

}
```

## References

- [Vert.x documentation](https://vertx.io/docs/vertx-core/java/#_writing_http_servers_and_clients)
