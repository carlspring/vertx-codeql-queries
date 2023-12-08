// Generated automatically from io.netty.resolver.AddressResolver for testing purposes

package io.netty.resolver;

import io.netty.util.concurrent.Promise;
import java.io.Closeable;
import java.util.List;

public interface AddressResolver<T extends java.net.SocketAddress> extends Closeable
{
    boolean isResolved(java.net.SocketAddress p0);
    boolean isSupported(java.net.SocketAddress p0);
    io.netty.util.concurrent.Future<T> resolve(java.net.SocketAddress p0);
    io.netty.util.concurrent.Future<T> resolve(java.net.SocketAddress p0, Promise<T> p1);
    io.netty.util.concurrent.Future<java.util.List<T>> resolveAll(java.net.SocketAddress p0);
    io.netty.util.concurrent.Future<java.util.List<T>> resolveAll(java.net.SocketAddress p0, Promise<java.util.List<T>> p1);
    void close();
}
