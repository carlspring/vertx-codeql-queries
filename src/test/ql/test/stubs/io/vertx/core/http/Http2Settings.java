// Generated automatically from io.vertx.core.http.Http2Settings for testing purposes

package io.vertx.core.http;

import io.vertx.core.json.JsonObject;
import java.util.Map;

public class Http2Settings
{
    public Http2Settings set(int p0, long p1){ return null; }
    public Http2Settings setExtraSettings(Map<Integer, Long> p0){ return null; }
    public Http2Settings setHeaderTableSize(long p0){ return null; }
    public Http2Settings setInitialWindowSize(int p0){ return null; }
    public Http2Settings setMaxConcurrentStreams(long p0){ return null; }
    public Http2Settings setMaxFrameSize(int p0){ return null; }
    public Http2Settings setMaxHeaderListSize(long p0){ return null; }
    public Http2Settings setPushEnabled(boolean p0){ return null; }
    public Http2Settings(){}
    public Http2Settings(Http2Settings p0){}
    public Http2Settings(JsonObject p0){}
    public JsonObject toJson(){ return null; }
    public Long get(int p0){ return null; }
    public Map<Integer, Long> getExtraSettings(){ return null; }
    public String toString(){ return null; }
    public boolean equals(Object p0){ return false; }
    public boolean isPushEnabled(){ return false; }
    public int getInitialWindowSize(){ return 0; }
    public int getMaxFrameSize(){ return 0; }
    public int hashCode(){ return 0; }
    public long getHeaderTableSize(){ return 0; }
    public long getMaxConcurrentStreams(){ return 0; }
    public long getMaxHeaderListSize(){ return 0; }
    public static Map<Integer, Long> DEFAULT_EXTRA_SETTINGS = null;
    public static boolean DEFAULT_ENABLE_PUSH = false;
    public static int DEFAULT_INITIAL_WINDOW_SIZE = 0;
    public static int DEFAULT_MAX_FRAME_SIZE = 0;
    public static int DEFAULT_MAX_HEADER_LIST_SIZE = 0;
    public static long DEFAULT_HEADER_TABLE_SIZE = 0;
    public static long DEFAULT_MAX_CONCURRENT_STREAMS = 0;
}
