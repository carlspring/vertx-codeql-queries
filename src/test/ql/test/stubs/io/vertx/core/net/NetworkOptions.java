// Generated automatically from io.vertx.core.net.NetworkOptions for testing purposes

package io.vertx.core.net;

import io.netty.handler.logging.ByteBufFormat;
import io.vertx.core.json.JsonObject;

abstract public class NetworkOptions
{
    public ByteBufFormat getActivityLogDataFormat(){ return null; }
    public JsonObject toJson(){ return null; }
    public NetworkOptions setActivityLogDataFormat(ByteBufFormat p0){ return null; }
    public NetworkOptions setLogActivity(boolean p0){ return null; }
    public NetworkOptions setReceiveBufferSize(int p0){ return null; }
    public NetworkOptions setReuseAddress(boolean p0){ return null; }
    public NetworkOptions setReusePort(boolean p0){ return null; }
    public NetworkOptions setSendBufferSize(int p0){ return null; }
    public NetworkOptions setTrafficClass(int p0){ return null; }
    public NetworkOptions(){}
    public NetworkOptions(JsonObject p0){}
    public NetworkOptions(NetworkOptions p0){}
    public boolean getLogActivity(){ return false; }
    public boolean isReuseAddress(){ return false; }
    public boolean isReusePort(){ return false; }
    public int getReceiveBufferSize(){ return 0; }
    public int getSendBufferSize(){ return 0; }
    public int getTrafficClass(){ return 0; }
    public static ByteBufFormat DEFAULT_LOG_ACTIVITY_FORMAT = null;
    public static boolean DEFAULT_LOG_ENABLED = false;
    public static boolean DEFAULT_REUSE_ADDRESS = false;
    public static boolean DEFAULT_REUSE_PORT = false;
    public static int DEFAULT_RECEIVE_BUFFER_SIZE = 0;
    public static int DEFAULT_SEND_BUFFER_SIZE = 0;
    public static int DEFAULT_TRAFFIC_CLASS = 0;
}
