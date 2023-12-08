// Generated automatically from javax.net.ssl.X509KeyManager for testing purposes

package javax.net.ssl;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;

public interface X509KeyManager extends KeyManager
{
    PrivateKey getPrivateKey(String p0);
    String chooseClientAlias(String[] p0, Principal[] p1, Socket p2);
    String chooseServerAlias(String p0, Principal[] p1, Socket p2);
    String[] getClientAliases(String p0, Principal[] p1);
    String[] getServerAliases(String p0, Principal[] p1);
    X509Certificate[] getCertificateChain(String p0);
}
