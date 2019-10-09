
package com.kp.idm.okta.envutility.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "client_uri",
    "logo_uri",
    "redirect_uris",
    "response_types",
    "grant_types",
    "initiate_login_uri",
    "application_type",
    "issuer_mode"
})
public class OauthClient_ {

    @JsonProperty("client_uri")
    private Object clientUri;
    @JsonProperty("logo_uri")
    private Object logoUri;
    @JsonProperty("redirect_uris")
    private List<String> redirectUris = null;
    @JsonProperty("response_types")
    private List<String> responseTypes = null;
    @JsonProperty("grant_types")
    private List<String> grantTypes = null;
    @JsonProperty("initiate_login_uri")
    private String initiateLoginUri;
    @JsonProperty("application_type")
    private String applicationType;
    @JsonProperty("issuer_mode")
    private String issuerMode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("client_uri")
    public Object getClientUri() {
        return clientUri;
    }

    @JsonProperty("client_uri")
    public void setClientUri(Object clientUri) {
        this.clientUri = clientUri;
    }

    @JsonProperty("logo_uri")
    public Object getLogoUri() {
        return logoUri;
    }

    @JsonProperty("logo_uri")
    public void setLogoUri(Object logoUri) {
        this.logoUri = logoUri;
    }

    @JsonProperty("redirect_uris")
    public List<String> getRedirectUris() {
        return redirectUris;
    }

    @JsonProperty("redirect_uris")
    public void setRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
    }

    @JsonProperty("response_types")
    public List<String> getResponseTypes() {
        return responseTypes;
    }

    @JsonProperty("response_types")
    public void setResponseTypes(List<String> responseTypes) {
        this.responseTypes = responseTypes;
    }

    @JsonProperty("grant_types")
    public List<String> getGrantTypes() {
        return grantTypes;
    }

    @JsonProperty("grant_types")
    public void setGrantTypes(List<String> grantTypes) {
        this.grantTypes = grantTypes;
    }

    @JsonProperty("initiate_login_uri")
    public String getInitiateLoginUri() {
        return initiateLoginUri;
    }

    @JsonProperty("initiate_login_uri")
    public void setInitiateLoginUri(String initiateLoginUri) {
        this.initiateLoginUri = initiateLoginUri;
    }

    @JsonProperty("application_type")
    public String getApplicationType() {
        return applicationType;
    }

    @JsonProperty("application_type")
    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    @JsonProperty("issuer_mode")
    public String getIssuerMode() {
        return issuerMode;
    }

    @JsonProperty("issuer_mode")
    public void setIssuerMode(String issuerMode) {
        this.issuerMode = issuerMode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
