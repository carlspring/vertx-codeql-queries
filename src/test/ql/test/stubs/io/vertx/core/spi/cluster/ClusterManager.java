// Generated automatically from io.vertx.core.spi.cluster.ClusterManager for testing purposes

package io.vertx.core.spi.cluster;

import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.impl.VertxBuilder;
import io.vertx.core.shareddata.AsyncMap;
import io.vertx.core.shareddata.Counter;
import io.vertx.core.shareddata.Lock;
import io.vertx.core.spi.VertxServiceProvider;
import io.vertx.core.spi.cluster.NodeInfo;
import io.vertx.core.spi.cluster.NodeListener;
import io.vertx.core.spi.cluster.NodeSelector;
import io.vertx.core.spi.cluster.RegistrationInfo;
import java.util.List;
import java.util.Map;

public interface ClusterManager extends VertxServiceProvider
{
    <K, V> java.util.Map<K, V> getSyncMap(String p0);
    <K, V> void getAsyncMap(String p0, Promise<io.vertx.core.shareddata.AsyncMap<K, V>> p1);
    List<String> getNodes();
    NodeInfo getNodeInfo();
    String getNodeId();
    boolean isActive();
    default String clusterHost(){ return null; }
    default String clusterPublicHost(){ return null; }
    default void init(VertxBuilder p0){}
    void addRegistration(String p0, RegistrationInfo p1, Promise<Void> p2);
    void getCounter(String p0, Promise<Counter> p1);
    void getLockWithTimeout(String p0, long p1, Promise<Lock> p2);
    void getNodeInfo(String p0, Promise<NodeInfo> p1);
    void getRegistrations(String p0, Promise<List<RegistrationInfo>> p1);
    void init(Vertx p0, NodeSelector p1);
    void join(Promise<Void> p0);
    void leave(Promise<Void> p0);
    void nodeListener(NodeListener p0);
    void removeRegistration(String p0, RegistrationInfo p1, Promise<Void> p2);
    void setNodeInfo(NodeInfo p0, Promise<Void> p1);
}
