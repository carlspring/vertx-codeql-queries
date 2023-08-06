// Generated automatically from io.vertx.core.http.WebSocketFrame for testing purposes

package io.vertx.core.http;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.WebSocketFrameType;

public interface WebSocketFrame
{
    Buffer binaryData();
    String closeReason();
    String textData();
    WebSocketFrameType type();
    boolean isBinary();
    boolean isClose();
    boolean isContinuation();
    boolean isFinal();
    boolean isPing();
    boolean isText();
    short closeStatusCode();
    static WebSocketFrame binaryFrame(Buffer p0, boolean p1){ return null; }
    static WebSocketFrame continuationFrame(Buffer p0, boolean p1){ return null; }
    static WebSocketFrame pingFrame(Buffer p0){ return null; }
    static WebSocketFrame pongFrame(Buffer p0){ return null; }
    static WebSocketFrame textFrame(String p0, boolean p1){ return null; }
}
