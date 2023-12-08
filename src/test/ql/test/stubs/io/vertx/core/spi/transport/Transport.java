// Generated automatically from io.vertx.core.spi.transport.Transport for testing purposes

package io.vertx.core.spi.transport;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.ServerChannel;
import io.netty.channel.socket.DatagramChannel;
import io.netty.channel.socket.InternetProtocolFamily;
import io.vertx.core.datagram.DatagramSocketOptions;
import io.vertx.core.net.ClientOptionsBase;
import io.vertx.core.net.NetServerOptions;
import java.util.concurrent.ThreadFactory;

public interface Transport
{
    DatagramChannel datagramChannel();
    DatagramChannel datagramChannel(InternetProtocolFamily p0);
    EventLoopGroup eventLoopGroup(int p0, int p1, ThreadFactory p2, int p3);
    default Throwable unavailabilityCause(){ return null; }
    default boolean isAvailable(){ return false; }
    default boolean supportFileRegion(){ return false; }
    default boolean supportsDomainSockets(){ return false; }
    default io.vertx.core.net.SocketAddress convert(java.net.SocketAddress p0){ return null; }
    default java.net.SocketAddress convert(io.vertx.core.net.SocketAddress p0){ return null; }
    default void configure(ClientOptionsBase p0, boolean p1, Bootstrap p2){}
    default void configure(DatagramChannel p0, DatagramSocketOptions p1){}
    default void configure(NetServerOptions p0, boolean p1, ServerBootstrap p2){}
    io.netty.channel.ChannelFactory<? extends Channel> channelFactory(boolean p0);
    io.netty.channel.ChannelFactory<? extends ServerChannel> serverChannelFactory(boolean p0);
    static int ACCEPTOR_EVENT_LOOP_GROUP = 0;
    static int IO_EVENT_LOOP_GROUP = 0;
}
