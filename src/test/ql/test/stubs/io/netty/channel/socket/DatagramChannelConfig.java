// Generated automatically from io.netty.channel.socket.DatagramChannelConfig for testing purposes

package io.netty.channel.socket;

import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelConfig;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.WriteBufferWaterMark;
import java.net.InetAddress;
import java.net.NetworkInterface;

public interface DatagramChannelConfig extends ChannelConfig
{
    DatagramChannelConfig setAllocator(ByteBufAllocator p0);
    DatagramChannelConfig setAutoClose(boolean p0);
    DatagramChannelConfig setAutoRead(boolean p0);
    DatagramChannelConfig setBroadcast(boolean p0);
    DatagramChannelConfig setConnectTimeoutMillis(int p0);
    DatagramChannelConfig setInterface(InetAddress p0);
    DatagramChannelConfig setLoopbackModeDisabled(boolean p0);
    DatagramChannelConfig setMaxMessagesPerRead(int p0);
    DatagramChannelConfig setMessageSizeEstimator(MessageSizeEstimator p0);
    DatagramChannelConfig setNetworkInterface(NetworkInterface p0);
    DatagramChannelConfig setReceiveBufferSize(int p0);
    DatagramChannelConfig setRecvByteBufAllocator(RecvByteBufAllocator p0);
    DatagramChannelConfig setReuseAddress(boolean p0);
    DatagramChannelConfig setSendBufferSize(int p0);
    DatagramChannelConfig setTimeToLive(int p0);
    DatagramChannelConfig setTrafficClass(int p0);
    DatagramChannelConfig setWriteBufferWaterMark(WriteBufferWaterMark p0);
    DatagramChannelConfig setWriteSpinCount(int p0);
    InetAddress getInterface();
    NetworkInterface getNetworkInterface();
    boolean isBroadcast();
    boolean isLoopbackModeDisabled();
    boolean isReuseAddress();
    int getReceiveBufferSize();
    int getSendBufferSize();
    int getTimeToLive();
    int getTrafficClass();
}
