// Generated automatically from io.vertx.core.VertxOptions for testing purposes

package io.vertx.core;

import io.vertx.core.dns.AddressResolverOptions;
import io.vertx.core.eventbus.EventBusOptions;
import io.vertx.core.file.FileSystemOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.core.metrics.MetricsOptions;
import io.vertx.core.spi.cluster.ClusterManager;
import io.vertx.core.tracing.TracingOptions;
import java.util.concurrent.TimeUnit;

public class VertxOptions
{
    public AddressResolverOptions getAddressResolverOptions(){ return null; }
    public Boolean getUseDaemonThread(){ return null; }
    public ClusterManager getClusterManager(){ return null; }
    public EventBusOptions getEventBusOptions(){ return null; }
    public FileSystemOptions getFileSystemOptions(){ return null; }
    public JsonObject toJson(){ return null; }
    public MetricsOptions getMetricsOptions(){ return null; }
    public String getHAGroup(){ return null; }
    public String toString(){ return null; }
    public TimeUnit getBlockedThreadCheckIntervalUnit(){ return null; }
    public TimeUnit getMaxEventLoopExecuteTimeUnit(){ return null; }
    public TimeUnit getMaxWorkerExecuteTimeUnit(){ return null; }
    public TimeUnit getWarningExceptionTimeUnit(){ return null; }
    public TracingOptions getTracingOptions(){ return null; }
    public VertxOptions setAddressResolverOptions(AddressResolverOptions p0){ return null; }
    public VertxOptions setBlockedThreadCheckInterval(long p0){ return null; }
    public VertxOptions setBlockedThreadCheckIntervalUnit(TimeUnit p0){ return null; }
    public VertxOptions setClusterManager(ClusterManager p0){ return null; }
    public VertxOptions setDisableTCCL(boolean p0){ return null; }
    public VertxOptions setEventBusOptions(EventBusOptions p0){ return null; }
    public VertxOptions setEventLoopPoolSize(int p0){ return null; }
    public VertxOptions setFileSystemOptions(FileSystemOptions p0){ return null; }
    public VertxOptions setHAEnabled(boolean p0){ return null; }
    public VertxOptions setHAGroup(String p0){ return null; }
    public VertxOptions setInternalBlockingPoolSize(int p0){ return null; }
    public VertxOptions setMaxEventLoopExecuteTime(long p0){ return null; }
    public VertxOptions setMaxEventLoopExecuteTimeUnit(TimeUnit p0){ return null; }
    public VertxOptions setMaxWorkerExecuteTime(long p0){ return null; }
    public VertxOptions setMaxWorkerExecuteTimeUnit(TimeUnit p0){ return null; }
    public VertxOptions setMetricsOptions(MetricsOptions p0){ return null; }
    public VertxOptions setPreferNativeTransport(boolean p0){ return null; }
    public VertxOptions setQuorumSize(int p0){ return null; }
    public VertxOptions setTracingOptions(TracingOptions p0){ return null; }
    public VertxOptions setUseDaemonThread(Boolean p0){ return null; }
    public VertxOptions setWarningExceptionTime(long p0){ return null; }
    public VertxOptions setWarningExceptionTimeUnit(TimeUnit p0){ return null; }
    public VertxOptions setWorkerPoolSize(int p0){ return null; }
    public VertxOptions(){}
    public VertxOptions(JsonObject p0){}
    public VertxOptions(VertxOptions p0){}
    public boolean getDisableTCCL(){ return false; }
    public boolean getPreferNativeTransport(){ return false; }
    public boolean isHAEnabled(){ return false; }
    public int getEventLoopPoolSize(){ return 0; }
    public int getInternalBlockingPoolSize(){ return 0; }
    public int getQuorumSize(){ return 0; }
    public int getWorkerPoolSize(){ return 0; }
    public long getBlockedThreadCheckInterval(){ return 0; }
    public long getMaxEventLoopExecuteTime(){ return 0; }
    public long getMaxWorkerExecuteTime(){ return 0; }
    public long getWarningExceptionTime(){ return 0; }
    public static String DEFAULT_HA_GROUP = null;
    public static TimeUnit DEFAULT_BLOCKED_THREAD_CHECK_INTERVAL_UNIT = null;
    public static TimeUnit DEFAULT_MAX_EVENT_LOOP_EXECUTE_TIME_UNIT = null;
    public static TimeUnit DEFAULT_MAX_WORKER_EXECUTE_TIME_UNIT = null;
    public static TimeUnit DEFAULT_WARNING_EXCEPTION_TIME_UNIT = null;
    public static boolean DEFAULT_DISABLE_TCCL = false;
    public static boolean DEFAULT_HA_ENABLED = false;
    public static boolean DEFAULT_PREFER_NATIVE_TRANSPORT = false;
    public static boolean DEFAULT_USE_DAEMON_THREAD = false;
    public static int DEFAULT_EVENT_LOOP_POOL_SIZE = 0;
    public static int DEFAULT_INTERNAL_BLOCKING_POOL_SIZE = 0;
    public static int DEFAULT_QUORUM_SIZE = 0;
    public static int DEFAULT_WORKER_POOL_SIZE = 0;
    public static long DEFAULT_BLOCKED_THREAD_CHECK_INTERVAL = 0;
    public static long DEFAULT_MAX_EVENT_LOOP_EXECUTE_TIME = 0;
    public static long DEFAULT_MAX_WORKER_EXECUTE_TIME = 0;
}
