// Generated automatically from io.vertx.core.AbstractVerticle for testing purposes

package io.vertx.core;

import io.vertx.core.Context;
import io.vertx.core.Promise;
import io.vertx.core.Verticle;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import java.util.List;

abstract public class AbstractVerticle implements Verticle
{
    protected Context context = null;
    protected Vertx vertx = null;
    public AbstractVerticle(){}
    public JsonObject config(){ return null; }
    public List<String> processArgs(){ return null; }
    public String deploymentID(){ return null; }
    public Vertx getVertx(){ return null; }
    public void init(Vertx p0, Context p1){}
    public void start(){}
    public void start(Promise<Void> p0){}
    public void stop(){}
    public void stop(Promise<Void> p0){}
}
