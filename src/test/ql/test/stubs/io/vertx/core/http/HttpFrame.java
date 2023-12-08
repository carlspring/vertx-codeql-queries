// Generated automatically from io.vertx.core.http.HttpFrame for testing purposes

package io.vertx.core.http;

import io.vertx.core.buffer.Buffer;

public interface HttpFrame
{
    Buffer payload();
    int flags();
    int type();
}
