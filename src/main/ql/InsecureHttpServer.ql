/**
 * @name Use of insecure HTTP server
 * @description The Vert.x HTTP server establishes connections which are not secured using SSL/TLS.
 * @kind problem
 * @problem.severity high
 * @id java/vertx/insecure-http-server
 * @tags security java/vertx
 */

import java

class Vertx extends RefType {
  Vertx() {
    this.getASourceSupertype*().hasQualifiedName("io.vertx.core", "Vertx")
  }
}

class VertxCreateHttpServerMethodAccess extends MethodAccess {
  VertxCreateHttpServerMethodAccess() {
    exists(Method m |
      this.getMethod() = m and
      m.getName().matches("createHttpServer") and
      m.getDeclaringType() instanceof Vertx
    )
  }
}

// TODO: This does not cover HttpOptions being passed.

from VertxCreateHttpServerMethodAccess call
where
  not call.getEnclosingCallable().getDeclaringType() instanceof Vertx and
  not call.getLocation().getFile().getRelativePath().matches("%src/test/%") and
  call.getNumArgument() = 0
select
  call,
  "Insecure HTTP server which allows unencrypted HTTP connections"
