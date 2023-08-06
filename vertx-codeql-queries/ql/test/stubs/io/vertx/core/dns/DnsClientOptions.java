// Generated automatically from io.vertx.core.dns.DnsClientOptions for testing purposes

package io.vertx.core.dns;

import io.netty.handler.logging.ByteBufFormat;
import io.vertx.core.json.JsonObject;

public class DnsClientOptions
{
    public ByteBufFormat getActivityLogFormat(){ return null; }
    public DnsClientOptions setActivityLogFormat(ByteBufFormat p0){ return null; }
    public DnsClientOptions setHost(String p0){ return null; }
    public DnsClientOptions setLogActivity(boolean p0){ return null; }
    public DnsClientOptions setPort(int p0){ return null; }
    public DnsClientOptions setQueryTimeout(long p0){ return null; }
    public DnsClientOptions setRecursionDesired(boolean p0){ return null; }
    public DnsClientOptions(){}
    public DnsClientOptions(DnsClientOptions p0){}
    public DnsClientOptions(JsonObject p0){}
    public JsonObject toJson(){ return null; }
    public String getHost(){ return null; }
    public boolean getLogActivity(){ return false; }
    public boolean isRecursionDesired(){ return false; }
    public int getPort(){ return 0; }
    public long getQueryTimeout(){ return 0; }
    public static ByteBufFormat DEFAULT_LOG_ACTIVITY_FORMAT = null;
    public static String DEFAULT_HOST = null;
    public static boolean DEFAULT_LOG_ENABLED = false;
    public static boolean DEFAULT_RECURSION_DESIRED = false;
    public static int DEFAULT_PORT = 0;
    public static long DEFAULT_QUERY_TIMEOUT = 0;
}
