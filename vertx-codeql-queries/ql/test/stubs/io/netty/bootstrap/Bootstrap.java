// Generated automatically from io.netty.bootstrap.Bootstrap for testing purposes

package io.netty.bootstrap;

import io.netty.bootstrap.AbstractBootstrap;
import io.netty.bootstrap.BootstrapConfig;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.resolver.AddressResolverGroup;
import java.net.InetAddress;

public class Bootstrap extends AbstractBootstrap<Bootstrap, Channel>
{
    public Bootstrap clone(){ return null; }
    public Bootstrap clone(EventLoopGroup p0){ return null; }
    public Bootstrap remoteAddress(InetAddress p0, int p1){ return null; }
    public Bootstrap remoteAddress(String p0, int p1){ return null; }
    public Bootstrap remoteAddress(java.net.SocketAddress p0){ return null; }
    public Bootstrap resolver(AddressResolverGroup<? extends Object> p0){ return null; }
    public Bootstrap validate(){ return null; }
    public Bootstrap(){}
    public ChannelFuture connect(){ return null; }
    public ChannelFuture connect(InetAddress p0, int p1){ return null; }
    public ChannelFuture connect(String p0, int p1){ return null; }
    public ChannelFuture connect(java.net.SocketAddress p0){ return null; }
    public ChannelFuture connect(java.net.SocketAddress p0, java.net.SocketAddress p1){ return null; }
    public final BootstrapConfig config(){ return null; }
}
