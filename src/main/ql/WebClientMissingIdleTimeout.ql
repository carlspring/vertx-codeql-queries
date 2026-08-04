/**
 * @name WebClient created without idle timeout
 * @description A WebClient is created without a WebClientOptions that sets an explicit idle timeout.
 *              This can lead to connections hanging indefinitely, potentially exhausting resources.
 * @kind problem
 * @problem.severity warning
 * @precision high
 * @security-severity 5.0
 * @id java/vertx/webclient-missing-idle-timeout
 * @tags security java/vertx reliability
 */

import java

class WebClient extends RefType {
  WebClient() {
    this.getASourceSupertype*().hasQualifiedName("io.vertx.ext.web.client", "WebClient")
  }
}

class WebClientOptions extends RefType {
  WebClientOptions() {
    this.getASourceSupertype*().hasQualifiedName("io.vertx.ext.web.client", "WebClientOptions")
  }
}

class WebClientCreateMethodAccess extends MethodAccess {
  WebClientCreateMethodAccess() {
    exists(Method m |
      this.getMethod() = m and
      m.getName() = "create" and
      m.getDeclaringType() instanceof WebClient
    )
  }
}

class SetIdleTimeoutMethodAccess extends MethodAccess {
  SetIdleTimeoutMethodAccess() {
    exists(Method m |
      this.getMethod() = m and
      m.getName() = "setIdleTimeout" and
      m.getDeclaringType() instanceof WebClientOptions
    )
  }
}

/**
 * Holds if the given WebClientOptions variable has setIdleTimeout called on it.
 */
predicate optionsHasIdleTimeout(Variable optionsVar) {
  exists(SetIdleTimeoutMethodAccess setCall |
    setCall.getQualifier().(VarAccess).getVariable() = optionsVar
  )
}

from WebClientCreateMethodAccess call
where
  not call.getEnclosingCallable().getDeclaringType() instanceof WebClient and
  not call.getLocation().getFile().getRelativePath().matches("%/src/test/%") and
  (
    // No WebClientOptions argument at all
    call.getNumArgument() < 2
    or
    // A WebClientOptions is passed but setIdleTimeout was never called on it
    exists(Variable optionsVar |
      call.getArgument(1).(VarAccess).getVariable() = optionsVar and
      optionsVar.getType() instanceof WebClientOptions and
      not optionsHasIdleTimeout(optionsVar)
    )
  )
select
  call,
  "WebClient is created without a WebClientOptions that sets an explicit idle timeout."
