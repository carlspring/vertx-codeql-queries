// Generated automatically from io.netty.bootstrap.AbstractBootstrap for testing purposes

package io.netty.bootstrap;

import io.netty.bootstrap.AbstractBootstrapConfig;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.util.AttributeKey;
import java.net.InetAddress;

abstract public class AbstractBootstrap<B extends AbstractBootstrap<B, C>, C extends Channel> implements Cloneable
{
    public <T> B attr(io.netty.util.AttributeKey<T> p0, T p1){ return null; }
    public <T> B option(io.netty.channel.ChannelOption<T> p0, T p1){ return null; }
    public B channel(Class<? extends C> p0){ return null; }
    public B channelFactory(io.netty.bootstrap.ChannelFactory<? extends C> p0){ return null; }
    public B channelFactory(io.netty.channel.ChannelFactory<? extends C> p0){ return null; }
    public B group(EventLoopGroup p0){ return null; }
    public B handler(ChannelHandler p0){ return null; }
    public B localAddress(InetAddress p0, int p1){ return null; }
    public B localAddress(String p0, int p1){ return null; }
    public B localAddress(int p0){ return null; }
    public B localAddress(java.net.SocketAddress p0){ return null; }
    public B validate(){ return null; }
    public ChannelFuture bind(){ return null; }
    public ChannelFuture bind(InetAddress p0, int p1){ return null; }
    public ChannelFuture bind(String p0, int p1){ return null; }
    public ChannelFuture bind(int p0){ return null; }
    public ChannelFuture bind(java.net.SocketAddress p0){ return null; }
    public ChannelFuture register(){ return null; }
    public String toString(){ return null; }
    public abstract AbstractBootstrapConfig<B, C> config();
    public abstract B clone();
    public final EventLoopGroup group(){ return null; }
}
