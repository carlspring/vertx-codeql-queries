/**
 * @name Invocation of VertX.vertx()
 * @description The VertX.vertx() method should not be invoked directly.
 * @kind problem
 * @problem.severity high
 * @id java/vertx/invocation-of-vertx-vertx
 * @tags security java/vertx
 */

import java

class Vertx extends RefType {
  Vertx() {
    this.getASourceSupertype*().hasQualifiedName("io.vertx.core", "Vertx")
  }
}

class VertxVertxMethodAccess extends MethodAccess {
  VertxVertxMethodAccess() {
    exists(Method m |
      this.getMethod() = m and
      m.getName().matches("vertx") and
      m.getDeclaringType() instanceof Vertx
    )
  }
}

from VertxVertxMethodAccess call
where
  not call.getEnclosingCallable().getDeclaringType() instanceof Vertx and
  not call.getLocation().getFile().getRelativePath().matches("%src/test/%") and
  call.getNumArgument() = 0
select
  call,
  "Invocation of VertX.vertx()"
