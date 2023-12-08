// Generated automatically from io.vertx.core.buffer.Buffer for testing purposes

package io.vertx.core.buffer;

import io.netty.buffer.ByteBuf;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.shareddata.Shareable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public interface Buffer extends Shareable, io.vertx.core.shareddata.ClusterSerializable
{
    Buffer appendBuffer(Buffer p0);
    Buffer appendBuffer(Buffer p0, int p1, int p2);
    Buffer appendByte(byte p0);
    Buffer appendBytes(byte[] p0);
    Buffer appendBytes(byte[] p0, int p1, int p2);
    Buffer appendDouble(double p0);
    Buffer appendFloat(float p0);
    Buffer appendInt(int p0);
    Buffer appendIntLE(int p0);
    Buffer appendLong(long p0);
    Buffer appendLongLE(long p0);
    Buffer appendMedium(int p0);
    Buffer appendMediumLE(int p0);
    Buffer appendShort(short p0);
    Buffer appendShortLE(short p0);
    Buffer appendString(String p0);
    Buffer appendString(String p0, String p1);
    Buffer appendUnsignedByte(short p0);
    Buffer appendUnsignedInt(long p0);
    Buffer appendUnsignedIntLE(long p0);
    Buffer appendUnsignedShort(int p0);
    Buffer appendUnsignedShortLE(int p0);
    Buffer copy();
    Buffer getBuffer(int p0, int p1);
    Buffer getBytes(byte[] p0);
    Buffer getBytes(byte[] p0, int p1);
    Buffer getBytes(int p0, int p1, byte[] p2);
    Buffer getBytes(int p0, int p1, byte[] p2, int p3);
    Buffer setBuffer(int p0, Buffer p1);
    Buffer setBuffer(int p0, Buffer p1, int p2, int p3);
    Buffer setByte(int p0, byte p1);
    Buffer setBytes(int p0, ByteBuffer p1);
    Buffer setBytes(int p0, byte[] p1);
    Buffer setBytes(int p0, byte[] p1, int p2, int p3);
    Buffer setDouble(int p0, double p1);
    Buffer setFloat(int p0, float p1);
    Buffer setInt(int p0, int p1);
    Buffer setIntLE(int p0, int p1);
    Buffer setLong(int p0, long p1);
    Buffer setLongLE(int p0, long p1);
    Buffer setMedium(int p0, int p1);
    Buffer setMediumLE(int p0, int p1);
    Buffer setShort(int p0, short p1);
    Buffer setShortLE(int p0, short p1);
    Buffer setString(int p0, String p1);
    Buffer setString(int p0, String p1, String p2);
    Buffer setUnsignedByte(int p0, short p1);
    Buffer setUnsignedInt(int p0, long p1);
    Buffer setUnsignedIntLE(int p0, long p1);
    Buffer setUnsignedShort(int p0, int p1);
    Buffer setUnsignedShortLE(int p0, int p1);
    Buffer slice();
    Buffer slice(int p0, int p1);
    ByteBuf getByteBuf();
    JsonArray toJsonArray();
    JsonObject toJsonObject();
    String getString(int p0, int p1);
    String getString(int p0, int p1, String p2);
    String toString();
    String toString(Charset p0);
    String toString(String p0);
    byte getByte(int p0);
    byte[] getBytes();
    byte[] getBytes(int p0, int p1);
    default Object toJson(){ return null; }
    double getDouble(int p0);
    float getFloat(int p0);
    int getInt(int p0);
    int getIntLE(int p0);
    int getMedium(int p0);
    int getMediumLE(int p0);
    int getUnsignedMedium(int p0);
    int getUnsignedMediumLE(int p0);
    int getUnsignedShort(int p0);
    int getUnsignedShortLE(int p0);
    int length();
    long getLong(int p0);
    long getLongLE(int p0);
    long getUnsignedInt(int p0);
    long getUnsignedIntLE(int p0);
    short getShort(int p0);
    short getShortLE(int p0);
    short getUnsignedByte(int p0);
    static Buffer buffer(){ return null; }
    static Buffer buffer(ByteBuf p0){ return null; }
    static Buffer buffer(String p0){ return null; }
    static Buffer buffer(String p0, String p1){ return null; }
    static Buffer buffer(byte[] p0){ return null; }
    static Buffer buffer(int p0){ return null; }
}
