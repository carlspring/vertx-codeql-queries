// Generated automatically from io.vertx.ext.web.ParsedHeaderValues for testing purposes

package io.vertx.ext.web;

import io.vertx.ext.web.LanguageHeader;
import io.vertx.ext.web.MIMEHeader;
import io.vertx.ext.web.ParsedHeaderValue;
import java.util.Collection;
import java.util.List;

public interface ParsedHeaderValues
{
    List<LanguageHeader> acceptLanguage();
    List<MIMEHeader> accept();
    List<ParsedHeaderValue> acceptCharset();
    List<ParsedHeaderValue> acceptEncoding();
    MIMEHeader contentType();
    MIMEHeader findBestUserAcceptedIn(List<MIMEHeader> p0, Collection<MIMEHeader> p1);
}
