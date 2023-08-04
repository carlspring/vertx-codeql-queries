// Generated automatically from io.vertx.core.impl.VertxBuilder for testing purposes

package io.vertx.core.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.core.spi.ExecutorServiceFactory;
import io.vertx.core.spi.VertxThreadFactory;
import io.vertx.core.spi.cluster.ClusterManager;
import io.vertx.core.spi.cluster.NodeSelector;
import io.vertx.core.spi.file.FileResolver;
import io.vertx.core.spi.metrics.VertxMetrics;
import io.vertx.core.spi.tracing.VertxTracer;
import io.vertx.core.spi.transport.Transport;

public class VertxBuilder
{
    public ClusterManager clusterManager(){ return null; }
    public ExecutorServiceFactory executorServiceFactory(){ return null; }
    public FileResolver fileResolver(){ return null; }
    public JsonObject config(){ return null; }
    public NodeSelector clusterNodeSelector(){ return null; }
    public Transport findTransport(){ return null; }
    public Vertx vertx(){ return null; }
    public VertxBuilder clusterManager(ClusterManager p0){ return null; }
    public VertxBuilder clusterNodeSelector(NodeSelector p0){ return null; }
    public VertxBuilder executorServiceFactory(ExecutorServiceFactory p0){ return null; }
    public VertxBuilder fileResolver(FileResolver p0){ return null; }
    public VertxBuilder findTransport(Transport p0){ return null; }
    public VertxBuilder init(){ return null; }
    public VertxBuilder metrics(VertxMetrics p0){ return null; }
    public VertxBuilder threadFactory(VertxThreadFactory p0){ return null; }
    public VertxBuilder tracer(VertxTracer p0){ return null; }
    public VertxBuilder(){}
    public VertxBuilder(JsonObject p0){}
    public VertxBuilder(VertxOptions p0){}
    public VertxMetrics metrics(){ return null; }
    public VertxOptions options(){ return null; }
    public VertxThreadFactory threadFactory(){ return null; }
    public VertxTracer tracer(){ return null; }
    public static Transport nativeTransport(){ return null; }
    public void clusteredVertx(Handler<AsyncResult<Vertx>> p0){}
}
