// Generated automatically from javax.net.ssl.TrustManagerFactorySpi for testing purposes

package javax.net.ssl;

import java.security.KeyStore;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;

abstract public class TrustManagerFactorySpi
{
    protected abstract TrustManager[] engineGetTrustManagers();
    protected abstract void engineInit(KeyStore p0);
    protected abstract void engineInit(ManagerFactoryParameters p0);
    public TrustManagerFactorySpi(){}
}
