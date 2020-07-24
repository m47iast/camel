/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twilio;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.twilio.SipDomainEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SipDomainEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.twilio.SipDomainEndpointConfiguration target = (org.apache.camel.component.twilio.SipDomainEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.twilio.internal.TwilioApiName.class, value)); return true;
        case "domainname":
        case "DomainName": target.setDomainName(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "pathaccountsid":
        case "PathAccountSid": target.setPathAccountSid(property(camelContext, java.lang.String.class, value)); return true;
        case "pathsid":
        case "PathSid": target.setPathSid(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("ApiName", org.apache.camel.component.twilio.internal.TwilioApiName.class);
        answer.put("DomainName", java.lang.String.class);
        answer.put("MethodName", java.lang.String.class);
        answer.put("PathAccountSid", java.lang.String.class);
        answer.put("PathSid", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.twilio.SipDomainEndpointConfiguration target = (org.apache.camel.component.twilio.SipDomainEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": return target.getApiName();
        case "domainname":
        case "DomainName": return target.getDomainName();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "pathaccountsid":
        case "PathAccountSid": return target.getPathAccountSid();
        case "pathsid":
        case "PathSid": return target.getPathSid();
        default: return null;
        }
    }
}
