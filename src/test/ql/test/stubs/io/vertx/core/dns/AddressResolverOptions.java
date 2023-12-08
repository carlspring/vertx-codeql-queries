// Generated automatically from io.vertx.core.dns.AddressResolverOptions for testing purposes

package io.vertx.core.dns;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import java.util.List;

public class AddressResolverOptions
{
    public AddressResolverOptions addSearchDomain(String p0){ return null; }
    public AddressResolverOptions addServer(String p0){ return null; }
    public AddressResolverOptions setCacheMaxTimeToLive(int p0){ return null; }
    public AddressResolverOptions setCacheMinTimeToLive(int p0){ return null; }
    public AddressResolverOptions setCacheNegativeTimeToLive(int p0){ return null; }
    public AddressResolverOptions setHostsPath(String p0){ return null; }
    public AddressResolverOptions setHostsValue(Buffer p0){ return null; }
    public AddressResolverOptions setMaxQueries(int p0){ return null; }
    public AddressResolverOptions setNdots(int p0){ return null; }
    public AddressResolverOptions setOptResourceEnabled(boolean p0){ return null; }
    public AddressResolverOptions setQueryTimeout(long p0){ return null; }
    public AddressResolverOptions setRdFlag(boolean p0){ return null; }
    public AddressResolverOptions setRotateServers(boolean p0){ return null; }
    public AddressResolverOptions setRoundRobinInetAddress(boolean p0){ return null; }
    public AddressResolverOptions setSearchDomains(List<String> p0){ return null; }
    public AddressResolverOptions setServers(List<String> p0){ return null; }
    public AddressResolverOptions(){}
    public AddressResolverOptions(AddressResolverOptions p0){}
    public AddressResolverOptions(JsonObject p0){}
    public Buffer getHostsValue(){ return null; }
    public JsonObject toJson(){ return null; }
    public List<String> getSearchDomains(){ return null; }
    public List<String> getServers(){ return null; }
    public String getHostsPath(){ return null; }
    public boolean getRdFlag(){ return false; }
    public boolean isOptResourceEnabled(){ return false; }
    public boolean isRotateServers(){ return false; }
    public boolean isRoundRobinInetAddress(){ return false; }
    public int getCacheMaxTimeToLive(){ return 0; }
    public int getCacheMinTimeToLive(){ return 0; }
    public int getCacheNegativeTimeToLive(){ return 0; }
    public int getMaxQueries(){ return 0; }
    public int getNdots(){ return 0; }
    public long getQueryTimeout(){ return 0; }
    public static List<String> DEFAULT_SEACH_DOMAINS = null;
    public static List<String> DEFAULT_SERVERS = null;
    public static boolean DEFAULT_OPT_RESOURCE_ENABLED = false;
    public static boolean DEFAULT_RD_FLAG = false;
    public static boolean DEFAULT_ROTATE_SERVERS = false;
    public static boolean DEFAULT_ROUND_ROBIN_INET_ADDRESS = false;
    public static int DEFAULT_CACHE_MAX_TIME_TO_LIVE = 0;
    public static int DEFAULT_CACHE_MIN_TIME_TO_LIVE = 0;
    public static int DEFAULT_CACHE_NEGATIVE_TIME_TO_LIVE = 0;
    public static int DEFAULT_MAX_QUERIES = 0;
    public static int DEFAULT_NDOTS = 0;
    public static int DEFAULT_QUERY_TIMEOUT = 0;
}
