// Generated automatically from io.vertx.core.Vertx for testing purposes

package io.vertx.core;

import io.netty.channel.EventLoopGroup;
import io.vertx.core.AsyncResult;
import io.vertx.core.Context;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Promise;
import io.vertx.core.TimeoutStream;
import io.vertx.core.Verticle;
import io.vertx.core.VertxOptions;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.datagram.DatagramSocket;
import io.vertx.core.datagram.DatagramSocketOptions;
import io.vertx.core.dns.DnsClient;
import io.vertx.core.dns.DnsClientOptions;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.file.FileSystem;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.HttpClientOptions;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.NetClient;
import io.vertx.core.net.NetClientOptions;
import io.vertx.core.net.NetServer;
import io.vertx.core.net.NetServerOptions;
import io.vertx.core.shareddata.SharedData;
import io.vertx.core.spi.VerticleFactory;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public interface Vertx extends Measured
{
    Context getOrCreateContext();
    DatagramSocket createDatagramSocket(DatagramSocketOptions p0);
    DnsClient createDnsClient();
    DnsClient createDnsClient(DnsClientOptions p0);
    DnsClient createDnsClient(int p0, String p1);
    EventBus eventBus();
    EventLoopGroup nettyEventLoopGroup();
    FileSystem fileSystem();
    Future<String> deployVerticle(Class<? extends Verticle> p0, DeploymentOptions p1);
    Future<String> deployVerticle(String p0, DeploymentOptions p1);
    Future<String> deployVerticle(Supplier<Verticle> p0, DeploymentOptions p1);
    Future<String> deployVerticle(Verticle p0, DeploymentOptions p1);
    Future<Void> close();
    Future<Void> undeploy(String p0);
    Handler<Throwable> exceptionHandler();
    HttpClient createHttpClient(HttpClientOptions p0);
    HttpServer createHttpServer(HttpServerOptions p0);
    NetClient createNetClient(NetClientOptions p0);
    NetServer createNetServer(NetServerOptions p0);
    Set<String> deploymentIDs();
    Set<VerticleFactory> verticleFactories();
    SharedData sharedData();
    Throwable unavailableNativeTransportCause();
    TimeoutStream periodicStream(long p0, long p1);
    TimeoutStream timerStream(long p0);
    Vertx exceptionHandler(Handler<Throwable> p0);
    WorkerExecutor createSharedWorkerExecutor(String p0);
    WorkerExecutor createSharedWorkerExecutor(String p0, int p1);
    WorkerExecutor createSharedWorkerExecutor(String p0, int p1, long p2);
    WorkerExecutor createSharedWorkerExecutor(String p0, int p1, long p2, TimeUnit p3);
    boolean cancelTimer(long p0);
    boolean isClustered();
    boolean isNativeTransportEnabled();
    default <T> io.vertx.core.Future<T> executeBlocking(io.vertx.core.Handler<io.vertx.core.Promise<T>> p0){ return null; }
    default <T> io.vertx.core.Future<T> executeBlocking(io.vertx.core.Handler<io.vertx.core.Promise<T>> p0, boolean p1){ return null; }
    default <T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Promise<T>> p0, boolean p1, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> p2){}
    default <T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Promise<T>> p0, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> p1){}
    default DatagramSocket createDatagramSocket(){ return null; }
    default Future<String> deployVerticle(String p0){ return null; }
    default Future<String> deployVerticle(Verticle p0){ return null; }
    default HttpClient createHttpClient(){ return null; }
    default HttpServer createHttpServer(){ return null; }
    default NetClient createNetClient(){ return null; }
    default NetServer createNetServer(){ return null; }
    default TimeoutStream periodicStream(long p0){ return null; }
    default long setPeriodic(long p0, Handler<Long> p1){ return 0; }
    default void deployVerticle(String p0, Handler<AsyncResult<String>> p1){}
    long setPeriodic(long p0, long p1, Handler<Long> p2);
    long setTimer(long p0, Handler<Long> p1);
    static Context currentContext(){ return null; }
    static Future<Vertx> clusteredVertx(VertxOptions p0){ return null; }
    static Vertx vertx(){ return null; }
    static Vertx vertx(VertxOptions p0){ return null; }
    static void clusteredVertx(VertxOptions p0, Handler<AsyncResult<Vertx>> p1){}
    void close(Handler<AsyncResult<Void>> p0);
    void deployVerticle(Class<? extends Verticle> p0, DeploymentOptions p1, Handler<AsyncResult<String>> p2);
    void deployVerticle(String p0, DeploymentOptions p1, Handler<AsyncResult<String>> p2);
    void deployVerticle(Supplier<Verticle> p0, DeploymentOptions p1, Handler<AsyncResult<String>> p2);
    void deployVerticle(Verticle p0, DeploymentOptions p1, Handler<AsyncResult<String>> p2);
    void deployVerticle(Verticle p0, Handler<AsyncResult<String>> p1);
    void registerVerticleFactory(VerticleFactory p0);
    void runOnContext(Handler<Void> p0);
    void undeploy(String p0, Handler<AsyncResult<Void>> p1);
    void unregisterVerticleFactory(VerticleFactory p0);
}
