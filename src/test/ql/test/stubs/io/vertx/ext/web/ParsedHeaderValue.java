// Generated automatically from io.vertx.ext.web.ParsedHeaderValue for testing purposes

package io.vertx.ext.web;

import java.util.Collection;
import java.util.Map;

public interface ParsedHeaderValue
{
    <T extends ParsedHeaderValue> T findMatchedBy(java.util.Collection<T> p0);
    Map<String, String> parameters();
    String parameter(String p0);
    String rawValue();
    String value();
    boolean isMatchedBy(ParsedHeaderValue p0);
    boolean isPermitted();
    float weight();
    int weightedOrder();
    static float DEFAULT_WEIGHT = 0;
}
