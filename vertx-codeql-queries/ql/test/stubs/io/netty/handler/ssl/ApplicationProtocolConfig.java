// Generated automatically from io.netty.handler.ssl.ApplicationProtocolConfig for testing purposes

package io.netty.handler.ssl;

import java.util.List;

public class ApplicationProtocolConfig
{
    protected ApplicationProtocolConfig() {}
    public ApplicationProtocolConfig(ApplicationProtocolConfig.Protocol p0, ApplicationProtocolConfig.SelectorFailureBehavior p1, ApplicationProtocolConfig.SelectedListenerFailureBehavior p2, Iterable<String> p3){}
    public ApplicationProtocolConfig(ApplicationProtocolConfig.Protocol p0, ApplicationProtocolConfig.SelectorFailureBehavior p1, ApplicationProtocolConfig.SelectedListenerFailureBehavior p2, String... p3){}
    public ApplicationProtocolConfig.Protocol protocol(){ return null; }
    public ApplicationProtocolConfig.SelectedListenerFailureBehavior selectedListenerFailureBehavior(){ return null; }
    public ApplicationProtocolConfig.SelectorFailureBehavior selectorFailureBehavior(){ return null; }
    public List<String> supportedProtocols(){ return null; }
    public static ApplicationProtocolConfig DISABLED = null;
    static public enum Protocol
    {
        ALPN, NONE, NPN, NPN_AND_ALPN;
        private Protocol() {}
    }
    static public enum SelectedListenerFailureBehavior
    {
        ACCEPT, CHOOSE_MY_LAST_PROTOCOL, FATAL_ALERT;
        private SelectedListenerFailureBehavior() {}
    }
    static public enum SelectorFailureBehavior
    {
        CHOOSE_MY_LAST_PROTOCOL, FATAL_ALERT, NO_ADVERTISE;
        private SelectorFailureBehavior() {}
    }
}
