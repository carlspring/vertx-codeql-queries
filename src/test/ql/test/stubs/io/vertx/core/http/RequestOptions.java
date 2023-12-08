// Generated automatically from io.vertx.core.http.RequestOptions for testing purposes

package io.vertx.core.http;

import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.ProxyOptions;
import java.net.URL;

public class RequestOptions
{
    public Boolean getFollowRedirects(){ return null; }
    public Boolean isSsl(){ return null; }
    public Integer getPort(){ return null; }
    public JsonObject toJson(){ return null; }
    public MultiMap getHeaders(){ return null; }
    public ProxyOptions getProxyOptions(){ return null; }
    public RequestOptions addHeader(CharSequence p0, CharSequence p1){ return null; }
    public RequestOptions addHeader(CharSequence p0, Iterable<CharSequence> p1){ return null; }
    public RequestOptions addHeader(String p0, String p1){ return null; }
    public RequestOptions putHeader(CharSequence p0, CharSequence p1){ return null; }
    public RequestOptions putHeader(CharSequence p0, Iterable<CharSequence> p1){ return null; }
    public RequestOptions putHeader(String p0, String p1){ return null; }
    public RequestOptions removeHeader(CharSequence p0){ return null; }
    public RequestOptions removeHeader(String p0){ return null; }
    public RequestOptions setAbsoluteURI(String p0){ return null; }
    public RequestOptions setAbsoluteURI(URL p0){ return null; }
    public RequestOptions setFollowRedirects(Boolean p0){ return null; }
    public RequestOptions setHeaders(MultiMap p0){ return null; }
    public RequestOptions setHost(String p0){ return null; }
    public RequestOptions setMethod(io.vertx.core.http.HttpMethod p0){ return null; }
    public RequestOptions setPort(Integer p0){ return null; }
    public RequestOptions setProxyOptions(ProxyOptions p0){ return null; }
    public RequestOptions setServer(io.vertx.core.net.SocketAddress p0){ return null; }
    public RequestOptions setSsl(Boolean p0){ return null; }
    public RequestOptions setTimeout(long p0){ return null; }
    public RequestOptions setTraceOperation(String p0){ return null; }
    public RequestOptions setURI(String p0){ return null; }
    public RequestOptions(){}
    public RequestOptions(JsonObject p0){}
    public RequestOptions(RequestOptions p0){}
    public String getHost(){ return null; }
    public String getTraceOperation(){ return null; }
    public String getURI(){ return null; }
    public io.vertx.core.http.HttpMethod getMethod(){ return null; }
    public io.vertx.core.net.SocketAddress getServer(){ return null; }
    public long getTimeout(){ return 0; }
    public static Boolean DEFAULT_SSL = null;
    public static Integer DEFAULT_PORT = null;
    public static ProxyOptions DEFAULT_PROXY_OPTIONS = null;
    public static String DEFAULT_HOST = null;
    public static String DEFAULT_URI = null;
    public static boolean DEFAULT_FOLLOW_REDIRECTS = false;
    public static io.vertx.core.http.HttpMethod DEFAULT_HTTP_METHOD = null;
    public static io.vertx.core.net.SocketAddress DEFAULT_SERVER = null;
    public static long DEFAULT_TIMEOUT = 0;
}
