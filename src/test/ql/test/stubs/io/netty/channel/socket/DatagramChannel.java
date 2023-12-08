// Generated automatically from io.netty.channel.socket.DatagramChannel for testing purposes

package io.netty.channel.socket;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import io.netty.channel.socket.DatagramChannelConfig;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;

public interface DatagramChannel extends Channel
{
    ChannelFuture block(InetAddress p0, InetAddress p1);
    ChannelFuture block(InetAddress p0, InetAddress p1, ChannelPromise p2);
    ChannelFuture block(InetAddress p0, NetworkInterface p1, InetAddress p2);
    ChannelFuture block(InetAddress p0, NetworkInterface p1, InetAddress p2, ChannelPromise p3);
    ChannelFuture joinGroup(InetAddress p0);
    ChannelFuture joinGroup(InetAddress p0, ChannelPromise p1);
    ChannelFuture joinGroup(InetAddress p0, NetworkInterface p1, InetAddress p2);
    ChannelFuture joinGroup(InetAddress p0, NetworkInterface p1, InetAddress p2, ChannelPromise p3);
    ChannelFuture joinGroup(InetSocketAddress p0, NetworkInterface p1);
    ChannelFuture joinGroup(InetSocketAddress p0, NetworkInterface p1, ChannelPromise p2);
    ChannelFuture leaveGroup(InetAddress p0);
    ChannelFuture leaveGroup(InetAddress p0, ChannelPromise p1);
    ChannelFuture leaveGroup(InetAddress p0, NetworkInterface p1, InetAddress p2);
    ChannelFuture leaveGroup(InetAddress p0, NetworkInterface p1, InetAddress p2, ChannelPromise p3);
    ChannelFuture leaveGroup(InetSocketAddress p0, NetworkInterface p1);
    ChannelFuture leaveGroup(InetSocketAddress p0, NetworkInterface p1, ChannelPromise p2);
    DatagramChannelConfig config();
    InetSocketAddress localAddress();
    InetSocketAddress remoteAddress();
    boolean isConnected();
}
