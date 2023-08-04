// Generated automatically from io.netty.handler.ssl.SslHandler for testing purposes

package io.netty.handler.ssl;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandler;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.util.concurrent.Promise;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLEngine;

public class SslHandler extends ByteToMessageDecoder implements ChannelOutboundHandler
{
    protected SslHandler() {}
    protected void decode(ChannelHandlerContext p0, ByteBuf p1, List<Object> p2){}
    public ChannelFuture close(){ return null; }
    public ChannelFuture close(ChannelPromise p0){ return null; }
    public ChannelFuture closeOutbound(){ return null; }
    public ChannelFuture closeOutbound(ChannelPromise p0){ return null; }
    public SSLEngine engine(){ return null; }
    public SslHandler(SSLEngine p0){}
    public SslHandler(SSLEngine p0, Executor p1){}
    public SslHandler(SSLEngine p0, boolean p1){}
    public SslHandler(SSLEngine p0, boolean p1, Executor p2){}
    public String applicationProtocol(){ return null; }
    public final long getCloseNotifyFlushTimeoutMillis(){ return 0; }
    public final long getCloseNotifyReadTimeoutMillis(){ return 0; }
    public final void setCloseNotifyFlushTimeout(long p0, TimeUnit p1){}
    public final void setCloseNotifyFlushTimeoutMillis(long p0){}
    public final void setCloseNotifyReadTimeout(long p0, TimeUnit p1){}
    public final void setCloseNotifyReadTimeoutMillis(long p0){}
    public final void setWrapDataSize(int p0){}
    public io.netty.util.concurrent.Future<Channel> handshakeFuture(){ return null; }
    public io.netty.util.concurrent.Future<Channel> renegotiate(){ return null; }
    public io.netty.util.concurrent.Future<Channel> renegotiate(Promise<Channel> p0){ return null; }
    public io.netty.util.concurrent.Future<Channel> sslCloseFuture(){ return null; }
    public long getCloseNotifyTimeoutMillis(){ return 0; }
    public long getHandshakeTimeoutMillis(){ return 0; }
    public static boolean isEncrypted(ByteBuf p0){ return false; }
    public void bind(ChannelHandlerContext p0, java.net.SocketAddress p1, ChannelPromise p2){}
    public void channelActive(ChannelHandlerContext p0){}
    public void channelInactive(ChannelHandlerContext p0){}
    public void channelReadComplete(ChannelHandlerContext p0){}
    public void close(ChannelHandlerContext p0, ChannelPromise p1){}
    public void connect(ChannelHandlerContext p0, java.net.SocketAddress p1, java.net.SocketAddress p2, ChannelPromise p3){}
    public void deregister(ChannelHandlerContext p0, ChannelPromise p1){}
    public void disconnect(ChannelHandlerContext p0, ChannelPromise p1){}
    public void exceptionCaught(ChannelHandlerContext p0, Throwable p1){}
    public void flush(ChannelHandlerContext p0){}
    public void handlerAdded(ChannelHandlerContext p0){}
    public void handlerRemoved0(ChannelHandlerContext p0){}
    public void read(ChannelHandlerContext p0){}
    public void setCloseNotifyTimeout(long p0, TimeUnit p1){}
    public void setCloseNotifyTimeoutMillis(long p0){}
    public void setHandshakeTimeout(long p0, TimeUnit p1){}
    public void setHandshakeTimeoutMillis(long p0){}
    public void write(ChannelHandlerContext p0, Object p1, ChannelPromise p2){}
}
