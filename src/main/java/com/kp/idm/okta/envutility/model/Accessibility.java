
package com.kp.idm.okta.envutility.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "selfService",
    "errorRedirectUrl",
    "loginRedirectUrl"
})
public class Accessibility {

    @JsonProperty("selfService")
    private Boolean selfService;
    @JsonProperty("errorRedirectUrl")
    private Object errorRedirectUrl;
    @JsonProperty("loginRedirectUrl")
    private Object loginRedirectUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("selfService")
    public Boolean getSelfService() {
        return selfService;
    }

    @JsonProperty("selfService")
    public void setSelfService(Boolean selfService) {
        this.selfService = selfService;
    }

    @JsonProperty("errorRedirectUrl")
    public Object getErrorRedirectUrl() {
        return errorRedirectUrl;
    }

    @JsonProperty("errorRedirectUrl")
    public void setErrorRedirectUrl(Object errorRedirectUrl) {
        this.errorRedirectUrl = errorRedirectUrl;
    }

    @JsonProperty("loginRedirectUrl")
    public Object getLoginRedirectUrl() {
        return loginRedirectUrl;
    }

    @JsonProperty("loginRedirectUrl")
    public void setLoginRedirectUrl(Object loginRedirectUrl) {
        this.loginRedirectUrl = loginRedirectUrl;
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
