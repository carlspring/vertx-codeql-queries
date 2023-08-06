// Generated automatically from io.netty.channel.Channel for testing purposes

package io.netty.channel;

import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelId;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.ChannelOutboundBuffer;
import io.netty.channel.ChannelOutboundInvoker;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelPromise;
import io.netty.channel.EventLoop;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.util.AttributeMap;

public interface Channel extends AttributeMap, ChannelOutboundInvoker, Comparable<Channel>
{
    ByteBufAllocator alloc();
    Channel flush();
    Channel parent();
    Channel read();
    Channel.Unsafe unsafe();
    ChannelConfig config();
    ChannelFuture closeFuture();
    ChannelId id();
    ChannelMetadata metadata();
    ChannelPipeline pipeline();
    EventLoop eventLoop();
    boolean isActive();
    boolean isOpen();
    boolean isRegistered();
    boolean isWritable();
    java.net.SocketAddress localAddress();
    java.net.SocketAddress remoteAddress();
    long bytesBeforeUnwritable();
    long bytesBeforeWritable();
    static public interface Unsafe
    {
        ChannelOutboundBuffer outboundBuffer();
        ChannelPromise voidPromise();
        RecvByteBufAllocator.Handle recvBufAllocHandle();
        java.net.SocketAddress localAddress();
        java.net.SocketAddress remoteAddress();
        void beginRead();
        void bind(java.net.SocketAddress p0, ChannelPromise p1);
        void close(ChannelPromise p0);
        void closeForcibly();
        void connect(java.net.SocketAddress p0, java.net.SocketAddress p1, ChannelPromise p2);
        void deregister(ChannelPromise p0);
        void disconnect(ChannelPromise p0);
        void flush();
        void register(EventLoop p0, ChannelPromise p1);
        void write(Object p0, ChannelPromise p1);
    }
}
