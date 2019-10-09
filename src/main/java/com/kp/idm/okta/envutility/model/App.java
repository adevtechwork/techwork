
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
    "acsUrl",
    "audRestriction",
    "baseUrl"
})
public class App {

    @JsonProperty("acsUrl")
    private Object acsUrl;
    @JsonProperty("audRestriction")
    private Object audRestriction;
    @JsonProperty("baseUrl")
    private String baseUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("acsUrl")
    public Object getAcsUrl() {
        return acsUrl;
    }

    @JsonProperty("acsUrl")
    public void setAcsUrl(Object acsUrl) {
        this.acsUrl = acsUrl;
    }

    @JsonProperty("audRestriction")
    public Object getAudRestriction() {
        return audRestriction;
    }

    @JsonProperty("audRestriction")
    public void setAudRestriction(Object audRestriction) {
        this.audRestriction = audRestriction;
    }

    @JsonProperty("baseUrl")
    public String getBaseUrl() {
        return baseUrl;
    }

    @JsonProperty("baseUrl")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
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
