// Generated automatically from javax.net.ssl.KeyManagerFactorySpi for testing purposes

package javax.net.ssl;

import java.security.KeyStore;
import javax.net.ssl.KeyManager;
import javax.net.ssl.ManagerFactoryParameters;

abstract public class KeyManagerFactorySpi
{
    protected abstract KeyManager[] engineGetKeyManagers();
    protected abstract void engineInit(KeyStore p0, char[] p1);
    protected abstract void engineInit(ManagerFactoryParameters p0);
    public KeyManagerFactorySpi(){}
}
