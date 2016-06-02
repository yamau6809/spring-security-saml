package org.springframework.security.saml.web;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.auth.AuthScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.saml.metadata.CachingMetadataManager;

/**
 * @author Hidemoto Yamauchi
 */
public class C1ProxyClient extends HttpClient {
    private final Logger log = LoggerFactory.getLogger(C1ProxyClient.class);

    public C1ProxyClient() {
        super();
        log.info("Entering C1ProxyClient Constructor");
        this.getHostConfiguration().setProxy("proxy.kdc.capitalone.com", 8099);
        this.getState().setProxyCredentials(AuthScope.ANY, new UsernamePasswordCredentials("arj866", "Natuki76"));
        this.getParams().setAuthenticationPreemptive(true);
    }
}
