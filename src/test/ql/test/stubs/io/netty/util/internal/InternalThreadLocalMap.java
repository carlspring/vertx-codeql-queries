// Generated automatically from io.netty.util.internal.InternalThreadLocalMap for testing purposes

package io.netty.util.internal;

import io.netty.util.internal.IntegerHolder;
import io.netty.util.internal.ThreadLocalRandom;
import io.netty.util.internal.TypeParameterMatcher;
import io.netty.util.internal.UnpaddedInternalThreadLocalMap;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Map;

public class InternalThreadLocalMap extends UnpaddedInternalThreadLocalMap
{
    protected InternalThreadLocalMap() {}
    public <E> java.util.ArrayList<E> arrayList(){ return null; }
    public <E> java.util.ArrayList<E> arrayList(int p0){ return null; }
    public IntegerHolder counterHashCode(){ return null; }
    public Map<Charset, CharsetDecoder> charsetDecoderCache(){ return null; }
    public Map<Charset, CharsetEncoder> charsetEncoderCache(){ return null; }
    public Map<Class<? extends Object>, Boolean> handlerSharableCache(){ return null; }
    public Map<Class<? extends Object>, Map<String, TypeParameterMatcher>> typeParameterMatcherFindCache(){ return null; }
    public Map<Class<? extends Object>, TypeParameterMatcher> typeParameterMatcherGetCache(){ return null; }
    public Object indexedVariable(int p0){ return null; }
    public Object removeIndexedVariable(int p0){ return null; }
    public StringBuilder stringBuilder(){ return null; }
    public ThreadLocalRandom random(){ return null; }
    public boolean isCleanerFlagSet(int p0){ return false; }
    public boolean isIndexedVariableSet(int p0){ return false; }
    public boolean setIndexedVariable(int p0, Object p1){ return false; }
    public int futureListenerStackDepth(){ return 0; }
    public int localChannelReaderStackDepth(){ return 0; }
    public int size(){ return 0; }
    public long rp1 = 0;
    public long rp2 = 0;
    public long rp3 = 0;
    public long rp4 = 0;
    public long rp5 = 0;
    public long rp6 = 0;
    public long rp7 = 0;
    public long rp8 = 0;
    public static InternalThreadLocalMap get(){ return null; }
    public static InternalThreadLocalMap getIfSet(){ return null; }
    public static Object UNSET = null;
    public static int VARIABLES_TO_REMOVE_INDEX = 0;
    public static int lastVariableIndex(){ return 0; }
    public static int nextVariableIndex(){ return 0; }
    public static void destroy(){}
    public static void remove(){}
    public void setCleanerFlag(int p0){}
    public void setCounterHashCode(IntegerHolder p0){}
    public void setFutureListenerStackDepth(int p0){}
    public void setLocalChannelReaderStackDepth(int p0){}
}
