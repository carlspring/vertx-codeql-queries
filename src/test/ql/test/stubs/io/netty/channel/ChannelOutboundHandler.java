// Generated automatically from io.netty.channel.ChannelOutboundHandler for testing purposes

package io.netty.channel;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;

public interface ChannelOutboundHandler extends ChannelHandler
{
    void bind(ChannelHandlerContext p0, java.net.SocketAddress p1, ChannelPromise p2);
    void close(ChannelHandlerContext p0, ChannelPromise p1);
    void connect(ChannelHandlerContext p0, java.net.SocketAddress p1, java.net.SocketAddress p2, ChannelPromise p3);
    void deregister(ChannelHandlerContext p0, ChannelPromise p1);
    void disconnect(ChannelHandlerContext p0, ChannelPromise p1);
    void flush(ChannelHandlerContext p0);
    void read(ChannelHandlerContext p0);
    void write(ChannelHandlerContext p0, Object p1, ChannelPromise p2);
}
