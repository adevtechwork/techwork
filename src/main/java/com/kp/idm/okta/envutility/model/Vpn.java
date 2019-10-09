
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
    "network",
    "message",
    "helpUrl"
})
public class Vpn {

    @JsonProperty("network")
    private Network network;
    @JsonProperty("message")
    private Object message;
    @JsonProperty("helpUrl")
    private Object helpUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("network")
    public Network getNetwork() {
        return network;
    }

    @JsonProperty("network")
    public void setNetwork(Network network) {
        this.network = network;
    }

    @JsonProperty("message")
    public Object getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Object message) {
        this.message = message;
    }

    @JsonProperty("helpUrl")
    public Object getHelpUrl() {
        return helpUrl;
    }

    @JsonProperty("helpUrl")
    public void setHelpUrl(Object helpUrl) {
        this.helpUrl = helpUrl;
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
