// Generated automatically from io.vertx.core.DeploymentOptions for testing purposes

package io.vertx.core;

import io.vertx.core.json.JsonObject;
import java.util.concurrent.TimeUnit;

public class DeploymentOptions
{
    public ClassLoader getClassLoader(){ return null; }
    public DeploymentOptions setClassLoader(ClassLoader p0){ return null; }
    public DeploymentOptions setConfig(JsonObject p0){ return null; }
    public DeploymentOptions setHa(boolean p0){ return null; }
    public DeploymentOptions setInstances(int p0){ return null; }
    public DeploymentOptions setMaxWorkerExecuteTime(long p0){ return null; }
    public DeploymentOptions setMaxWorkerExecuteTimeUnit(TimeUnit p0){ return null; }
    public DeploymentOptions setWorker(boolean p0){ return null; }
    public DeploymentOptions setWorkerPoolName(String p0){ return null; }
    public DeploymentOptions setWorkerPoolSize(int p0){ return null; }
    public DeploymentOptions(){}
    public DeploymentOptions(DeploymentOptions p0){}
    public DeploymentOptions(JsonObject p0){}
    public JsonObject getConfig(){ return null; }
    public JsonObject toJson(){ return null; }
    public String getWorkerPoolName(){ return null; }
    public TimeUnit getMaxWorkerExecuteTimeUnit(){ return null; }
    public boolean isHa(){ return false; }
    public boolean isWorker(){ return false; }
    public int getInstances(){ return 0; }
    public int getWorkerPoolSize(){ return 0; }
    public long getMaxWorkerExecuteTime(){ return 0; }
    public static boolean DEFAULT_HA = false;
    public static boolean DEFAULT_WORKER = false;
    public static int DEFAULT_INSTANCES = 0;
    public void checkIsolationNotDefined(){}
    public void fromJson(JsonObject p0){}
}
