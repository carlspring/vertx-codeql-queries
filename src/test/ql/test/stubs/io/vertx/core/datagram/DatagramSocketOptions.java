// Generated automatically from io.vertx.core.datagram.DatagramSocketOptions for testing purposes

package io.vertx.core.datagram;

import io.netty.handler.logging.ByteBufFormat;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.NetworkOptions;

public class DatagramSocketOptions extends NetworkOptions
{
    public DatagramSocketOptions setActivityLogDataFormat(ByteBufFormat p0){ return null; }
    public DatagramSocketOptions setBroadcast(boolean p0){ return null; }
    public DatagramSocketOptions setIpV6(boolean p0){ return null; }
    public DatagramSocketOptions setLogActivity(boolean p0){ return null; }
    public DatagramSocketOptions setLoopbackModeDisabled(boolean p0){ return null; }
    public DatagramSocketOptions setMulticastNetworkInterface(String p0){ return null; }
    public DatagramSocketOptions setMulticastTimeToLive(int p0){ return null; }
    public DatagramSocketOptions setReceiveBufferSize(int p0){ return null; }
    public DatagramSocketOptions setReuseAddress(boolean p0){ return null; }
    public DatagramSocketOptions setReusePort(boolean p0){ return null; }
    public DatagramSocketOptions setSendBufferSize(int p0){ return null; }
    public DatagramSocketOptions setTrafficClass(int p0){ return null; }
    public DatagramSocketOptions(){}
    public DatagramSocketOptions(DatagramSocketOptions p0){}
    public DatagramSocketOptions(JsonObject p0){}
    public String getMulticastNetworkInterface(){ return null; }
    public boolean isBroadcast(){ return false; }
    public boolean isIpV6(){ return false; }
    public boolean isLoopbackModeDisabled(){ return false; }
    public int getMulticastTimeToLive(){ return 0; }
    public int getReceiveBufferSize(){ return 0; }
    public int getSendBufferSize(){ return 0; }
    public int getTrafficClass(){ return 0; }
    public static String DEFAULT_MULTICAST_NETWORK_INTERFACE = null;
    public static boolean DEFAULT_BROADCAST = false;
    public static boolean DEFAULT_IPV6 = false;
    public static boolean DEFAULT_LOOPBACK_MODE_DISABLED = false;
    public static boolean DEFAULT_REUSE_ADDRESS = false;
    public static int DEFAULT_MULTICAST_TIME_TO_LIVE = 0;
}
