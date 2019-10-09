
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
    "iOS",
    "web"
})
public class Hide {

    @JsonProperty("iOS")
    private Boolean iOS;
    @JsonProperty("web")
    private Boolean web;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("iOS")
    public Boolean getIOS() {
        return iOS;
    }

    @JsonProperty("iOS")
    public void setIOS(Boolean iOS) {
        this.iOS = iOS;
    }

    @JsonProperty("web")
    public Boolean getWeb() {
        return web;
    }

    @JsonProperty("web")
    public void setWeb(Boolean web) {
        this.web = web;
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
