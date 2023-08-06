// Generated automatically from io.netty.resolver.AddressResolverGroup for testing purposes

package io.netty.resolver;

import io.netty.resolver.AddressResolver;
import io.netty.util.concurrent.EventExecutor;
import java.io.Closeable;

abstract public class AddressResolverGroup<T extends java.net.SocketAddress> implements Closeable
{
    protected AddressResolverGroup(){}
    protected abstract AddressResolver<T> newResolver(EventExecutor p0);
    public AddressResolver<T> getResolver(EventExecutor p0){ return null; }
    public void close(){}
}
