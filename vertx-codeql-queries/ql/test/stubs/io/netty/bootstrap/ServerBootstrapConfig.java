// Generated automatically from io.netty.bootstrap.ServerBootstrapConfig for testing purposes

package io.netty.bootstrap;

import io.netty.bootstrap.AbstractBootstrap;
import io.netty.bootstrap.AbstractBootstrapConfig;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.ServerChannel;
import io.netty.util.AttributeKey;
import java.util.Map;

public class ServerBootstrapConfig extends AbstractBootstrapConfig<ServerBootstrap, ServerChannel>
{
    protected ServerBootstrapConfig() {}
    public ChannelHandler childHandler(){ return null; }
    public EventLoopGroup childGroup(){ return null; }
    public Map<AttributeKey<? extends Object>, Object> childAttrs(){ return null; }
    public Map<ChannelOption<? extends Object>, Object> childOptions(){ return null; }
    public String toString(){ return null; }
}
