package org.springframework.security.saml.web;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.auth.AuthScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Hidemoto Yamauchi
 */
public class ProxyHttpClient extends HttpClient {
    private final Logger log = LoggerFactory.getLogger(ProxyHttpClient.class);

    public ProxyHttpClient() {
        super();
        log.info("Entering ProxyHttpClient Constructor");
        this.getHostConfiguration().setProxy("proxy.kdc.capitalone.com", 8099);
        this.getState().setProxyCredentials(AuthScope.ANY, new UsernamePasswordCredentials("arj866", "Natuki76"));
        this.getParams().setAuthenticationPreemptive(true);
    }
}
