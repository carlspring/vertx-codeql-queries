// Generated automatically from io.vertx.core.eventbus.MessageCodec for testing purposes

package io.vertx.core.eventbus;

import io.vertx.core.buffer.Buffer;

public interface MessageCodec<S, R>
{
    R decodeFromWire(int p0, Buffer p1);
    R transform(S p0);
    String name();
    byte systemCodecID();
    void encodeToWire(Buffer p0, S p1);
}
