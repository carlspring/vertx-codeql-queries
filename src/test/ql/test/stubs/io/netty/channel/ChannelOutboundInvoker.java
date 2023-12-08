// Generated automatically from io.netty.channel.ChannelOutboundInvoker for testing purposes

package io.netty.channel;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelProgressivePromise;
import io.netty.channel.ChannelPromise;

public interface ChannelOutboundInvoker
{
    ChannelFuture bind(java.net.SocketAddress p0);
    ChannelFuture bind(java.net.SocketAddress p0, ChannelPromise p1);
    ChannelFuture close();
    ChannelFuture close(ChannelPromise p0);
    ChannelFuture connect(java.net.SocketAddress p0);
    ChannelFuture connect(java.net.SocketAddress p0, ChannelPromise p1);
    ChannelFuture connect(java.net.SocketAddress p0, java.net.SocketAddress p1);
    ChannelFuture connect(java.net.SocketAddress p0, java.net.SocketAddress p1, ChannelPromise p2);
    ChannelFuture deregister();
    ChannelFuture deregister(ChannelPromise p0);
    ChannelFuture disconnect();
    ChannelFuture disconnect(ChannelPromise p0);
    ChannelFuture newFailedFuture(Throwable p0);
    ChannelFuture newSucceededFuture();
    ChannelFuture write(Object p0);
    ChannelFuture write(Object p0, ChannelPromise p1);
    ChannelFuture writeAndFlush(Object p0);
    ChannelFuture writeAndFlush(Object p0, ChannelPromise p1);
    ChannelOutboundInvoker flush();
    ChannelOutboundInvoker read();
    ChannelProgressivePromise newProgressivePromise();
    ChannelPromise newPromise();
    ChannelPromise voidPromise();
}
