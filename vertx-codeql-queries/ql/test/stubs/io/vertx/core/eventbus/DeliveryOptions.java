// Generated automatically from io.vertx.core.eventbus.DeliveryOptions for testing purposes

package io.vertx.core.eventbus;

import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;
import io.vertx.core.tracing.TracingPolicy;

public class DeliveryOptions
{
    public DeliveryOptions addHeader(String p0, String p1){ return null; }
    public DeliveryOptions setCodecName(String p0){ return null; }
    public DeliveryOptions setHeaders(MultiMap p0){ return null; }
    public DeliveryOptions setLocalOnly(boolean p0){ return null; }
    public DeliveryOptions setSendTimeout(long p0){ return null; }
    public DeliveryOptions setTracingPolicy(TracingPolicy p0){ return null; }
    public DeliveryOptions(){}
    public DeliveryOptions(DeliveryOptions p0){}
    public DeliveryOptions(JsonObject p0){}
    public JsonObject toJson(){ return null; }
    public MultiMap getHeaders(){ return null; }
    public String getCodecName(){ return null; }
    public TracingPolicy getTracingPolicy(){ return null; }
    public boolean isLocalOnly(){ return false; }
    public long getSendTimeout(){ return 0; }
    public static TracingPolicy DEFAULT_TRACING_POLICY = null;
    public static boolean DEFAULT_LOCAL_ONLY = false;
    public static long DEFAULT_TIMEOUT = 0;
}
