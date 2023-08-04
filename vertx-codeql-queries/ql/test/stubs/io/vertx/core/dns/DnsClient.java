// Generated automatically from io.vertx.core.dns.DnsClient for testing purposes

package io.vertx.core.dns;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.dns.MxRecord;
import io.vertx.core.dns.SrvRecord;
import java.util.List;

public interface DnsClient
{
    DnsClient lookup(String p0, Handler<AsyncResult<String>> p1);
    DnsClient lookup4(String p0, Handler<AsyncResult<String>> p1);
    DnsClient lookup6(String p0, Handler<AsyncResult<String>> p1);
    DnsClient resolveA(String p0, Handler<AsyncResult<List<String>>> p1);
    DnsClient resolveAAAA(String p0, Handler<AsyncResult<List<String>>> p1);
    DnsClient resolveCNAME(String p0, Handler<AsyncResult<List<String>>> p1);
    DnsClient resolveMX(String p0, Handler<AsyncResult<List<MxRecord>>> p1);
    DnsClient resolveNS(String p0, Handler<AsyncResult<List<String>>> p1);
    DnsClient resolvePTR(String p0, Handler<AsyncResult<String>> p1);
    DnsClient resolveSRV(String p0, Handler<AsyncResult<List<SrvRecord>>> p1);
    DnsClient resolveTXT(String p0, Handler<AsyncResult<List<String>>> p1);
    DnsClient reverseLookup(String p0, Handler<AsyncResult<String>> p1);
    Future<List<MxRecord>> resolveMX(String p0);
    Future<List<SrvRecord>> resolveSRV(String p0);
    Future<List<String>> resolveA(String p0);
    Future<List<String>> resolveAAAA(String p0);
    Future<List<String>> resolveCNAME(String p0);
    Future<List<String>> resolveNS(String p0);
    Future<List<String>> resolveTXT(String p0);
    Future<String> lookup(String p0);
    Future<String> lookup4(String p0);
    Future<String> lookup6(String p0);
    Future<String> resolvePTR(String p0);
    Future<String> reverseLookup(String p0);
}
