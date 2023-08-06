// Generated automatically from io.vertx.core.http.WebSocketConnectOptions for testing purposes

package io.vertx.core.http;

import io.vertx.core.MultiMap;
import io.vertx.core.http.RequestOptions;
import io.vertx.core.http.WebsocketVersion;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.ProxyOptions;
import java.util.List;

public class WebSocketConnectOptions extends RequestOptions
{
    public JsonObject toJson(){ return null; }
    public List<String> getSubProtocols(){ return null; }
    public ProxyOptions getProxyOptions(){ return null; }
    public RequestOptions setProxyOptions(ProxyOptions p0){ return null; }
    public WebSocketConnectOptions addHeader(CharSequence p0, CharSequence p1){ return null; }
    public WebSocketConnectOptions addHeader(CharSequence p0, Iterable<CharSequence> p1){ return null; }
    public WebSocketConnectOptions addHeader(String p0, String p1){ return null; }
    public WebSocketConnectOptions addSubProtocol(String p0){ return null; }
    public WebSocketConnectOptions putHeader(CharSequence p0, CharSequence p1){ return null; }
    public WebSocketConnectOptions putHeader(CharSequence p0, Iterable<CharSequence> p1){ return null; }
    public WebSocketConnectOptions putHeader(String p0, String p1){ return null; }
    public WebSocketConnectOptions setAllowOriginHeader(boolean p0){ return null; }
    public WebSocketConnectOptions setHeaders(MultiMap p0){ return null; }
    public WebSocketConnectOptions setHost(String p0){ return null; }
    public WebSocketConnectOptions setPort(Integer p0){ return null; }
    public WebSocketConnectOptions setRegisterWriteHandlers(boolean p0){ return null; }
    public WebSocketConnectOptions setSsl(Boolean p0){ return null; }
    public WebSocketConnectOptions setSubProtocols(List<String> p0){ return null; }
    public WebSocketConnectOptions setTimeout(long p0){ return null; }
    public WebSocketConnectOptions setURI(String p0){ return null; }
    public WebSocketConnectOptions setVersion(WebsocketVersion p0){ return null; }
    public WebSocketConnectOptions(){}
    public WebSocketConnectOptions(JsonObject p0){}
    public WebSocketConnectOptions(WebSocketConnectOptions p0){}
    public WebsocketVersion getVersion(){ return null; }
    public boolean getAllowOriginHeader(){ return false; }
    public boolean isRegisterWriteHandlers(){ return false; }
    public static List<String> DEFAULT_SUB_PROTOCOLS = null;
    public static ProxyOptions DEFAULT_PROXY_OPTIONS = null;
    public static WebsocketVersion DEFAULT_VERSION = null;
    public static boolean DEFAULT_ALLOW_ORIGIN_HEADER = false;
    public static boolean DEFAULT_REGISTER_WRITE_HANDLERS = false;
}
