// Generated automatically from io.vertx.ext.web.LanguageHeader for testing purposes

package io.vertx.ext.web;

import io.vertx.ext.web.ParsedHeaderValue;

public interface LanguageHeader extends ParsedHeaderValue
{
    String subtag();
    String subtag(int p0);
    String tag();
    int subtagCount();
}
