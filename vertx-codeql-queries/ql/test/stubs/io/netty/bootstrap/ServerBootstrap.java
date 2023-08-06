// Generated automatically from io.netty.bootstrap.ServerBootstrap for testing purposes

package io.netty.bootstrap;

import io.netty.bootstrap.AbstractBootstrap;
import io.netty.bootstrap.ServerBootstrapConfig;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.ServerChannel;
import io.netty.util.AttributeKey;

public class ServerBootstrap extends AbstractBootstrap<ServerBootstrap, ServerChannel>
{
    public <T> ServerBootstrap childAttr(io.netty.util.AttributeKey<T> p0, T p1){ return null; }
    public <T> ServerBootstrap childOption(io.netty.channel.ChannelOption<T> p0, T p1){ return null; }
    public EventLoopGroup childGroup(){ return null; }
    public ServerBootstrap childHandler(ChannelHandler p0){ return null; }
    public ServerBootstrap clone(){ return null; }
    public ServerBootstrap group(EventLoopGroup p0){ return null; }
    public ServerBootstrap group(EventLoopGroup p0, EventLoopGroup p1){ return null; }
    public ServerBootstrap validate(){ return null; }
    public ServerBootstrap(){}
    public final ServerBootstrapConfig config(){ return null; }
}
