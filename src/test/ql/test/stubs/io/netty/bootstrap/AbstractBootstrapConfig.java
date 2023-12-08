// Generated automatically from io.netty.bootstrap.AbstractBootstrapConfig for testing purposes

package io.netty.bootstrap;

import io.netty.bootstrap.AbstractBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.util.AttributeKey;
import java.util.Map;

abstract public class AbstractBootstrapConfig<B extends AbstractBootstrap<B, C>, C extends Channel>
{
    protected AbstractBootstrapConfig() {}
    protected AbstractBootstrapConfig(B p0){}
    protected final B bootstrap = null;
    public String toString(){ return null; }
    public final ChannelHandler handler(){ return null; }
    public final EventLoopGroup group(){ return null; }
    public final Map<AttributeKey<? extends Object>, Object> attrs(){ return null; }
    public final Map<ChannelOption<? extends Object>, Object> options(){ return null; }
    public final io.netty.bootstrap.ChannelFactory<? extends C> channelFactory(){ return null; }
    public final java.net.SocketAddress localAddress(){ return null; }
}
