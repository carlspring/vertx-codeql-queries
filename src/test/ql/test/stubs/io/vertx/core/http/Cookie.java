// Generated automatically from io.vertx.core.http.Cookie for testing purposes

package io.vertx.core.http;

import io.vertx.core.http.CookieSameSite;

public interface Cookie
{
    Cookie setDomain(String p0);
    Cookie setHttpOnly(boolean p0);
    Cookie setMaxAge(long p0);
    Cookie setPath(String p0);
    Cookie setSameSite(CookieSameSite p0);
    Cookie setSecure(boolean p0);
    Cookie setValue(String p0);
    CookieSameSite getSameSite();
    String encode();
    String getDomain();
    String getName();
    String getPath();
    String getValue();
    boolean isHttpOnly();
    boolean isSecure();
    long getMaxAge();
    static Cookie cookie(String p0, String p1){ return null; }
}
